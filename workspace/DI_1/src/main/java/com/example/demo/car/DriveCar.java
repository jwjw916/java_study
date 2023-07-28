package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DriveCar {
	// 쓰고 싶다 = has a 관계
	//차 바꿀때마다 바꿔야됨 = 의존성
	// Teslar car;

	Car car;

	public DriveCar() {}
	
	
	@Autowired
	public DriveCar(@Qualifier("teslar") Car car) { // 생성자를 통한 빈 주입
		// new가 사서쓴다는거면, 이제 new 하지 않고 Car에서 빌려씀
		// this.car = new Teslar();
		this.car = car;
	}
	
	
	public void setCar(Car car) { // setter를 통한 빈 주입
		this.car = car;
	}
	

	public void move(String to) {
		car.drive();
		System.out.println(to + "로 gogogogogogo");
	}

}
