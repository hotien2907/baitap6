package baitap5cach2;

import baitap5cach2.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];
        Student student1 = new Student("sv01", "tiên", true, "hà noi", "038637354");
        Student student2 = new Student("sv02", "hoang", true, "hà noi", "2");
        students[0] = student1;
        students[1] = student2;
        int choice = 0;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.print("Nhập vào lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("**Danh sách học sinh**");
                    for (Student student : students) {
                        if (student != null) {
                            student.displayData();
                            System.out.println("---------------------------------");
                        } else {
                            break;
                        }
                    }
                    break;

                case 2:

                    Student newStudent = new Student();
                    for (int i = 0; i < students.length; i++) {
                                   if(students[i] ==null){
                                       students[i] = new Student();
                                       students[i].inputData(sc);
                                       System.out.println("*thêm mới thành công*");
                                       students[i].displayData();
                                   }else {
                                       continue;
                                   }


                        break;

                    }

                break;
                case 3:
                    System.out.print("nhập vào mã nhân viên muốn update: ");
                    String idEdit = sc.nextLine();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null && students[i].getStudentId().equals(idEdit)) {
                            students[i].updateData(sc);
                            break;
                        } else if (i == students.length - 1) {
                            System.out.println("không tìm thấy học sinh trong danh sách");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Nhập mã học sinh cần xóa: ");
                    String idDelete = sc.nextLine();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null && students[i].getStudentId().equals(idDelete)) {
                            students[i] = null;
                            System.out.println("xóa thành công !!!");
                            break;
                        } else if (i == students.length - 1) {
                            System.out.println("không tìm thấy học sinh trong danh sách");
                        }
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("hãy nhấp số từ 1-5");
            }
        } while (choice != 5);
    }
}
