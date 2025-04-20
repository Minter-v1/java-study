package week05.pr01;

import java.util.Scanner;

//로그인 클래스
class Login {
    private static final String ID = "Minter";
    private static final String PW = "1234";


    //로그인 판별
    public static int login(String id, String pw) {
        if (!id.equals(ID)) { return 400; }
        else if (!pw.equals(PW)) { return 401; }
        else { return 200; }
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID:");
        String id = sc.next();

        System.out.print("Enter password:");
        String pw = sc.next();
        System.out.println(" ");

        System.out.println(Login.login(id, pw));

    }
}
