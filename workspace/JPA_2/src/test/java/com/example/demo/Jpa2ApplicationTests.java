package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.entity.City;
import com.example.demo.model.entity.Country;

import jakarta.persistence.EntityManager;

@DataJpaTest //JPA 테스트할땐 이거
@AutoConfigureTestDatabase(replace = Replace.NONE)
class Jpa2ApplicationTests {
	@Autowired
	EntityManager em;
	
	@Test
	public void cityTest(){
		City city = em.find(City.class, 1);
		Assertions.assertEquals(city.getName(),"Kabul");
		
		
		Country country = city.getCountrycode();
		Assertions.assertEquals(country.getName(), "Afghanistan");
		
		
	}
	
	@Test
	public void countryTest(){
		Country country = em.find(Country.class, "ABW");
		Assertions.assertEquals(country.getName(),"Aruba");
	}

	@Test
	void contextLoads() {
	}

}
