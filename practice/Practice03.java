package practice;

public class Practice03 {
    // 💡 전역변수 (클래스 내부, 메서드 밖)
    String globalNumber = "전역변수";

    public void showCounts() {
        String localNumber = "지역변수";
        System.out.println("전역변수 : "+globalNumber);
        System.out.println("지역변수 : "+ localNumber);

    }
    public void anotherFunc() {
        try {
            //컴파일 에러남 -> try-catch로 잡을 수 없음
            System.out.println("지역변수 : "+ localNumber);
        }
        catch (Exception e) {
            System.out.println("여기서는 지역변수 접근 안됨");
            System.out.println("전역변수 : "+globalNumber);
        }
            
    }
    //코드 시작점
    public static void main(String args[]) {
        
    }
}
