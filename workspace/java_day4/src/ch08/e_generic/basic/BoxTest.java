package ch08.e_generic.basic;

// TODO: 멤버 변수 Object some을 갖는 NormalBox를 만들어보자.(생성자, set/getter 추가)
class NomalBox{
	private Object some;
	
	public NomalBox(Object some) {
		this.some = some;
	}
	
	public void setSome(Object some) {
		this.some = some;
	}
	
	public Object getSome() {
		return this.some; 
	}
}
// END


// TODO: 멤버 변수 T some을 갖는 GenericBox를 만들어보자.(생성자, set/getter 추가)
class GenericBox<T>{
	T some;
	
	public GenericBox(T some) {
		this.some = some;
	}
	
	public void setSome(T some) {
		this.some = some;
	}
	public T getSome() {
		return this.some;
	}
}

// END

public class BoxTest {

    private static void useNormalBox() {
        // TODO: NormalBox를 생성하고 저장된 값의 타입을 판단하고 타입에 특화된 작업을 해보자.
    	NomalBox box = new NomalBox("Hello");
    	Object obj = box.getSome();
    	if(obj instanceof String) {
    		String str= (String)obj;
    		System.out.println(str+"은 문자열이고 길이는 "+str.length());
    	}
    	box.setSome(1);
        // END
    }

    private static void useGenericBox(){
        // TODO: GenericBox를 생성하고 저장된 값의 타입을 판단하고 
    	// 타입에 특화된 작업을 해보자. 여기에서는 <T>가 <String>이 된다
    	GenericBox<String> sbox = new GenericBox<>("Hello");
    	// 타입을 한정해버려서 get할때 타입을 확인할 필요가 없음
    	String str = sbox.getSome();
    	// sbox.setSome(str); 이제 담을때는 String으로밖에...
    	System.out.println(str+"은 문자열이고 길이는 "+str.length());
        // END
    	
    	GenericBox<Integer> ibox = new GenericBox<>(3);
    	int num = ibox.getSome();
    	System.out.println(num+"은 숫자");
    	}

    public static void main(String[] args) {
        useNormalBox();
        useGenericBox();
    }
}
