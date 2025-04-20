package week05.pr06;


import java.util.Scanner;

abstract class Bank {
    abstract int func(int money);
}

class SavingAccount extends Bank {
    @Override
    int func(int money) {
        return (int)(money * 1.05);
    }
}

class CheckingAccount extends Bank {
    @Override
    int func(int money) {
        return money;
    }
}


class User {
    private static String ID = "Minter";
    private static String PW = "1234";

    static boolean login(String id, String pw) {
        if (ID.equals(id) && PW.equals(pw)) { return true;}
        else {return false;}
    }

    static void access(String id, String pw, int money) {
        if(!login(id, pw)){
            System.out.println(401);
        }
        else {
            SavingAccount sa = new SavingAccount();
            CheckingAccount cha = new CheckingAccount();

            System.out.println(sa.func(money));
            System.out.println(cha.func(money));

        }
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID:"); String id = sc.next();
        System.out.print("Enter Password:") ; String pw = sc.next();
        System.out.print("Enter money:") ; int money = sc.nextInt();

        User.access(id, pw, money);


    }
}
