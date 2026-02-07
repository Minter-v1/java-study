package loop;

public class Ex02_2 {
    public static void main(String[] args) {
//        for (int i = 2; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        // MARK: 이것도 됨(strid 설정됨)
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
