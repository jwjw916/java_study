package com.woorifis.webday3.model;

public class MyCakeService {
	// 2 - singleton 패턴 (private 생성자+객체, static 호출)
	
	private static MyCakeService service = new MyCakeService();
	private MyCakeService() {}
	
	public static MyCakeService getService() {
		return service;
	}
	
	// 1 - 기능만 필요한 클래스 (stateless)
	public int add(int a, int b) {
		return a +  b;
	}
	
	public int multi(int a, int b) {
		return a * b;
	}
}
