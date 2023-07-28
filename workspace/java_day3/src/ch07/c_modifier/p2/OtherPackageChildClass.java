package ch07.c_modifier.p2;

import ch07.c_modifier.p1.Parent; // 패키지가 달라짐

public class OtherPackageChildClass extends Parent {
    public void useMember() {
        // TODO: Parent의 멤버 변수를 사용해보자.
        public void useMember() {
            this.publicVar = 10;
            this.protectVar = 10;
            this.defaultVar = 10;
            this.privVar = 10;
        }

        // END
    }
}
