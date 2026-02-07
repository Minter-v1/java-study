package loop;

public class Ex05 {
    public static void main(String[] args) {
        int rows;

        // 행
        rows = 2;
        for(int i = 1; i <= rows; i++) {
            // 열
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        rows = 5;
        for(int i = 1; i <= rows; i++) {
            // 열
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
