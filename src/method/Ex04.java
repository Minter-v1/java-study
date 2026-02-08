package method;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        int deposit = 0;

        do {

            System.out.println("-".repeat(10));
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("-".repeat(10));
            System.out.print("선택: ");
            option = sc.nextInt();

            if (option == 1) {
                System.out.print("입금액을 입력하세요 : ");
                deposit = deposit(deposit, sc.nextInt());
            } else if (option == 2) {
                System.out.print("출금액을 입력하세요 : ");
                deposit = withdraw(deposit, sc.nextInt());
            } else if (option == 3) {
                System.out.println("현재 잔액: " + deposit);
            }
        } while (option != 4);

        System.out.println("시스템을 종료합니다.");
    }

    // 입금 메서드
    public static int deposit(int deposit, int money) {
        int res = deposit + money;
        System.out.println(money + "원을 입금하셨습니다. 현재 잔액 : " + res);
        return res;

    }

    // 출금 메서드
    public static int withdraw(int deposit, int money) {
        if (deposit < money) {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
            return deposit;
        }
        int res = deposit - money;
        System.out.println(money + "원을 출금하였습니다. 현재 잔액 : " + res);
        return res;
    }

}
