package baitap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = input.nextDouble();

        System.out.print("Nhập giá trị b: ");
        double b = input.nextDouble();

        System.out.print("Nhập giá trị c: ");
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("Nghiệm 1 = " + equation.getRoot1());
            System.out.println("Nghiệm 2 = " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Nghiệm kép = " + equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

}
