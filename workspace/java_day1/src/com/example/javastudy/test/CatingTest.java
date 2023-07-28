package com.example.javastudy.test;

public class CatingTest {

	public static void main(String[] args) {
		int i = 10000;
		float d = i ; //값손실 없음: 묵시적 형변환
		System.out.println(d);

		long l = (long)d;
		System.out.println(l);
	}

}
