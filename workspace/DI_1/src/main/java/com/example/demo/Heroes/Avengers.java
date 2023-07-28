package com.example.demo.Heroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Avengers {
	// IronMan iman - setter로 빈 주입
	// Hulk hulk - 생성자로 빈 주입
	
	private IronMan iman;	
	private Hulk hulk;		//HULK -> 그대로 컴포넌트 이름이 된다
	private Heroes hero;
	
	
	@Value("${doorPass}") // 주기적으로 값이 바뀔때 편하겠죵
	public String doorpassword; // 빈x , 스칼라 값
	
	public Avengers() {}
	
	@Autowired
	public Avengers(@Qualifier("hulk")Heroes hero) { //클래스이름이 파스칼이라서 앞에 소문자로 변경됨
		this.hero = hero;
	}
	
	@Autowired
	public void setHeroes(@Qualifier("hulkBuster")IronMan iman) {
		this.iman = iman;
	}
	
}
