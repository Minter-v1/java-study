package week06.pr04;
class CheckNum {
    static void targetNum(int[] arrayList) {
        for(int num: arrayList) {
            if (num%7 == 0) {
                System.out.print(num+" ");
            }
        }
    }
}
public class Main {
    static int[] arrayList = {6, 75, 700, 56, 13, 99, 77, 85, 3, 21};

    public static void main(String[] args) {
        CheckNum.targetNum(arrayList);
    }
}
