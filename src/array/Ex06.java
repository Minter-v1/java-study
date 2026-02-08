package array;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = 0, minNum = 9999;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] >= maxNum) {
                maxNum = arr[i];
            }

            if (arr[i] <= minNum) {
                minNum = arr[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수 : " + maxNum);

    }
}
