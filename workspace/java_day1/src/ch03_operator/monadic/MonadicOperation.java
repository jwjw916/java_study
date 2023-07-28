package ch03_operator.monadic;

public class MonadicOperation {
    public static void main(String[] args) {
        // TODO: 각 단계에서 출력되는 값과 메모리에서의 값을 생각해보세요.
        int i = 5;
        i++;
        System.out.println(i); //6
        ++i;
        System.out.println(i); //7

        int j = ++i; //j=8
        System.out.println(j++); //8
        System.out.println(--j);//j=9, 8
    }
}
