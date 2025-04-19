package week01.pr02;

import java.util.Scanner;

public class Main {
    static String setA = "떡볶이 김밥 순대 5500원";
    static String setB = "치즈떡볶이 모듬튀김 오뎅 7000원";
    static String setC = "떡볶이 치즈라면 치즈스틱 10000원";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력하세요 -->");
        String userInput = sc.nextLine();

        switch (userInput) {
            case "A" : {
                System.out.println(setA);
                break;

            }
            case "B" : {
                System.out.println(setB);
                break;
            }

            case "C" : {
                System.out.println(setC);
                break;
            }

        }



    }
}
