package ch07.a_extend.book;

public class Phone{
	String number;

	
	public Phone(String number) {
		this.number = number;
	}

	public void call(String to) {
		System.out.println(this.number + "에서"+ to +"로 ");
	}
}
