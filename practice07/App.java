package practice07;

import java.util.ArrayList;

public class App {

    static void setDivide(){
        for(int i=0; i < 10; i++){
            System.out.print('-');
        }
        System.out.println("");
    }

    public static void main(String args[] ){
        //Generate object
        ArrayList<String> myList = new ArrayList<>();

        myList.add("사과");
        myList.add("바나나");
        myList.add("키위");

        App.setDivide();

        //for-each
        for(String item: myList) {
            System.out.println(item);
        }

        App.setDivide();

        //forEach() + 람다식
        myList.forEach(item -> System.out.println(item));

        App.setDivide();

        //메서드 참조
        myList.forEach(System.out::println);
        App.setDivide();
    }
}