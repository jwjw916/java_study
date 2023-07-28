package ch04_control.condition;

import java.util.Scanner;

public class SwitchDayByMonth {

	public static void main(String[] args) {
		System.out.println("달을 입력하세요. ex. 1");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int days = 0;
		switch(month) {
		case 2:
			days = 28;
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
		break;
		default: 
			days= 31;
		break;
		} 
		System.out.printf("%d월은 %d일까지 있습니다.", month, days);

	}

}
