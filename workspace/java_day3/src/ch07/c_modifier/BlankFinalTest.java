package ch07.c_modifier;

class FinalMemberClass {
	// reference type member - null(default)이기 때문에
	// blank final 변수로
    final String name;

    public FinalMemberClass(String name) {
    	// blank final은 생성자에서 딱 한번 초기화 가능
        this.name = name;
    }
    
    public void printName() {
    	System.out.println(this.name);
    }
    
}
// 위 클래스에 final을 붙이면 아래 클래스에 다음과 같은 오류가 생김
// The type MyClass cannot subclass the final class FinalMemberClass
class MyClass extends FinalMemberClass{
	public MyClass(String name) {
		super(name);
	}
	
	
	// 위 메소드에 final 붙이면 아래 메소드에 다음과 같은 오류가 생김 
	// Cannot override the final method from FinalMemberClass
	public void printName() {
		System.out.println("상속됐나?"+name);
	}
	
}

public class BlankFinalTest {
    public static void main(String[] args) {
        FinalMemberClass fmc1 = new FinalMemberClass("hong");
        FinalMemberClass fmc2 = new FinalMemberClass("lim");

        System.out.printf("name: fmc1 - %s, fmc2 - %s%n", fmc1.name, fmc2.name);
        
        // final String name 때문에 생긴 오류
//        The final field FinalMemberClass.name cannot be assigned
//        fmc1.name = "kim";
    }
}
