package week04.pr03;

import java.util.Scanner;

public class Main {

    private static int[][] apt = {
            {101, 102, 103},
            {201, 202, 203},
            {301, 302, 303}
    };

    private static int[][] pay = {
            {1000, 2100, 1300},
            {2000, 3100, 2700},
            {3000, 1400, 900}
    };


    public static void main(String[] args) {
        //호를 입력 -> 관리비 출력

        Scanner sc = new Scanner(System.in);

        System.out.print("호를 입력하세요:");
        int userRoom = sc.nextInt();
        int targetRow=0, targetCol=0;

        //apt에서 호실 인덱스 찾아야함
        for(int i =0; i < apt.length; i++) {
            for(int j=0; j <apt[i].length; j++) {
                if (userRoom == apt[i][j]) {
                    targetRow = i ; targetCol = j;
                }
            }
        }

        //관리비 출력
        System.out.println(pay[targetRow][targetCol]);

    }
}
