package array;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 4; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
