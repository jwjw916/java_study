package com.example.demo.Heroes;

import org.springframework.stereotype.Component;

@Component("hulkBuster")
public class HulkBuster extends IronMan {

	@Override
	public void help() {
		System.out.println("헐크버스터 출동");
	}
}
