package ch06_class_object.c_method.overloading;

public class WalkTestGood {
    void walk() {
        walk(100);
    }

    // TODO: walk 메서드를 overloading 해보자.
    void walk(int distance) {
    	walk(distance, "cm");
    }
    
    void walk(int distance, String unit) {
    	if(unit.equals("inch")){
    		distance*=2.54;
    	}    	System.out.println(distance+"cm 이동 완료!!");
    }
    // END

    public static void main(String[] args) {
        WalkTestGood wtg = new WalkTestGood();
        wtg.walk(300, "inch");
        //wtg.walk(100);
        //wtg.walk(100,"cm");

    }

}
