package ch03_operator.arithmetic;

public class ArithmeticOperatorTest {

    public static void main(String[] args) {
        // 나누기와 나머지 연산의 차이
        System.out.println(10 / 3); // 3
        System.out.println(10 % 3); // 1

        byte b1 = 10;
        byte b2 = 20;
        // TODO: 다음 연산의 오류를 확인하고 수정하시오.
         byte b3 = (byte)(b1 + b1); //내부적으로 int로 연산함

        // END

        int i1 = 100;
        long l1 = 200;
        // TODO: 다음 연산의 오류를 확인하고 수정하시오.
         long i2 = i1 + l1; // int랑 long 연산하면 long으로 나옴

        // END

        // TODO: 다음의 출력 결과를 예측하고 이유를 설명하시오.
        System.out.println(10 / 3); // int / int = int
        System.out.println(10 / 3.0); // int와 double 하면 double이 나옴 답: 3.3333
    }
}
