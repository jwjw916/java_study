package ch07.c_modifier;


// 기능만 있고 상태가 없다 = stateless 한 클래스
class SingletonClass {
    // TODO:SingletonClass에 singleton design pattern을 적용하시오.

	private SingletonClass() {} // 내부클래스에서만 호출
	
	private static SingletonClass sc = new SingletonClass();
	
	/*
	public void setSingletonClass(SingletonClass sc) {
		this.sc = sc;
	}
	*/
	
	public static SingletonClass getSingletonClass() {
		return sc;
	}
	
	
    // 멤버 메소드만 있어요
	// 객체를 여러개 구별할 필요가 없어요
	// 어차피 메소드만 쓸건데??

    public void sayHello() {
        System.out.println("Hello");
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        // TODO: SingletonClass 객체를 사용해보자.
    	SingletonClass sc = SingletonClass.getSingletonClass();
    	sc.sayHello();
    	
    	SingletonClass sc2 = SingletonClass.getSingletonClass();
    	sc2.sayHello();
    	
    	System.out.println(sc==sc2);
        // END
    }
}
