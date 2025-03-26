package practice02;


public class MyClass {
    
    //static field(정적 필도)-> 클래스 변수

    static int cnt = 0; //initialize

    //상수 필드
    //접근 제어자 + 정적여부 + final여부 + 타입 + 변수명
    public static final String const_val = "절대 바뀌지 않는 값";

    //인스턴스 필드 + 생성자
    String name;

    public MyClass(String name) {
        this.name = name;  //String name 선언 -> 이후 this.name에서 name에다가 값을 할당한것
    }

    //static method = 클래스 메소드 => 객체 없이 호출
    public static void printTest(){
        System.out.println("정적 메소드 = 클래스 메소드");
    }

    //instance method => 호출하려면 객체가 필요함
    public void printTest2() {
        System.out.println("인스턴스 메서드");
        System.out.println("정적 필드인 네임 호출"+name);

    }



    //프로그램 시작점 => 메인함수 (클래스 내부에 존재해야함)
    public static void main(String args[]) {
        //static method call -> object 필요없음
        MyClass.printTest();

        //instance method call -> object 생성해야함
        MyClass obj = new MyClass("Minter");
        obj.printTest2();

        //instance field 
        System.out.println(obj.name);
    }
}
