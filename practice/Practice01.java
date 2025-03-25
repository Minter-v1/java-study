package practice;

import java.util.Scanner;


public class Practice01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num) {
            case 2: //해당 값과 동일하면 그 경우부터 시작해서 밑에 경우 전부 실행함
                System.out.println("큼");
    
            case 3: // 그래서 보통 한 case마다 break 걸어서 한 번만 실행되게 함
                System.out.println("큼");
            case 4: // case 'A': => 이렇게 문자도 가능
                System.out.println("큼");
        }
    }
}