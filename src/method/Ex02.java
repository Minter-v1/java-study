package method;

public class Ex02 {
    public static void main(String[] args) {
        repeatPrint(3,"hello, world!");
    }

    // 반복 출력 메서드
    public static void repeatPrint(int n, String message) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
        return;
    }
}
