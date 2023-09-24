package baitap6;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;
    public Employee() {
        this.employeeId = "";
        this.employeeName = "";
        this.age = 0;
        this.gen = "";
        this.rate = 0.0;
        this.salary = 0.0;
    }

    public Employee(String employeeId, String employeeName, int age, String gen, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }


    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã nhân viên: ");
        this.employeeId = scanner.nextLine();

        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        this.gen = scanner.nextLine();

        System.out.print("Nhập hệ số lương: ");
        this.rate = scanner.nextDouble();

        // Tính lại lương sau khi nhập hệ số lương mới
        this.salary = calSalary();
    }

    // Phương thức tính lương
    public double calSalary() {
        return rate * 1300000;
    }

    public void displayData() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gen);
        System.out.println("Hệ số lương: " + rate);
        System.out.println("Lương: " + salary);
        System.out.println("------------------------");
    }
}
