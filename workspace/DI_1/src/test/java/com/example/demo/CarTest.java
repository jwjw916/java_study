package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.car.Car;
import com.example.demo.car.DriveCar;
import com.example.demo.car.Ferrari;

@SpringBootTest
public class CarTest {

	@Autowired
	ApplicationContext ctx;
	
	@Test
	public void beanCreationTest() {
		Ferrari f = ctx.getBean(Ferrari.class);
		
	}
	
	
	@Test
	public void getBeanTest(){
		Car car = ctx.getBean("teslar", Car.class);
		Assertions.assertNotNull(car);
	}
	
	@Test
	public void getBeanTest2(){
		DriveCar car = ctx.getBean("dc", DriveCar.class);
		Assertions.assertNotNull(car);
	}
	
	@Test
	public void singletonTest(){
		Ferrari f1 = ctx.getBean(Ferrari.class);
		Ferrari f2 = ctx.getBean(Ferrari.class);
		Ferrari f3 = ctx.getBean("ferrari", Ferrari.class);
		Assertions.assertEquals(f1, f2); // 같은 내용?
		// 스프링에서의 빈들은 singeleton으로 관리된다!!
		Assertions.assertEquals(f2, f3); // 같은 객체 참조?
		Assertions.assertEquals(f1, f3); // 같은 객체 참조?
	}
	 
}
