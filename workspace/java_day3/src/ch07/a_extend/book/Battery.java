package ch07.a_extend.book;

public class Battery {
	int capability;
	int current;
	
	public Battery(int capability, int current) {
		this.capability = capability;
		this.current = current;
	}
	
	public Battery(int capability) {
		this(capability,0);
	}
	
	public void charge() {
//		System.out.println("현재 "+current+" 배터리 "+capability);
		System.out.println("현재 충전중"+ ++current);
	}
}
