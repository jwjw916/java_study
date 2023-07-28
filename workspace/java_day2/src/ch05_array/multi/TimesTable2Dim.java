package ch05_array.multi;

import java.util.Arrays;

public class TimesTable2Dim {

    public static void main(String[] args) {
        // 구구단을 저장할 2차원 배열 선언
        int[][] gugu = new int[9][9];
        System.out.printf("gugu의 길이: %d%n", gugu.length);
        System.out.printf("gugu의 0 번째 요소의 길이: %d%n", gugu[0].length);

        // 배열에 구구단 저장
        
        for(int i=0; i<gugu.length; i++) {
        	for(int j=0; j<gugu[i].length; j++) {
        		gugu[i][j] = (i+1) * (j+1);}

        		
        }
        
        for(int [] row: gugu) {
    		System.out.println(Arrays.toString(row));
    		}
        
        for(int i=0; i<gugu.length; i++) {
        	for(int j=0; j<gugu[i].length; j++) {
            	System.out.printf("[%d] * [%d] = %d\n", i+1, j+1, gugu[i][j]);
            	}
        	}
        }
}
       

        

