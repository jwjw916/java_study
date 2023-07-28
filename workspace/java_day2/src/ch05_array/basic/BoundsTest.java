package ch05_array.basic;

import java.util.Arrays;

public class BoundsTest {

    public static void main(String[] args) {
        char [] charArray = new char [3];
        // TODO: charArray에 'A', 'B', 'C'를 저장하세요.
        for(int i=0; i<charArray.length; i++ ) {
        	charArray[i] = (char)('A' + i);	
        }
        // END
        
        // TODO: index 0~4까지 charArray의 요소를 출력하시오. 문제 상황을 인지하고 대책을 마련하시오.
        for(int i=0; i<charArray.length; i++) {
        	System.out.println(charArray[i]);
        	
        }System.out.println(Arrays.toString(charArray));
        // END
    }
}
