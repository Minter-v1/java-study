package scanner;

import java.util.Scanner;

public class Ez09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        int total = 0;

        do {
            System.out.println("1 : 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String name = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = sc.nextInt();

                total += price * quantity;
            } else if (option == 2) {
                System.out.println("총 비용: " + total);
            }
        } while (option != 3);
    }
}
