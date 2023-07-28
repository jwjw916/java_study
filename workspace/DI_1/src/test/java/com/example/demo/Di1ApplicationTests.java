package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.Heroes.Heroes;
import com.example.demo.car.Car;
import com.example.demo.car.DriveCar;
import com.example.demo.phone.GalaxyFold;
import com.example.demo.phone.Phone;
import com.example.demo.phone.iPhone;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class Di1ApplicationTests {

	@Test
	void contextLoads() {
		Calculator c = new Calculator();
		int result = c.add(100, 300);
		Assertions.assertEquals(result, 400);
		Assertions.assertEquals(c.add(1, 5), 6);
	}
	
	@Autowired // 해당 타입의 빈을 가져오세요!!
	ApplicationContext ctx;
	
	@Test
	public void beanTest() {
		String [] beanNames = ctx.getBeanDefinitionNames();
		for(String name: beanNames) {
			log.debug("name: {}", name);
		}
	}
	
	@Test
	public void getBeanTest() {
		// 타입 기반으로 빈 요청
		iPhone iphone = ctx.getBean(iPhone.class);
		// 빈의 이름으로 클래스에 접근하면 바로 메소드 접근
//		iphone.call("010");
		

		Assertions.assertNotNull(iphone);
		
		// 이름 기반으로 빈 요청
		Object obj =ctx.getBean("galaxy");
		// 이름으로 접근해서 형변환하면 복잡해짐
//		if(obj instanceof GalaxyFold) {
//			GalaxyFold g = (GalaxyFold)obj;
		
		Assertions.assertNotNull(obj);
	
	}

	@Test
	public void getBeanTest2(){
//		Phone p = ctx.getBean(Phone.class); 타입기반으로 하니깐 인터페이스는 선택 불가..
		Phone p = ctx.getBean("galaxy", Phone.class);
		Assertions.assertNotNull(p);
	}
	


}

















