package practice; //세미콜론 존재한다

public class Practice02 {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for(int item:numbers) { //요소 가져옴 -> int item :요소의 타입을 먼저 선언해야한다
            System.out.println(item);
        }
    }
}
