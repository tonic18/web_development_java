package c02_variable;
/*
    c02_variable 패키지 생성 -> 패키지 우클릭 new -> java class 클릭 -> Main.java
 */
public class Main {
    public static void main(String[] args) {
        /*
//            변수(variable): 데이터 담는 곳
//         */
//        //논리 자료형 변수     : 참/거짓
//        boolean checkFlag = false; // or true
////      자료형 변수명 = 데이터;      변수 선언 및 초기화 방식
//        System.out.println(checkFlag);
//        //java에서의 변수 표기법 -> 카멜표기법(camel case) : 첫문자는 소문자로 -> 복수 단어 결합시 첫문자는 대문자
//        // 하나짜리 단어 : String example;
//        // 복수 단어    : String exampleOfKorean;
//        checkFlag = true;       // 변수에 데이터 재대입
//        System.out.println(checkFlag);
////        checkFlag2 = true;     // 오류
//        boolean checkFlag3;     // 변수 선언 -> 자료형 변수명;
//        checkFlag3 = true;      // 변수에 값을 최초로 대입하는 것 -> 초기화
        // 최초로 변수를 선언할 때 자료형(data type)을 명시하고 값을 대입하여 초기화함
        // 추후 해당 변수에 값을 재대입 하는 경우에는 변수명 = (바뀐)값; 형태로 작성

        // 2. 문자 자료형 변수
        char name1 = '안';
        char name2 = '근';
        char name3 = '수';
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//        System.out.println(name1+name2+name3); // 복수의 문자들이 표기된 주소가 출력됨
//        System.out.println(""+ name1 + name2 + name3); // java의 sout의 경우 맨 앞의 자료형을 따라감
        // 즉, 큰따옴표로 시작했을 경우 () 내에 있는 전체 자료형을 문자열로 보기 때문에 "안근수" 전체가 출력됨
        /*
            name1, 2, 3에 이름을 한글자씩 대입하고,
            sout을 통해서 콘솔창에 이름이 출력될 수 있도록 작성
         */
        name1 = '박';
        name2 = '경';
        name3 = '호';
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(""+ name1 + name2 + name3);

//        // 3.  정수 자료형 변수
//        int width1 = 100;
//        int width2 = 200;
//        System.out.println(width1);
//        System.out.println(width2);
//        System.out.println(width1 + width2); // 숫자끼리는 연산이 가능
//
//        String width3 = "300";
//        String width4 = "400";
//        System.out.println(width3 + width4); // 문자끼리는 연산이 안되고 나열만 가능
//        System.out.println(width1 + width4); // 정수 + 문자열 = 문자열로 나열 100300
//        System.out.println(width4 + width2); // 문자열 + 정수 = 문자열로 나열 400200
//
//        // 3-1 java17 버전 이후 : 여러줄에 걸친 데이터를 하나의 변수에 대입 가능 큰따옴표 세개
//        String introdution = """
//                박경호
//                IT
//                D-IT
//                INTP
//                """;
//        System.out.println(introdution);
        // 3-2
//        int longNumber = 12345678912;   -> 오류 : int가 표현할수있는 자리수를 넘어서
        long time = System.currentTimeMillis();
        System.out.println(time);
        /*
        int     (4바이트, 32비트)
            범위 : -2^31 ~ 2^31 -1
        long    (8바이트, 64비트)
            범위 : -2^63 ~ 2^63 -1
         */
        // 4. 실수 자료형 변수
//        double pi = 3.141592;
//        System.out.println(pi);
////        int pi2 = 3.14;
//        double dotZero = 3;
        // 5. 상수
        // final 자료형 변수명 = 데이터
        final String FILE_PATH = "c:/parkkyungho_java";
        //상수의 경우 변수명을 대문자로 작성
        final String lowerCaseVar = "소문자변수명";
        System.out.println(lowerCaseVar);
        final String EXAMPLE_OF_FIANL;
        EXAMPLE_OF_FIANL = "이것이 예시입니다.";
        System.out.println(EXAMPLE_OF_FIANL);
//        EXAMPLE_OF_FIANL = "바꾼다" -> 오류 발생
        /*
            상수의 특징
            1) ㄱ발자들끼리 약속으로 상수는 전체 대문자로 작성, 단어사이를 '_'로 표시
            2) 한번의 선언 및 초기화가 가능
            3) 2)를 이유로, 재대입이 불가능
         */
    }
}
