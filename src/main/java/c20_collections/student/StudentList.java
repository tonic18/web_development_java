package c20_collections.student;

import java.util.ArrayList;
import java.util.List;

/*
    d
 */
public class StudentList {
    public static void main(String[] args) {

        // 비어있는 List 선언
        List<Student> students = new ArrayList<>();

        // 20240001 강미경
        // 20240002 강준석
        // 20240003 김은수
        // 20240004 박경호
        // 20240005 박수빈
        // 을 추가하세요

        Student student1 = new Student(20240001, "강미경");
        students.add(student1);
        students.add(new Student(20240002, "강준석"));
        students.add(new Student(20240003, "강준삼"));
        students.add(new Student(20240004, "강준사"));
        students.add(new Student(20240005, "강준오"));

        System.out.println(student1);
        System.out.println(students.get(0));
        students.get(0).setName("김일");
        System.out.println(students.get(0).getName());

        // 추가후에 전체 리스트를 출력하세요
    }

}
