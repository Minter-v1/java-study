package week01.pr4;

public class Main {
    //정의 + 리터럴 생성
    static int[] nums = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        for(int num: nums) {
            if (num < 3 || num >= 7) {
                System.out.print(num);
                System.out.print(" ");
            }
        }

    }
}
