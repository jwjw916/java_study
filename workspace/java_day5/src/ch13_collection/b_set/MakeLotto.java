package ch13_collection.b_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set; //ctrl+shift+o

public class MakeLotto {
	private static void testRandom() {
		Random rand = new Random();
		for(int i=0;i<6;i++) {
			int rnum = rand.nextInt(45)+1;
			System.out.println(rnum);
		}
	}
		private static void makeLottoBySet(){
			Set<Integer> set = new HashSet<>();	
			Random rand = new Random();
			for(; set.size()<6;) {
			int rnum = rand.nextInt(45)+1;
			set.add(rnum);
		}
			System.out.println(set);
	}	
		private static void makeLottoByList(){
			List<Integer> list = new ArrayList<>();	
			Random rand = new Random();
			for(; list.size()<6;) {
			int rnum = rand.nextInt(45)+1;
			if (!list.contains(rnum)) {
				list.add(rnum);
			}
		}
			System.out.println(list);
	}	
			

	
	public static void main(String[] args) {
//		testRandom();
		makeLottoByList();
		makeLottoBySet();

	}

}
