package scanner;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double count = 0;

        while (true) {
            int a = sc.nextInt();

            if (a == -1) {
                System.out.println("입력한 숫자들의 합계: " + sum);
                System.out.println("입력한 숫자들의 평균: " + (sum / count));
            }
            sum += a;
            count++;
        }
    }
}
