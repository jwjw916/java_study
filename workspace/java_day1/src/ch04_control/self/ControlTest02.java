package ch04_control.self;

public class ControlTest02 {
    public static void main(String[] args) {
        char c = 'A';
        // TODO: 02. boolean 타입의 변수 b를 선언하고 c가 알파벳이면 true를 아니면 false를 할당하시오.
        //  할당 결과인 b를 출력하시오.
        boolean b ;
//        if((c >= 'a'&& c<='z') || (c>='A' && c <='Z')){
        //삼항연산자로 할것
        b = (c >= 'a' && c <= 'z') || (c>='A' && c <= 'Z')?true:false;
        System.out.println(b);
        
//        if ((int)c <= 122) {
//        	b = true;
//        	System.out.println(b);
//        }
//        else {
//        	b = false;
//        	System.out.println(b);}
        // END
    }
}
