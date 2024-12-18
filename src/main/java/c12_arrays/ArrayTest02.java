package c12_arrays;

import java.util.Scanner;

/*
    String[] names 배열을 선언하고
    출석부의 이름을 입력하도록 하여, names 배열에 집어넣는 프로그램을 작성합니다.

    실행 예
    몇명의 학생을 등록하겠습니까? >> 10
    1번 학생 이름 :
    2번 학생 이름 :
    3번 학생 이름 :
    4번 학생 이름 :
    5번 학생 이름 :
    6번 학생 이름 :
    7번 학생 이름 :
    8번 학생 이름 :
    9번 학생 이름 :
    10번 학생 이름 :

 */
public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 몇개짜리의 방의 배열을 만들 것인가를 count 변수에 초기화
        int count = 0;


        System.out.print("몇 명의 학생을 등록하시겠습니까? >>>");
        count = scanner.nextInt();
        scanner.nextLine();

        //String 배열 선언 및 초기화
        String[] names = new String[count];

        for(int i = 0; i < count; i++){
            System.out.print(i+1 + "번 학생 이름 입력 >>");
            names[i] = scanner.nextLine();
        }
        System.out.println("[출력 결과]");
//        for(int i = 0; i < count; i++){
//            System.out.println(i+1 + ". " + names[i]);
//        }

        for(int i = 0; i < names.length; i++){
            System.out.println(i+1 + ". " + names[i]);
        }


    }
}
