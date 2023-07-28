package ch04_control.self;

public class ControlTest05 {
    public static void main(String[] args) {
        // TODO: 1+(-2)+3+(-4)+... 과 같은 식으로 더해나갈 때, 총합이 100이상이 되려면 몇까지 더해야 하는가?
    	int sum=0; // 초기화
    	int cnt=0;
    	while (true) { //범위를 모르니까 우선 true로 진행
    		cnt++; // 1부터 증가시킴
    		sum += (cnt%2==1)? cnt: cnt*-1;
    		// 짝수일때 음수였으니, 만약 짝수라면 *-1 해서 음수로 전환
    		if(sum>=100) { // sum이 100이 되면 끝
    			break;
    		}
    	}System.out.printf("%d까지 더하면 %d이 된다.", cnt, sum);
        // END
    }
}
