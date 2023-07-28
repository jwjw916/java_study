package ch07.poly;

import ch07.a_extend.spider.Person;
import ch07.a_extend.spider.SpiderMan;

public class InstanceOfTest {
    public void badCasting() {
        Person person = new Person("피터파커");
        SpiderMan sman = (SpiderMan)person;
        sman.fierWeb();
    }
    // 형변환 한거 맞는지 물어보는게 좋다
    public void goodCasting() {
        Person person = new Person("피터파커");
        if (person instanceof SpiderMan) {
            SpiderMan sman = (SpiderMan) person;
            sman.fierWeb();
        } else {
            System.out.println("SpiderMan에 적합하지 않은 객체");
        }
    }

    public static void main(String[] args) {
        InstanceOfTest iot = new InstanceOfTest();
        // 아래 메서드 호출은 runtime 오류를 발생시킨다.
        // iot.badCasting();
        iot.goodCasting();
    }
}
