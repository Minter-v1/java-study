package week05.pr03;

import java.util.Scanner;

class Login {
    static int checkAssign(String id, String pw) {
        if (id.contains("4") && id.contains("&") && pw.contains("4") && pw.contains("&")) { return 201; }
        else { return 400; }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID:");
        String id = sc.next();

        System.out.print("Enter Password:");
        String pw = sc.next();

        System.out.println(Login.checkAssign(id, pw));
    }
}
