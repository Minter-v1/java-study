package method;

public class Ex01 {
    public static void main(String[] args) {
        double res = avgPrint(1,2,3);
        System.out.println("평균값 : " + res);

        res = avgPrint(15,25,35);
        System.out.println("평균값 : " + res);
    }

    // 평균값 연산 메서드
    public static double avgPrint(int a, int b, int c) {
        return (a+b+c)/3;
    }
}
