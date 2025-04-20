package week05.pr02;

import java.util.Scanner;

class Email {
    static boolean checkEmail(String email) {
        if (email.contains("@")) {
            return true;
        }
        else { return false;}
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Emaill: ");
        String email = sc.next();
        System.out.println(Email.checkEmail(email));

    }
}
