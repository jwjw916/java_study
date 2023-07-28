package ch07.c_modifier.p1;

public class SamePackageChildClass extends Parent {
    public void useMember() {
        // TODO: Parent의 멤버 변수를 사용해보자.
        public void useMember() {
            this.publicVar = 10;
            this.protectVar = 10;
            this.defaultVar = 10;
            this.privVar = 10;
            this.none = 10;
        } // The field Parent.privVar is not visible
        // none cannot be resolved or is not a field
        // END
    }
}
