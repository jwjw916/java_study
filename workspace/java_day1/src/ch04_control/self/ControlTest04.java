package ch04_control.self;

public class ControlTest04 {
    public static void main(String[] args) {
    	int sum=0;
        // TODO: 1+(1+2)+(1+2+3)+...+(1+2+3+4+5+6+7+8+9+10)의 값은?
    	for(int i=1; i<=10; i++) {
    		for (int j=1; j<=i; j++) {
    			sum+=j;

    		}  
    	}  System.out.println(sum);

//    	int total=0;
//    	for(int i=1; i<=10; i++) {
//    		sum += i;
//    		total += sum;
//    		System.out.println(sum);
//    	}
//		System.out.println(total);
        // END
    }
}