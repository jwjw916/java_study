package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Heroes.Avengers;
import com.example.demo.Heroes.Hulk;
import com.example.demo.Heroes.HulkBuster;
import com.example.demo.Heroes.IronMan;

@SpringBootTest
public class AvengersTest {

	@Autowired
	Hulk hulk;

	@Autowired
	@Qualifier("iman")
	IronMan iman;
	
	@Autowired
	HulkBuster hbuster;
	
	@Autowired
	Avengers avengers;
	
	@Test
	public void avengersTest() {
		Assertions.assertNotNull(avengers);
		String pass = avengers.doorpassword;
		Assertions.assertEquals(pass, "13413413");
	}
	
	@Test
	public void ironManTest() {
		Assertions.assertNotNull(iman); ;
	}
	
	@Test
	public void beanTest() {
		Assertions.assertNotNull(hbuster);
		hbuster.help();
	}
	
}
