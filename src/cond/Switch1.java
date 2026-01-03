package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;

        switch (grade) {
            case 1:
                System.out.println("케이스 1");
            // NOTE: break 걸지 않으면 여기 이후로 모든 실행문 다 실행함(디폴트 포함)
            case 2:
                System.out.println("케이스 2");
            case 3:
                System.out.println("케이스 3");
            default:
                System.out.println("디폴트");
        }
    }
}
