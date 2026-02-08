package scanner;

public class Ex05 {
    public static void main(String[] args) {
        int a = 20, b = 10;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + "," + b);
    }
}
