package c06_condition;

import java.util.Scanner;

public class Condition02 {
    public static void main(String[] args) {
        /*
            else if는 여러 조건이 나올 수 있음 즉,
            if(조건식1) {
                실행문1
            }else if (조건식2) {
                실행문2
            }}else if (조건식3) {
                실행문3
            }}else {
                실행문4
            }
            점수를 입력하면 점수대에 맞는 등급을 산출하는 프로그램을 작성하시오.
            100 ~ 90 : A
            89 ~ 80  : B
            79 ~ 70  : C
            69 ~ 60  : D
            59 이하   : F
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.print("점수: ");
//        int score = scanner.nextInt();
//        if(score > 89){
//            System.out.println("A");
//        }else if  (score > 79){
//            System.out.println("B");
//        } else if (score > 69) {
//            System.out.println("C");
//        } else if (score > 59) {
//            System.out.println("D");
//        }else if (score < 60){
//            System.out.println("F");
//        }else {
//            System.out.println("??");
//        }

        // 1) score 변수 하나인 버전
        // 2) score 변수와 String grade; 2개를 이용한 버전
//        String grade;
//        if(score > 89){
//            grade = "A";
//        }else if  (score > 79){
//            grade = "B";
//        } else if (score > 69) {
//            grade = "C";
//        } else if (score > 59) {
//            grade = "D";
//        } else if (score < 60){
//            grade = "F";
//        } else {
//            grade = "??";
//        }
//        System.out.println("grade : "+ grade);

        // 상수를 사용한 데이터를 제공했을 때 이에 맞춰서 조건문을 작성하시오.
        final int VIP_POINT     = 80;
        final int GOLD_POINT    = 60;
        final int SILVER_POINT  = 40;
        final int BRONZE_POINT  = 20;

        // 변수 하나짜리


        // 변수 두개짜리
        int point;
        String grade = "";
        System.out.print("포인트 입력 : ");
        point = scanner.nextInt();
        if(point> VIP_POINT){
            grade = "VIP";
        } else if (point > GOLD_POINT) {
            grade = "GOLD";
        } else if (point > SILVER_POINT) {
            grade = "SILVER";
        } else if (point > BRONZE_POINT) {
            grade = "BRONZE";
        }else {
            grade = "일반";
        }
        System.out.println("당신의 포인트 : " + point + " " + "회원등급 : " + grade);
        //실행 예
        // 회원 포인트 점수를 입력하세요ㅕ >> 18
        // 당신의 포인트는 18점이고, 등급은 일반(vip, gold, silver, bronze) 등급입니다.
    }
}
