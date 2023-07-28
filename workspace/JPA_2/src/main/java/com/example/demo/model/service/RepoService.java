package com.example.demo.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.dto.CityDto;
import com.example.demo.model.entity.City;
import com.example.demo.model.entity.Country;
import com.example.demo.model.repo.CityRepo;
import com.example.demo.model.repo.CountryRepo;

import jakarta.transaction.Transactional;

@Service
public class RepoService {

	public String helloService(String name) {
		return "Hello " + name;
	}

	// 한 도시를 등록하면 그 도시의 자매도시도 등록한다.
	@Autowired
	CityRepo cityRepo;

	@Autowired
	CountryRepo countryRepo;

	@Transactional
	public void saveCity(String countryCode, String name) {
		// 1. 국가를 데려온다
		Country country = countryRepo.findById(countryCode).get();

		// 2. 등록할 도시를 만든다
		City city = City.builder().name(name).countrycode(country).population(0).district("Asia").build();

		City city2 = City.builder().name(name + "자매").countrycode(country).population(0).district("Asia").build();

		cityRepo.save(city);
		cityRepo.save(city2);
	}

	public City selectCity(long no) {
		Optional<City> city = cityRepo.findById(no);
		if (city.isPresent()) {
			return city.get();
		} else {
			return null;
		}
	}

	public City login(String id, String pass) {
		List<City> cities = cityRepo.findByName(id);
		for (City c : cities) {
			if (c.getDistrict().equals(pass)) {
				return c;
			}

		}
		return null;
	}
	
	// Entity는 Service 뒤쪽에서만, Service 앞쪽은 Dto로 사용
	public CityDto registCity(CityDto dto) {
		Optional<Country> country = countryRepo.findById(dto.getCountrycode());
		if(country.isEmpty()) {
			return null;
		}else {
			Country c = country.get();
			City city= dto.toEntity();
			city.setCountrycode(c);
			cityRepo.saveAndFlush(city);
			return city.toDto();
		}
	}
	
	public List<CityDto> list(){
		List<City> cities = cityRepo.findAll(Sort.by(Sort.Direction.DESC,"id"));
		List<CityDto> dtos = new ArrayList<>();
		for(City c: cities) {
			dtos.add(c.toDto());
		}
		return dtos;
	}
	
	
	
}

