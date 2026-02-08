package array;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

       for (int i = 0; i < arr.length; i++) {
           if (i != arr.length-1) {
               System.out.print(arr[i] + ", ");
           } else {
               System.out.println(arr[i]);
           }
       }
    }
}
