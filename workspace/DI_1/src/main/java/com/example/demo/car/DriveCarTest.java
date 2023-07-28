package com.example.demo.car;

public class DriveCarTest {
	public static void main(String[] args) {
//		DriveCar dc = new DriveCar();
		DriveCar dc = new DriveCar(CarFactory.getCar("s")); 
		dc.move("람보르기니");
		// 차가 바뀌어도 클래스 코드가 바뀔일이 없다 =  의존성 제거
	}
}
