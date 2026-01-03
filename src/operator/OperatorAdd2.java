package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a; //2
        System.out.println(b);

        a = 1;
        b = 0;
        b = a++; // 0
        System.out.println("a = " + a); // 2
        System.out.println("b = " + b); // 1

    }
}
