package com.woorifis.webday3.model;

public class MyLoginService {
	// 2 - singleton 패턴 (private 생성자+객체, static 호출)
	
	private static MyLoginService service = new MyLoginService();
	private MyLoginService() {}
	
	public static MyLoginService getService() {
		return service;
	}
	
	// 1 - 기능만 필요한 클래스 (stateless)
	public boolean login(String ID, String PW) {
		return "hong".equals(ID) && "1234".equals(PW);
	}
}
