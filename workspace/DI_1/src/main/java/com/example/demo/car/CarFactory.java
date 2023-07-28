package com.example.demo.car;

public class CarFactory {
	// 필요할 때마다 쓸거니까 공급망 만들기
	public static Car getCar(String name) {
		if(name.equals("T")) {
			return new Teslar();
		} else {
			return new Ferrari();
		}
	}
}
