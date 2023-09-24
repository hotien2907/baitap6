package baitap4;
import static baitap4.Fan.HIGHT;
import static baitap4.Fan.MEDIUM;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(HIGHT,true,10,"yellow");
        Fan fan2 = new Fan(MEDIUM,false,5,"blue");


        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2);
    }
}
