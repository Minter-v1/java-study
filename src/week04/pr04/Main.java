package week04.pr04;

import java.util.Scanner;

public class Main {
    private static int[] hakbus = {1111, 1112,1113, 1114, 1115};
    private static int[] scores = {8,11,45,100,67};

    //학번 입력받고 성적 출력하기
    static boolean flag(int num) {
        boolean flag = false;
        for(int i = 0; i < hakbus.length; i ++) {
            if (hakbus[i] == num) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    //점수 찾기
    static int findScore(int hakbun) {
        int targetIndex = 0;

        for (int i=0; i < hakbus.length ; i++) {
            if (hakbus[i] == hakbun) {
                targetIndex = i;
                break;
            }
        }
        return scores[targetIndex];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학번 입력:");
        int userInput = sc.nextInt();

        //flag = false일 경우 -> alert 발생
        if(!flag(userInput)) {
            System.out.println("해당 학번은 존재하지 않습니다.");
        }

        //점수 출력
        else {
            System.out.println(findScore(userInput));
        }


    }
}
