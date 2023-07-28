package ch07.a_extend.book;

public class HandPhone extends Phone {
	String lastCall;
	
	//has a 관계 객체 생성
	Battery battery = new Battery(1000);
	
	//생성자 생성
	public HandPhone(String number) {
		super(number);
	}
	

	// 메소드 오버로딩
	public void call(int shortkey) {
		System.out.println("단축키 "+shortkey+" 전화");
	}
	
	//상속된 메소드 이용해서 메소드 오버로딩
	public void call() {
		System.out.println(lastCall+"로 전화");
		call(this.lastCall);
				}
	
	//메소드 오버라이딩 super.call(number) 떠오기
	public void call(String number) {
		this.lastCall = number;
		super.call(number);
	}

	
	public void charge() {
//		Battery b = new Battery(70, 30);
		this.battery.charge(); 
		// battery 객체가 어디 소속인지 명시하려면 this 명시하는게 좋음
	}
	
	
	
}
