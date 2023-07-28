package ch07.c_modifier.encapsulation;

class UnbelievableUserInfo {
    //이름은 null이 될 수 없음.
    private String name = "홍길동";
    // 계좌는 0보다 커야 함.
    private int account = 10000;
    
    // @setter - 보호하는 로직 추가
    public void setName(String name) {
    	if (name != null) {
    	this.name = name;
    }else {
    	System.out.println("값을 채우세요.");
    }}
    
    // @getter
    public String getName() {
    	return this.name;
    }
    
    // @setter - 보호하는 로직 추가
    public void setAccount(int account) {
    	if (account > 0) {
    	this.account = account;
    }else {
    	System.out.println("값을 0 이상으로 채우세요.");
    }}
    
    // @getter
    public int getAccount() {
    	return this.account;
    }
    
}

public class UnbelievableTest {
    public static void main(String[] args) {
        UnbelievableUserInfo info = new UnbelievableUserInfo();
        System.out.printf("사용자 정보:%s, %d%n", info.getName(), info.getAccount());
        info.setName(null);
        info.setAccount(5000);
        System.out.printf("사용자 정보:%s, %d%n", info.getName(), info.getAccount());
    }
}
