package week06.pr01;


abstract class Product {
    abstract void func(int money);
}

class Electronics extends Product {
    @Override
    void func(int money) {
        System.out.println(money * 1.1);
    }
}

class Clothing extends Product {
    @Override
    void func(int money) {
        System.out.println(money + 3500);
    }
}


public class Main {
}
