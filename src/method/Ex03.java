package method;

public class Ex03 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

    }

    // 입금 메서드
    public static int deposit(int balance, int money) {
        int deposit  = balance + money;
        System.out.println(money + "원을 입금였습니다. 현재 잔액 : " + deposit);
        return deposit;

    }

    // 출금 메서드
    public static int withdraw(int balance, int money) {
        int deposit = balance - money;
        System.out.println(money + "원을 출금하였습니다. 현재 잔액 : " + deposit);
        return deposit;
    }
}
