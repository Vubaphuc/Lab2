package model;

import java.util.*;

public class StudentService {
    ArrayList<Student> lists = new ArrayList<>();
    public Student nhap(Scanner sc){
        System.out.println("Nhập ID học sinh: ");
        String id = sc.nextLine();
        System.out.println("Nhập họ và tên học sinh: ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm môn toán");
        double scoreMath = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm môn Vật lý");
        double scorePhysic = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm môn Hóa");
        double scoreChemistry = Double.parseDouble(sc.nextLine());
        double scoreAll = (scoreChemistry + scoreMath + scorePhysic)/3;
        Student student = new Student(id,name,scoreMath,scorePhysic,scoreChemistry,scoreAll);
        return student;
    }


}
