package com.example.demo.car;

import org.springframework.stereotype.Component;

@Component
// 클래스 이름을 리팩토링하면 component를 못찾게 됨
// value 설정 해주기 Component("ferrari")
public class Ferrari implements Car {

	@Override
	public void drive() {
			System.out.println("풰라리이즈마이드림카");
		}
		
	}


