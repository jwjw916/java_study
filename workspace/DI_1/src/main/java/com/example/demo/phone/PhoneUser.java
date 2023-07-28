package com.example.demo.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class PhoneUser {
	// 전화기를 쓰고 싶다! = Has a 관계
	// phone을 바꾸면 내 클래스에 영향을 준다 = PhoneUser의 의존성
	private Phone phone;
	
	@Autowired
	public PhoneUser(@Qualifier("iPhone") Phone p) {
		this.phone= p;
	}
	
	public void setPhone(Phone p) {
		this.phone = p;
	}
	
	public void call(String to) {
		System.out.println(phone.getClass().getName()+"으로 전화");
	}
}
