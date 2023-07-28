package com.woorifis.day2.controller;

import java.util.ArrayList;
import java.util.List;

public class MakeGugu {
	
	// 2 - 그러면 싱글톤 패턴이지. 미리 객체를 private & getter & static 으로 만들어보자
	private static MakeGugu gugu =new MakeGugu();
	
	private MakeGugu() {};
	
	public static MakeGugu getInstance() {
		return gugu;
	}

	// 1 - 만들고 보니 객체가 필요없고 기능만 하는 함수네
	public List<Integer> getGugu(int dan){
		List<Integer> gugu = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			gugu.add(dan * (i + 1));
		}
		return gugu;
	}

}
