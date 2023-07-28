package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Before("execution( void com..*.set*(*))") //before 시점에서 pointcut 필터 넣어주기
	public void logging() { // advice
		// 횡단 관심 코드
		System.out.println("set 메서드 호출됨");
	}
}
