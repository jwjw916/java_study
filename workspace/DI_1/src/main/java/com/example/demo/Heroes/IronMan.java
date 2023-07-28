package com.example.demo.Heroes;

import org.springframework.stereotype.Component;

@Component("iman") // 클래스가 리팩토링되니깐 이름기반이라면 첨부터 fix
public class IronMan implements Heroes{

	@Override
	public void help() {
		System.out.println("아이언맨 출동");
		
	} 
	

}
