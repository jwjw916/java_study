package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.example.demo.model.entity.City;
import com.example.demo.model.entity.Country;
import com.example.demo.model.repo.CityRepo;
import com.example.demo.model.repo.CountryRepo;

import lombok.extern.slf4j.Slf4j;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Slf4j
public class CityRepoTest {

	@Autowired
	CityRepo cityRepo;
	
	@Autowired
	CountryRepo countryrepo;
	
	@Test
	public void beanTest() {
		log.debug("repo: {}", cityRepo.getClass().getName());
		// repo: jdk.proxy2.$Proxy105 - AOP에서 봤는데..?
	}
	@Test
	public void crudTest() {
		// city가 포함될 country가 필요
		Country c = countryrepo.findById("ABW").get();
		long cnt = cityRepo.count();
		log.debug("현재건수:{}", cnt);
		// 새로 추가할 도시 구성
		City city = City.builder().name("내도시").district("Asia").countrycode(c).build();
		cityRepo.saveAndFlush(city); // 저장후 반영
		long cnt2 = cityRepo.count();
		Assertions.assertEquals(cnt+1, cnt2);
		
		// select
		City selected = cityRepo.findById(city.getId()).get();
		Assertions.assertEquals(city, selected);
		
		
		// update
		selected.setName("너네도시");
		cityRepo.saveAndFlush(city);
		
		// select
		City selected2 = cityRepo.findById(city.getId()).get();
		Assertions.assertEquals(selected2.getName(), "너네도시");
		
		
		// delete
		cityRepo.delete(selected2);
		cityRepo.flush();
		Assertions.assertTrue(cityRepo.findById(city.getId()).isEmpty());
		
	
		}
	
	
	@Test
	public void byNameTest() {
		List<City> cities = cityRepo.findByNameLike("%at%");
		
		Assertions.assertEquals(cities.size(),216);	
		City city = cities.get(0);
		log.debug("이제 도시의 국가를 조회해보자.");
		String countryName = city.getCountrycode().getName();
		Assertions.assertEquals("Afghanistan", countryName);
		
	}
	
	@Test
	public void byGreaterTest() {
		List<City> cities2 = cityRepo.findByCountrycode_codeAndPopulationGreaterThan("ARG", 100);
		Assertions.assertEquals(cities2.size(), 57);
}
	
	
	@Test
	public void byBetweenTest() {
		List<City> cities3 = cityRepo.findByPopulationBetween(100, 10000);
		Assertions.assertEquals(cities3.size(), 41);
	}
	
	
	@Test
	public void bySortTest() {
		Sort sortByName = Sort.by(Direction.DESC, "name");
		List<City> cities4 = cityRepo.findByPopulationGreaterThan(1000000, sortByName);
		Assertions.assertEquals(cities4.size(), 237);
		Assertions.assertEquals(cities4.get(0).getName(), "Zibo");
		Assertions.assertEquals(cities4.get(236).getName(), "Abidjan");
	}
	
	@Test
	public void pagingTest() {
		Pageable pageable = PageRequest.of(0, 10, Sort.Direction.ASC, "name");
		Page<City> pages = cityRepo.findByPopulationGreaterThan(1000000, pageable);
		List<City> cities = pages.getContent();
		Assertions.assertEquals(cities.size(), 10); // 한페이지당 size
		Assertions.assertEquals(cities.get(0).getName(), "Abidjan");
		Assertions.assertEquals(cities.get(2).getName(), "Adana");
		Assertions.assertEquals(pages.getTotalPages(), 24);
}
}