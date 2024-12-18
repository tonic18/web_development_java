package c10_getter_setter;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//         Person person1 = new Person();
//         person1.name = "박경호";
//         person1.age = 20;
//         person1.showInfo();
//         Person person2 = new Person("박경호");
//         person2.age = 20;
//         person2.showInfo();
//         Person person3 = new Person(-100);
//         person3.setAge(-20);
//         person3.showInfo();
//         Person person4 = new Person("사실 나는 사람이 아니다", 1000);
//        System.out.println(person4);
//         person4.setName("김삼");
//         person4.setAge(30);
//         person4.showInfo();

         // 접근지정자 private 코드 삽입 후에는 오류가 발생하기 때문에 주석 처리했습니다.
//        System.out.println(person4.name);
//        System.out.println(person4.age);
        //  person4.name = "사실은 동물이다";      -> 이상을 이유로 name 필드에 직접 접근을 하여 값을 변경하는 것도 불가능
 //       System.out.println(person3.getAge());
 //       System.out.println(person4.getName());
        //      System.out.println(person4.getAge());
        Person person5 = new Person("김사");
                person5.setAge(150);
    }
}
