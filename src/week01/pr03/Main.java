package week01.pr03;

import java.util.Scanner;

public class Main {
    static String setA = "떡볶이 김밥 순대 5500원";
    static String setB = "치즈떡볶이 모듬튀김 오뎅 7000원";
    static String setC = "떡볶이 치즈라면 치즈스틱 10000원";

    public static void main(String[] args) {
        //Scanner 인스턴스 생성
        Scanner sc = new Scanner(System.in);

        //줄넘김 포함 X, 사용자 입력을 출력문과 같은 라인에서 받음
        System.out.print("A~C중 선택하시오");
        String userInput = sc.nextLine();

        if (userInput.equals("A")) {
            System.out.println(setA);
        }
        else if (userInput.equals("B")) {
            System.out.println(setB);
        }
        else {
            System.out.println(setC);
        }

    }

}
