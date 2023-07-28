package ch08.a_abstract.bad;

public abstract class Vehicle {
    private int curX, curY;

    public void reportPosition() {
        System.out.printf("현재 위치: (%d, %d)%n", curX , curY);
    }
    
    public void setcurr(int curX, int curY) {
    	this.curX = curX;
    	this.curY = curY;
    }
    
    public abstract void addFuel();
//    public void addFuel() {
//        System.out.println("급유");
//    }
}
