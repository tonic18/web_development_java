package c05_scanner;

import java.util.Scanner;

public class BandName {
    public static void main(String[] args) {
        // Scanner class를 import -> 콘솔창에 입력을 하기 위해
        Scanner scanner = new Scanner(System.in);

        // 변수 선언 -> 초기화하지 않음
//        String name;
//        String age;
//        String school;
//        String mbti;
//
//        System.out.print("이름 무엇입니까? >>>");
//        name = scanner.nextLine();
//        System.out.print("나이 무엇입니까? >>>");
//        age = scanner.nextLine();
//        System.out.print("학교 무엇입니까? >>>");
//        school = scanner.nextLine();
//        System.out.print("mbti 무엇입니까? >>>");
//        mbti = scanner.nextLine();
//
//        System.out.println("제 이름은 " +  name + "이고, " + "나이는 " + age + "살입니다.");
//        System.out.println(school + "에 재학 중이며, MBTI는 " + mbti + "입니다.");

        // pantsColor, lastFood 변수를 선언 -> String
        // 입려ㅓㄱ 받기 위한 안내문을 작성하고, 변수에 데이터를 대입하세요.
        // 지금 입은 하의 색깔이 무엇인가요?
        // 마지막으로 먹은 음식이 무엇인가요?
        // pantsColor와 lastFood를 이용하여 밴드 네임을 출력하세요.
        // 당신의 밴드 이름은 그레이 시리얼입니다.
        System.out.println("지금 입은 하의 색깔이 무엇인가요?");
        String pantsColor = scanner.nextLine();
        System.out.println("마지막으로 먹은 음식이 무엇인가요?");
        String lastFood = scanner.nextLine();
        System.out.println("당신의 밴드 이름은 " + pantsColor +" "+ lastFood + "입니다.");
        String logo = """
                 .-.;;;;;;'                    .;.  \s
                (_)  .;                       ;;;'  \s
                     :  .    .-.`..:.   .-.  .;'    \s
                   .:'   `:  ;   ;;  :.;.-' .-.     \s
                 .-:._    `.'    ;;_.` `:::'`-'     \s
                (_/  `--.;'     .;'                 \s
                
                """;
        System.out.println(logo);

        // 2. 변수 선언 따로 초기화 따로
//        String pantsColor;
//        String lastFood;
//        System.out.println("지금 입은 하의 색깔이 무엇인가요?");
//        pantsColor = scanner.nextLine();
    }
}
