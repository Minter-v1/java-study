package week01;

import java.util.Scanner;

public class Main {

    //문자열은 String 클래스
    static String correctID = "Minter";
    static String correctPW = "alswl";
    //main진입점
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디:");
        String userID = sc.nextLine();
        System.out.println();

        System.out.print("패스워드:");
        String userPW = sc.nextLine();
        System.out.println();

        if (!correctID.equals(userID)) { System.out.println("ID를 확인해주세요");}
        else if (!correctPW.equals(userPW)) { System.out.println("PW를 확인해주세요");}
        else { System.out.println("로그인 성공");}

    }
}