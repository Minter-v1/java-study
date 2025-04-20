package week06.pr06;

//HashSet 임포트
import java.util.HashSet;

public class Main {
   private static String[] arrayList = {"bmw", "kia", "benz", "bmw", "kia"};
   public static void main(String[] args) {
       //HashSet 레퍼런스 변수 정의
       HashSet<String> uniqueName = new HashSet<>();

       for(String name: arrayList) {
           uniqueName.add(name);
       }

       System.out.println(uniqueName.size());
   }
}
