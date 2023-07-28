package ch07.poly;

class UserInfo {
    String name = "홍길동";
    
    // TODO: UserInfo를 잘 표현하도록 toString을 재정의해보자.
    public String toString() {
    	return name;
    }

    // END
}

class MemberInfo extends UserInfo {
    String name = "임꺽정";
    String grade = "정회원";

    // TODO: MemberInfo를 잘 표현하도록 toString을 재정의 해보자.
    public String toString() {
    	return name + ", " + grade;
    }

    // END
}

public class PrintObject {

    public static void main(String[] args) {
    	
        Object member = new MemberInfo();
        UserInfo userinfo = (UserInfo)member; // MemberInfo -> UserInfo니까 가능 
//        Object member = new UserInfo();
//        MemberInfo userinfo = (MemberInfo)member; 
        // 자식에다 조상타입을 넣을 수는 없어요
        System.out.print(member); 
        //자식으로 형변환이 되고 멤버 변수는 없지만
        //객체가 가지고 있는 최종적인 메서드가 호출된다
    }
}
