package c05_scanner;

import java.util.Scanner;

public class Input03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String address;
        String phone;
        /*
            이름 : ㅁㄴㅇ
            나이 : 123
            주소 : ㅁㄴㄹㅇㄹ
            연락처 : 01012345678

            사용자 이름은 ㅁㄴㅇ이고, 나이는 123살입니다.
            주소는 ㅁㄴㅇㄹㅇ이며 연락처는 01074457113입니다.
         */
        System.out.print("이름 : ");
        name = scanner.nextLine();
        System.out.print("나이 : ");
        age = scanner.nextInt();        // .nextLine()을 제외한 모든 next계열이 Input02에서 배운 부분에 해당됨
        scanner.nextLine();
        System.out.print("주소 : ");
        address = scanner.nextLine();
        //scanner.nextLine();
        System.out.print("번호 : ");
        phone = scanner.nextLine();
        System.out.println("사용자 이름은 "+ name+ "이고, 나이는 "+ age+"살입니다.");
        System.out.println("주소는 "+ address + "이며 연락처는 "+ phone+"입니다.");
    }
}
