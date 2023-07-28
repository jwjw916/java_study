package ch06_class_object.a_person;

public class PersonTest {

	public static void main(String[] args) {
		// 클래스를 구체화(객체화) 시켜보자
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 10;
		p1.eat();
		
//		System.out.println(p1.name+", "+p1.age+", "+p1.ishungry);
		p1.printInfo();
		
		
		Person p2 = new Person();
		p2.name = "임꺽정";
		p2.work();
		System.out.println(p2.name+", "+p2.ishungry);
		
		Person p3 = new Person("장지우",30,true);
		p3.printInfo();
	}

}
