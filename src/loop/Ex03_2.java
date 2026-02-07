package loop;

public class Ex03_2 {
    public static void main(String[] args) {
        int max, sum = 0;

        // MARK: max=1
        max = 1;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);

        // MARK: max=2
        max = 2;
        sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);

        // MARK: max=3
        max = 3;
        sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);

        // MARK: max=100
        max = 100;
        sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);


    }

}
