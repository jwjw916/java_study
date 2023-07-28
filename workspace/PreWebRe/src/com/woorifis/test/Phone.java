package com.woorifis.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j



public class Phone {

	@NonNull
	private String name;
	private String number;

	public void hello() {
		System.out.println("...");
	}
	
	public static void main(String[] args) {
		Phone p1 = Phone.builder().name("galaxy").number("010-1111").build();
		System.out.println(p1);
		p1.hello();
		
		log.trace("trace");

	}

}
