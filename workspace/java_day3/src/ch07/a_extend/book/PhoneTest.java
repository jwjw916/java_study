package ch07.a_extend.book;

public class PhoneTest {

	public static void main(String[] args) {
	Phone p1 = new Phone("010");
	p1.call("0112");
		
	HandPhone hp = new HandPhone("010");
	hp.call();
	hp.call(3);
	hp.call("011");
	
//	Battery b = new Battery(70);
//	b.charge();
	}
}
