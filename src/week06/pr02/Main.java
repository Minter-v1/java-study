package week06.pr02;

import java.util.Scanner;
abstract class Device {
    abstract String turnOn();
    abstract String turnOff();
}
class TV extends Device {
    @Override
    String turnOn() {
        return "TVon";
    }

    @Override
    String turnOff() {
        return "TVoff";
    }
}

class Light extends Device {
    @Override
    String turnOn() {
        return "Lighton";
    }

    @Override
    String turnOff() {
        return "Lightoff";
    }
}
class SmartHome {
    //기기를 선택하고 -> 기기를 키고 끈다
    static void controlDevice(String device) {
        //TV 호출
        if (device.equals("TV")) {
            TV tv = new TV();
            System.out.print(tv.turnOn()+"/"+tv.turnOff());
        }
        else {
            Light light = new Light();
            System.out.println(light.turnOn()+"/"+light.turnOff());
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Device:");
        String device = sc.next();
        SmartHome.controlDevice(device);


    }
}
