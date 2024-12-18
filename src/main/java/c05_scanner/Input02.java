package c05_scanner;

import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("x : ");
//        int x = scanner.nextInt();
//        System.out.println("y: ");
//        int y = scanner.nextInt();
//        System.out.println((x+y));
//        System.out.println(x+y);

        /*
            평균 계산기를 작성하시오

            지시사항
            1. 사용자로부터 세개의 실수를 입력 받아, 이 숫자들의 평균 및 합을 계산하고 출력
            2. 사용자에게 첫번째 실수를 입력 받으시오
            3. 사용자에게 두번째 실수를 입력 받으시오
            4. 사용자에게 세번째 실수를 입력 받으시오
            5. 총합과 평균을 계산하고 출력하세요

            실행 예
            첫번째 실수 >> 100
            두번째 실수 >> 80
            세번째 실수 >> 60
            총합 : 240
            평균 : 80
         */
        System.out.print("첫번째 실수 입력 >>");
        double f1 = scanner.nextDouble();
        System.out.print("두번째 실수 입력 >>");
        double f2 = scanner.nextDouble();
        System.out.print("세번째 실수 입력 >>");
        double f3 = scanner.nextDouble();
        double total = (f1+f2+f3);
        double avg   = total/3;
        System.out.println("총합 : " + total);
        System.out.println("평균 : " + avg);
    }
}
