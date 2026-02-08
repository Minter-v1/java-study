package scanner;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세툐: ");
        int row = sc.nextInt();

        System.out.println(row + "단의 구구단:");
        for(int i = 1; i <= 9 ; i++) {
            System.out.println(row + " x " + i + " = " + (row * i));
        }
    }
}
