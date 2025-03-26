package practice04;

//하나의 소스파일에는 public class는 반드시 하나만 존재하고 그냥 class는 여러 개 존재 가능
public class Super {
    class Animal {
        
        void sound(){
            System.out.println("동물이 소리를 냅니다.");
        }
    }

    //클래스 상속!!
    //class 자식 extends 부모
    class Dog extends Animal {
        void bark() {
            System.out.println("멍멍!");
        }
    }

    //프로그램 시작점
    public static void main(String args[]) {
        Super outer = new Super(); //외부 public class 인스턴스를 생성해야 한다
        Animal obj1 = outer.new Animal(); //내부 클래스 인스턴스 생성해야한다
        Dog dog = outer.new Dog(); //동일하게 내부 클래스 인스턴스 생성해야한다


        dog.bark();
        dog.sound(); //상속 받았기 때문에 슈퍼클래스 메소드 접근 가능
    }
}
