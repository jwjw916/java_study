package ch13_collection.a_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    // TODO: Object를 저장할 수 있는 List를 만들어보자.
	List<Object> list = new ArrayList<>();
    // END

    public void createTest() {
        // TODO: list에 다양한 데이터를 추가하고 출력해보자.
    list.add(0, "Hello");
    list.add("Hi");
    list.add(1);
    System.out.println(list);
        // END
    }

    public void retrieveTest() {
        // TODO: list의 내용을 다양한 방법으로 조회해보자.
    System.out.println(list.contains("Hello"));
    List<Object> temp = List.of(1,"Hi","Hello");
    System.out.println(list.equals(temp) + "  "+(list==temp)); // a 와 b 가 같은 내용을 가지고 있는지
    System.out.println("1번째? "+list.get(1));
    System.out.println("Hello는 몇번째? "+list.indexOf("Hello"));
    System.out.println("자료의 길이? "+list.size());
    
    
    for(Object o: list){
    	System.out.println(o);
    }
        // END
    }

    public void updateTest() {
        // TODO: list의 요소를 수정하고 출력해보자.
    	System.out.println("수정 전 "+list);
    	list.set(1, "Good");
    	System.out.println("수정 후 "+list);
 
        // END
    }

    public void deleteTest() {
        // TODO: list의 내용을 삭제해보자.
    	System.out.println("수정 전 "+list);
    	list.remove(2);
    	System.out.println("수정 후 "+list);
        // END
    }

    public static void main(String[] args) {
        ArrayListTest alt = new ArrayListTest();
        alt.createTest();
        alt.retrieveTest();
        alt.updateTest();
        alt.deleteTest();
    }
}
