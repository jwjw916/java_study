package com.woorifis.preweb;

import lombok.extern.slf4j.Slf4j;

@Slf4j // lombok

public class PersonTest {
	
//	private static final Logger log = LoggerFactory.getLogger(PersonTest.class);
	

	public static void main(String[] args) {
		log.trace("trace level: {}, {}, {}", 1, "Hi", true);
		log.debug("debug level: {}, {}, {}", 1, "Hi", true);
		log.info("info level: {}, {}, {}", 1, "Hi", true);
		log.warn("warn level: {}, {}, {}", 1, "Hi", true);
		log.error("error level: {}, {}, {}", 1, "Hi", true);
		
		Person p1 = new Person("홍길동");
		System.out.println(p1);
		Person p2 = new Person("홍길동");
		System.out.println(p1==p2);
		
		Person p3 = Person.builder().name("홍길동").age(30).build();
		System.out.println(p3);
		p3.grow(30);
		p3.grow(10);
	}

}
