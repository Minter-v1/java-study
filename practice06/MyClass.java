package practice06;


public class MyClass {
    //인터페이스 구현
    interface Flyable {
        void fly();
    }
    
    //static하면 outer클래스 object 생성하지 않아도 된다.
    static class Airplane implements Flyable {
        @Override
        public  void fly(){ //instance method -> Generate object
            System.out.println("비행기가 이륙합니다.");
        }
    }
    

    public static void main(String args[]){
        // static 
        // MyClass outer = new MyClass();
        // Airplane myAirplane = outer.new Airplane();
        Airplane myAirplane = new Airplane();
        myAirplane.fly();
    }
}
