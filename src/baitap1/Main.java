package baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5, "blue");

        // Hiển thị thông tin
        System.out.println("Thông tin hình tròn 1:");
        circle1.displayData();

        System.out.println("\nThông tin hình tròn 2:");
        circle2.displayData();

        // Nhập thông tin cho hình tròn 1 từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập bán kính cho hình tròn 1:");
        double radiusInput = scanner.nextDouble();
        System.out.println("Nhập màu sắc cho hình tròn 1:");
        String colorInput = scanner.next();

        circle1.inputData(radiusInput, colorInput);

        // Hiển thị thông tin sau khi nhập
        System.out.println("\nThông tin hình tròn 1 sau khi nhập:");
        circle1.displayData();

    }
}
