package array;

public class Ex01 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int sum = 0;

        for (int score : students) {
            sum += score;
        }
        double avg = (double) sum / students.length;

        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균 : " + avg);



    }
}
