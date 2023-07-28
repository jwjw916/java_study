package ch08.c_enume;

import javax.print.DocFlavor.STRING;

public class Phone {
	String number;
	
	public Phone(String number) {
		this.number = number;
	}
	
	public String toString() { 
		// Object가 가진 toString을 재정의해서 호출 - 동적 바인딩
		return this.number;
	}
	
	public boolean equals(Object other) {
		if(other instanceof Phone) {
			Phone ophone = (Phone)other;
			if(ophone.number.equals(this.number)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Phone p1 = new Phone("010");
		Phone p2 = new Phone("010");
		
		System.out.println(p1+", "+p2);
		System.out.println(p1 == p2); // 같은 객체를 참조하고 있는지
		System.out.println(p1.equals(p2)); // 두 객체의 내용이 같은지 
	}
	

}
