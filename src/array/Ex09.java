package array;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productNames = new String[10]; // 상품 이름 배열
        int[] productPrices = new int[10]; // 상품 가격 배열
        int productCount = 0; // 현재 상품 개수 카운트
        int option;

        do {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            option = sc.nextInt();
            sc.nextLine();

            // 등록처리
            if (option == 1) {
                if (productCount >= 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = sc.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = sc.nextInt();

                productCount++;
            } else if (option == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i ++) {
                    System.out.println(productNames[i] + " : " + productPrices[i] + "원");
                }
            }

        } while (option != 3);

        System.out.println("프로그램을 종료합니다.");
    }
}
