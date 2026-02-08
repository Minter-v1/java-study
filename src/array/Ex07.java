package array;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][3];
        double[][] res = new double[5][2]; // 총점, 평균

        for (int i = 1; i < arr.length; i++) {
            System.out.println(i + "번 학생의 성적을 입력하세요:");
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0) {
                    System.out.print("국어 점수:");
                    arr[i][j] = sc.nextInt();
                } else if (j == 1) {
                    System.out.print("영어 점수:");
                    arr[i][j] = sc.nextInt();
                } else {
                    System.out.print("수학 점수:");
                    arr[i][j] = sc.nextInt();
                }
                sum += arr[i][j];
            }
            res[i][0] = sum;
        }

        for (int i = 1; i < 5; i++) {
            System.out.print("1번 학생의 총점: " + (int)res[i][0] + ", ");
            System.out.println("평균: " + (double)res[i][0]/3);
        }
    }
}
