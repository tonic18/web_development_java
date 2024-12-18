package c08_methods;

import java.util.Scanner;

public class ScoreCalculatorMain {
    public static void main(String[] args) {
        // Scanner import
        Scanner scanner = new Scanner(System.in);
        // ScoreCalculator를 import -> 클래스명 객체명 = new 클래스명();  -> constructor
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        int totalSubjects = 0;
        double score1 = 0;
        double score2;
        double score3;
        // double totalScore = 0으로 선언 및 초기화하는 것은 필수이므로 표시해뒀습니다.
        double totalScore = 0;
        double avgScore = 0;
        boolean endOfCalc = false;

        // 1. 기존 오버라이딩을 이용한 단순 연산자 사용 및 메서드 활용 예제
//        System.out.print("첫번째 과목의 점수를 입력하세요 >>> ");
//        score1 = scanner.nextDouble();
//        System.out.print("두번째 과목의 점수를 입력하세요 >>> ");
//        score2 = scanner.nextDouble();
//        System.out.print("세번째 과목의 점수를 입력하세요 >>> ");
//        score3 = scanner.nextDouble();
//        // 기본 연산자를 활용한 방법
//        System.out.println("총 합은 "+ (score1 + score2 + score3) + "점 입니다.");
//        System.out.println("평균 점수는 "+ ((score1 + score2 + score3)/3) + "점 입니다.");

//        // ScoreCalculator에서 정의한 메서드를 활용한 방법
//        totalScore = scoreCalculator.calculateSum(score1, score2, score3);
//        avgScore   = scoreCalculator.calculateAvg(totalScore, 3);
//        System.out.println("----------------------------------------");
//        System.out.println("총 합은 " + totalScore + "점 입니다(메서드 활용).");
        System.out.println("평균 점수는 " + avgScore + "점 입니다(메서드 활용).");

        // 2. 점수를 누적적을 더할 수 있게끔 작성하는 방식의 프로그래밍
        while (!endOfCalc){     // endOfCalc를 추후 true로 바꾸는 조건을 통해 반복문 종료 예정
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>>");
            score1 = scanner.nextDouble();
            if(score1 == -1){
//                break;      //switch문에서 break문으로 : 반복문 종료할 때 쓰임
                endOfCalc = true;   // endOfCalc라는 변수를 true로 바꿔줌으로써 반복문 종료+
            }

            totalScore = scoreCalculator.calculatorSum2(totalScore, score1);
            totalSubjects++;
            // 입력시마다
            System.out.println("--------- 입력 시마다 나오는 합계와 평균입니다 ---------");
            if (totalScore > 0) {
                avgScore = scoreCalculator.calculateAvg(totalScore, totalSubjects);
                System.out.println("입력한 점수의 합계 : " + totalScore + "\n입력한 점수의 평균 : " + avgScore);
            } else {    // totalSubjects << 0인 경우
                System.out.println("입력한 점수가 없습니다.");
            }
            // test code 삽입

//            System.out.println("총 점은 " + totalScore + "점입니다.\n현재 과목의 수는 " + totalSubjects +"개 입니다.");
        }
        // 분모가 0이면 예외가 발생하기 때문에, totalSubjects가 0초과일 때만 실해되도록 조건문 설정 -> 예외처리의 고전적 방법
//        System.out.println("--------- 최종으로 한 번만 나오는 합계와 평균입니다 ---------");
//        if (totalScore > 0) {
//            avgScore = scoreCalculator.calculateAvg(totalScore, totalSubjects);
//            System.out.println("입력한 점수의 합계 : " + totalScore + "\n입력한 점수의 평균 : " + avgScore);
//        } else {    // totalSubjects << 0인 경우
//            System.out.println("입력한 점수가 없습니다.");
//        }
    }
}
