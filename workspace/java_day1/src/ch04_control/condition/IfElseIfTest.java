package ch04_control.condition;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
//        System.out.println("32 ~ 126 사이의 정수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
//        int scanned = scanner.nextInt(); // 사용자의 입력값을 변수로 저장
//        String type = null;
//        if (scanned >= 48 && scanned < 58) {
//            type = "숫자";
//        } else if (scanned >= 65 && scanned < 91) {
//            type = "대문자";
//        } else if (scanned >= 97 && scanned < 123) {
//            type = "소문자";
//        } else {
//            type = "기타 타입";
//        }
//        System.out.printf("숫자 %d는 문자로 %c이고 %s입니다.\n", scanned, scanned, type);
//        scanner.close();
        
        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt();
        String ageType = null;
        if(age<8) {
        	ageType = "미취학";
        }else if(age<18) {
        	ageType = "청소년";
        }else if(age<50) {
        	ageType = "청년";
        }else {
        	ageType = "장년";
        }
        System.out.printf("나이는 %d이고 %s입니다.\n", age, ageType);
    }
    	
}
