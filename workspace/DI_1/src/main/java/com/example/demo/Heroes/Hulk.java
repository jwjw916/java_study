package com.example.demo.Heroes;

import org.springframework.stereotype.Component;

	@Component //원래는 싱글톤으로 만들었겠지만 이제 빈은 싱글톤이니까 빈으로
public class Hulk implements Heroes {

		@Override
		public void help() {
			System.out.println("헐크 출동");
			
		}


}
