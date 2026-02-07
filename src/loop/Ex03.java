package loop;

public class Ex03 {
    public static void main(String[] args) {
        int i = 0, max = 100, sum = 0;

        // MARK: max=1
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);

    }

}
