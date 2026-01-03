package operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;

        a += 3; // 8
        System.out.println(a);

        a -= 2; // 6
        System.out.println(a);

        a *= 2; // 12
        System.out.println(a);

        a /= 2 ; // 6
        System.out.println(a);

        // NOTE: 나머지 연산 있음(python의 몫'//' 연산과 헷갈리지말 것)
        a %= 2; // 0
        System.out.println(a);


    }
}
