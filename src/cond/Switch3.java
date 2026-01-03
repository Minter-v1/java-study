package cond;

public class Switch3 {
    public static void main(String[] args) {
        int score = 2;

        int coupon = switch (score) {
            case 1 -> 1000;
            case 2 -> 2000;
            default -> 0;
        };

        System.out.println(coupon); // 2000

    }
}
