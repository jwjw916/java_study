package ch06_class_object.a_person;

public class Person {
	// 속성 - 데이터, 필드, 멤버 변수
	String name;
	int age;
	boolean ishungry;
	
	public Person() {
		this("익명", 0 , false) // 생성자의 맨 첫번째 줄에서만 유효하다
		// this(): 나의 overloading 된 다른 생성자 호출
	}
	public Person(String name, int age, boolean ishungry) {
		this.name = name;
		this.age = age;
		this.ishungry = ishungry;
	}
	
	// 기능 - 동작, 메서드, 멤버 메서드
	void eat() {
		System.out.println("냠냠..");
		ishungry = false;
	}
	void work() {
		System.out.println("열심!!");
		ishungry = true;
	}
		
	void printInfo() {
		System.out.println(name + age + ishungry);

	}
}
