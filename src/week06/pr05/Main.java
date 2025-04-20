package week06.pr05;

class CountWord {
    static int count(String[] words) {
        int count = 0;
        for(String word: words) {
            if(word.equals("bmw")) {
                count++;
            }
        }

        return count;
    }
}

public class Main {
    private static String[] arrayList = {"bmw", "kia", "benz", "bmw", "kia"};

    public static void main(String[] args) {
        System.out.println(CountWord.count(arrayList));
    }
}
