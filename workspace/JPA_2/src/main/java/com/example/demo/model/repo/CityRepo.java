package com.example.demo.model.repo;

import java.util.List;

import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entity.City;

public interface CityRepo extends JpaRepository<City, Long>{
	List<City> findByNameLike(String namePattern);
	//이름 기반으로 == 검색하기
	List<City> findByName(String name);
	List<City> findByCountrycode_codeAndPopulationGreaterThan(String code, int number);
	List<City> findByPopulationBetween(int p1, int p2);
	// 연관관계의 객체 속성 활용
	List<City> findByPopulationGreaterThan(int number, Sort sort);
	// sort 객체 활용
	Page<City> findByPopulationGreaterThan(int pop, Pageable page);
	// page 객체 활용
}
