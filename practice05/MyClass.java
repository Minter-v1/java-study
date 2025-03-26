package practice05;

public class MyClass {
    abstract class Animal {
        //인스턴스 멤버 변수 declar + 생성자로 initialize
        String name;

        public Animal(String name) {
            this.name = name;
        }

        //자식 클래스가 반드시 구현해야함
        public abstract void sound();
    }

    class Dog extends Animal {

        public Dog(String name){
            super(name); //이렇게 super(필드명); 으로 부모 생성자 호출한다
        }
        
        @Override //메소드 오버라이딩이라는 어노테이션임!
        public void sound() {
            System.out.println("멍멍");
        }
    }
}
