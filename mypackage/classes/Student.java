package mypackage.classes;

public class Student {
    String name;
    int grade; 


    //생성자 -> 초기화(값을 초기값으로 할당하는 것) -> 파이썬은 선언과 할당을 동시에 해줌(동적 타이핑)
    public Student(String n, int g){ // 생성자는 클래스명 그대로 사용하면 됨
        System.out.println("생성자 호출됨");
        // name = name; 자바에선 이거 안되나?
        name = n;
        grade = g;
    }

    //인스턴스 메서드 -> 인스턴스 생성해서 해야함
    public void sayName() {
        System.out.println("이름은"+name); //전역변수니까 가져올 수 있음
        System.out.println("학년은 "+grade);
    }

    //클래스 메서드 static 만들어보자
    public static void testFun(){
        System.out.println("클래스 메서드 실행했음");
    }

    //프로그램 시작점
    public static void main(String args[]){
        Student s1 = new Student("minter", 3);
        s1.sayName();

        //클래스 메서드 실행
        Student.testFun();
    }

}
