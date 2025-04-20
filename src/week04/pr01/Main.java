package week04.pr01;

public class Main {

    private static int[] hakbus = {1111, 1112,1113, 1114, 1115};
    private static int[] scores = {8,11,45,100,67};
    private static int maxScore = 0, maxIndex = 0;


    public static void main(String[] args) {
        for(int i = 0; i < hakbus.length; i ++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxIndex = i;
            }
        }

        System.out.println(hakbus[maxIndex]+"("+maxScore+")");
    }
}
