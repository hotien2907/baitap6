package baitap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student("SV1","tien",true,"hanoi","07347394643");
        Student student2 = new Student("SV2","tien2",true,"thanh","06347394643");
        Student student3 = new Student("SV3","tien3",true,"hanoi","0476347394643");


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);


        int choie;
        do {

            System.out.println("===== Menu =====");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng (1-5): ");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choie = sc.nextInt();
                     

            switch (choie){

                case 1:
                    System.out.println("Danh sách học sinh");
                    for (Student student : students) {
                        student.displayData();
                        System.out.println("---------------------------------");
                    }
                    break;
                case 2:
                    Student newStudent = new Student();
                    newStudent.inputData();
                    students.add(newStudent);
                    System.out.println("Học sinh đã được thêm.\n");
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Nhập mã học sinh cần xoá: ");
                    String studentIdToDelete = sc.nextLine();
                    int index = -1;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getStudentId().equals(studentIdToDelete)) {
                            index = i;
                            break;
                        }
                    }

                    if (index != -1) {
                        Student removedStudent = students.remove(index);
                        System.out.println("Học sinh đã bị xóa:");
                        removedStudent.displayData();
                        System.out.println("---------------------------------");
                    } else {
                        System.out.println("Học sinh không tồn tại");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Nhập mã học sinh cần sửa: ");
                    String studentIdToUpdate = sc.nextLine();
                    int updateIndex = -1;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getStudentId().equals(studentIdToUpdate)) {
                            updateIndex = i;
                            break;
                        }
                    }

                    if (updateIndex != -1) {
                        System.out.println("Chọn thông tin cần sửa:");
                        System.out.println("1. Tên HS");
                        System.out.println("2. Giới tính");
                        System.out.println("3. Địa chỉ");
                        System.out.println("4. Số điện thoại");
                        int updateChoice = sc.nextInt();
                        sc.nextLine();

                        switch (updateChoice) {

                            case 1:
                                System.out.print("Nhập tên HS mới: ");
                                String newStudentName = sc.nextLine();
                                students.get(updateIndex).setStudentName(newStudentName);
                                break;
                            case 2:
                                System.out.print("Nhập giới tính mới (true/false): ");
                                boolean newGender = sc.nextBoolean();
                                students.get(updateIndex).setGender(newGender);
                                break;
                            case 3:
                                System.out.print("Nhập địa chỉ mới: ");
                                String newAddress = sc.nextLine();
                                students.get(updateIndex).setAddress(newAddress);
                                break;
                            case 4:
                                System.out.print("Nhập số điện thoại mới: ");
                                String newPhone = sc.nextLine();
                                students.get(updateIndex).setPhone(newPhone);
                                break;
                            default:
                                System.out.println("Chọn sai, vui lòng chọn lại.");
                                break;
                        }
                    } else {
                        System.out.println("Học sinh không tồn tại");
                    }
                    break;




                case 5:
                    System.out.println("Chương trình kết thúc.");
                    break;

                default:
                    System.out.println("chọn sai, vui lòng chọn lai:");
                    break;
            }

        }while (choie !=5);



    }

}
