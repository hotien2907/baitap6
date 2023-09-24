package baitap5;

import java.util.Scanner;

public class Student2 {

    private String studentId;
    private  String studentName;
    private  boolean gender;
    private  String address;
    private  String  phone;

    public Student2() {
    }

    public Student2(String studentId, String studentName, boolean gender, String address, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputData() {

        Scanner  scanner = new Scanner(System.in);
        System.out.print("Nhập mã HS: ");
        studentId =scanner.nextLine();

        System.out.println("Nhập tên hs:");
        studentName = scanner.nextLine();
        System.out.println("nhập giới tính :");
        gender = scanner.nextBoolean();
           scanner.nextLine();
        System.out.println("nhập địa chỉ: ");
             address =scanner.nextLine();

        System.out.println("nhập vào số điện thoại: ");

        phone =scanner.nextLine();

    }

    public void displayData() {
        System.out.println("Mã HS: " + studentId);
        System.out.println("Tên HS: " + studentName);
        System.out.println("Giới tính: " + (gender ? "Nam" : "Nữ"));
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phone);
    }




}
