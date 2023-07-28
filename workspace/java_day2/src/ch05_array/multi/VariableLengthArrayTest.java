package ch05_array.multi;

public class VariableLengthArrayTest {

    public static void main(String[] args) {
        int[][] arr2 = new int[4][];
        arr2[0] = new int[] { 1, 2, 4, 5 };
        arr2[1] = new int[] { 10, 20, 30, 40, 50 };
        arr2[2] = new int[] { 20, 20, 20 };
        arr2[3] = new int[] { 30, 30, 30, 30, 30 };

        int sum = 0;
        int count = 0;
        // TODO: 배열의 총 합과 평균을 출력하시오.
        
//        for(int [] row: arr2) {
//        	count += row.length; // 각 row의 개수 구하기
//        	for(int num: row) {
//        		sum += num; // 각 row에서 num 더해주기
//        	}
//        }System.out.println(sum);
//        System.out.println(sum/count);
        
        
        for(int i=0; i<arr2.length; i++) {
        	for(int j=0; j<arr2[i].length; j++) {
        		sum += arr2[i][j];
        		count += 1;
        		System.out.println(arr2[i][j]);
        	};
        }System.out.println(sum);
        System.out.println(sum/count);
        // END
    }
}
