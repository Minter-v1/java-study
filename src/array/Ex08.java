package array;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subject = {"국어", "영어", "수학"};

        System.out.print("학생수를 입력하세요:");
        // 학생 수 입력 받기
        int n = sc.nextInt();

        // 학생 수만큼 2차원 배열
        int[][] arr = new int[n][3];

        // 학생별 성적 입력
        for (int i= 0; i < n; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + " 점수: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // 학생별 총점, 평균 출력
        for (int i = 0; i < n; i++) {
            System.out.print((i+1)+"번 학생의 총점: ");
            int sum = arr[i][0] +arr[i][1] + arr[i][2];
            double avg = (double) sum / 3;

            System.out.println(sum + ", 평균: " + avg);


        }

    }
}
