package ch07.poly;

import ch07.a_extend.spider.Person;
import ch07.a_extend.spider.SpiderMan;

public class PolyTest {

public static void main(String[] args) {	
	SpiderMan sman = new SpiderMan("Peter");
	SpiderMan man = sman;
	Person person = sman; // 조상 타입으로 자식 참조 가능
	Object obj = sman; // 자바의 객체는 모두 Object
	
	Object [] objs = new Object[3];
	objs[0] = sman;
	objs[1] = "Hello";
	objs[2] = 2; // 기본형이 될까요? - autoboxing 으로 담깁니다~
	
	// Integer: wrapper class
	
	for(Object o: objs) {
		System.out.println(o+": "+o.getClass().getName());
	}

}}
