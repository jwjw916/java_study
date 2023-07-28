package ch13_collection.b_set;

public class Phone {
    String number;
    Integer price;

    public Phone(String number, Integer price) {
        this.number = number;
        this.price = price;
    }

    // TODO: 가격과 번호가 같은 Phone은 set에서 하나만 관리되도록 처리하시오.
    @Override
    public boolean equals(Object obj) {
    if(obj instanceof Phone) {
    	Phone p = (Phone)obj;
    	if(this.number.equals(p.number) && this.price.equals(p.price)) {
    		return true;
    	}
    }return false;
    }
    
    @Override
    public int hashCode() {
    	return this.number.hashCode() + this.price.hashCode();
    }
    // END

    @Override
    public String toString() {
        return "SamePhone [number=" + number + ", price=" + price + "]";
    }
}
