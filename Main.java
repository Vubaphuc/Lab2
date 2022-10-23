import model.Student;
import model.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> lists = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        Student student = new Student();
        int loaiA = 0;
        int loaiB = 0;
        int loaiC = 0;

        while (true) {
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Nhập thông tin học sinh");
            System.out.println("2. Hiển thị thông tin học sinh vừa nhập(tên – avg score( điểm trung bình các môn) – xếp loại): ");
            System.out.println("3. % trung bình từng loại học sinh");
            System.out.println("0. Kết thúc Chương Trình");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    student = studentService.nhap(sc);
                    lists.add(student);
                    break;
                case 2:
                    System.out.format("%-15s %-17s %-10s","Họ Và Tên", "Điểm Trung Bình", "Xếp Loại"+"\n");
                    for (int i = 0; i < lists.size(); i++) {
                        if (lists.get(i).getScoreAll() >= 8) {
                            loaiA++;
                            System.out.format("%-15s %-17s %-10s",lists.get(i).getName(),lists.get(i).getScoreAll(),"Loại A"+"\n");
                        }
                        if (lists.get(i).getScoreAll() < 8 && lists.get(i).getScoreAll() >= 6.5) {
                            loaiB++;
                            System.out.format("%-15s %-17s %-10s",lists.get(i).getName(),lists.get(i).getScoreAll(),"Loại B"+"\n");
                        }
                        if (lists.get(i).getScoreAll() < 6.5) {
                            loaiC++;
                            System.out.format("%-15s %-17s %-10s",lists.get(i).getName(),lists.get(i).getScoreAll(),"Loại C"+"\n");
                        }
                    }
                    break;
                case 3:
                    int tong = lists.size();
                    System.out.println(loaiA);
                    System.out.println("Phần % số học sinh xếp loại A là: "+((loaiA/tong)*100)+"%");
                    System.out.println("Phần % số học sinh xếp loại A là: "+((loaiB/tong)*100)+"%");
                    System.out.println("Phần % số học sinh xếp loại A là: "+((loaiC/tong)*100)+"%");
                    break;
                case 0:
                    System.out.println("Kết Thúc Chương Trình!");
                    System.exit(0);
                    break;
            }
        }
    }
}
