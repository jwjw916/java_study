package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.bean.SimpleBean;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
class AopApplicationTests {

	@Autowired
	SimpleBean sbean;
	
	@Test
	public void beanTest() {
		Assertions.assertNotNull(sbean);
	}
	
	@Test
	public void nameTest() {
		String name = "장길산";
		Assertions.assertEquals(sbean.getName(), "홍길동");
		sbean.setName(name);
		Assertions.assertEquals(sbean.getName(), name);
		log.debug("sbean의 타입은: {}", sbean.getClass().getSimpleName());
	}
	
	@Test
	public void setCalTest() {
		Calendar now = Calendar.getInstance();
		sbean.setNow(now);
		assertEquals(now, sbean.getNow());
	}
	
	
	@Test
	void contextLoads() {
	}

}
