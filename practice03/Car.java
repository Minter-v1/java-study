package practice03;




public class Car {
    
    //total car -> 클래스 모든 요소가 공유해야함
    public static int totalCar = 0;

    //인스턴스 변수 선언 + 생성자를 통한 initialize
    String name; //declare
    public Car(String name){
        this.name = name;
        totalCar ++ ;
    }

    public static void main(String args[]) {
        Car obj1 = new Car("minter");
        Car obj2 = new Car("minter");
        Car obj3 = new Car("minter");

        //static field = 클래스 맴버 변수
        System.out.println(Car.totalCar);
    }
}
