package week05.pr04;

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
        return money-1000;
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount sa = new SavingAccount();
        CheckingAccount cha = new CheckingAccount();

        System.out.print("금액을 입력하세요:");
        int money = sc.nextInt();

        System.out.println(sa.func(money));
        System.out.println(cha.func(money));


    }
}
