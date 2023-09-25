package baitap5cach2;


import java.util.Scanner;

public class Student {

    private String studentId;
    private  String studentName;
    private  boolean gender;
    private  String address;
    private  String  phone;

    public Student() {
    }

    public Student(String studentId, String studentName, boolean gender, String address, String phone) {
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

    public void inputData( Scanner scanner) {

        System.out.print("Nhập mã HS: ");
        studentId =scanner.nextLine();

        System.out.println("Nhập tên hs:");
        studentName = scanner.nextLine();



        while (true){
             System.out.println("nhập giới tính :");
             String sex = scanner.nextLine();

             if(sex.equals("nam")){
                setGender(true);

                break;
            }else if(sex.equals("nữ")) {
                setGender(false);
                 break;
            }else {
                System.out.println("nhập ko đúng vui lòng nhập lại: ");

            }
        }

        System.out.println("nhập địa chỉ: ");
        address =scanner.nextLine();

        System.out.println("nhập vào số điện thoại: ");

        phone =scanner.nextLine();

    }


    public void updateData( Scanner scanner) {
        int choie;
        System.out.println("1. updata tên\n 2. update giới tính\n 3.update địa chỉ\n 4. update số điện thoại");
        System.out.println("nhập vào thông tin muốn thay đổi");
          choie = Integer.parseInt(scanner.nextLine());
          switch (choie){
              case 1:
                  System.out.println("Nhập tên hs:");
                  studentName = scanner.nextLine();
                  break;
              case 2:
                  while (true){
                      System.out.println("nhập giới tính :");
                      String sex = scanner.nextLine();

                      if(sex.equals("nam")){
                          setGender(true);

                          break;
                      }else if(sex.equals("nữ")) {
                          setGender(false);
                          break;
                      }else {
                          System.out.println("nhập ko đúng vui lòng nhập lại: ");

                      }
                  }
                  break;
              case 3:

                  System.out.println("nhập địa chỉ: ");
                  address =scanner.nextLine();
                  break;
              case 4:
                  System.out.println("nhập vào số điện thoại: ");

                  phone =scanner.nextLine();

                  break;
          }









    }
    public void displayData() {
        System.out.println("Mã HS: " + studentId);
        System.out.println("Tên HS: " + studentName);
        System.out.println("Giới tính: " + (gender ? "Nam" : "Nữ"));
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phone);
    }




}
