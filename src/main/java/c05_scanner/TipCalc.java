package c05_scanner;

import java.util.Scanner;

public class TipCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
            음식점에서 팁을 계산하는 것을 원화 기준으로 한다면?

            10, 12, 15 퍼센트 중 하나를 선택

            인원수를 입력 받아서, 더치페이를 할 수 있도록 구현

            ex)
            100,000원 짜리 음식을 결제하고, 팁으로 10퍼센트를 준다면
            전체 음식값은 110,000원이 된다.
            5명이서 나눈다면, 22,000원이 결과값이 된다.
         */
        // 1. 음식 가격을 입력 받아야 함 -> 물어보고 / 입력 받는다 -> Scanner
        // 2. 몇 % 팁을 낼 건지 입력 받아야 함
        // 3. 입력받은 %에서 / 100을 연산 해야 함.
        // 4. 3의 결과값 * 1의 결과값을 하게 되면 팁의 가격이 나옴.
        // 5. 1의 결과값 + 4의 결과값을 하면 전체 음식 가격이 나옴.
        // 6. 인원수를 입력 받아야ㅎ함.
        // 7. 5의 결과값 / 6의 결과값 = 팁을 합산한 더치페이 가격이 산출됨.

//        int foodPrice;
//        int percent;
//        int tip;
//        int totalPrice;     //
//        int people;         // 더치페이인원
//        int pricePerPerson; // 1인당 지불값
//        System.out.print("음식값 : ");
//        foodPrice = scanner.nextInt();
//        System.out.println("팁(10, 12, 15) : ");
//        percent = scanner.nextInt();
//        tip = foodPrice * percent/100;
//        System.out.println("tip : "+ tip);
//        //totalPrice 연산
//        totalPrice = foodPrice + tip;
//        System.out.println("totalPrice: "+ totalPrice);
//        System.out.println("인원수 : ");
//        people = scanner.nextInt();
//        pricePerPerson = totalPrice / people;
//        System.out.println("더치페이 값 : "+ pricePerPerson);

        int foodPrice;
        int percent;
        double percentModified; // 선언해서 작성하는 이유는 percent를 int로 고정시켰을경우
                                // 수식을 쓰는 방식이 제한됨
        double totalPrice;
        int persons;
        double pricePerPerson;
        String logo = """
                             /¯¯¯¯¯¯\\        '/¯¯¯¯¯¯\\        '              |\\¯¯¯¯\\   |\\¯¯¯¯¯¯¯\\    _        '      |\\¯¯¯¯¯¯¯\\    _        '                '|\\¯¯¯¯¯¯¯'\\_ \s
                           '/       °'   /|       |\\       °    \\           /¯¯¯¯¯/\\|       | '  \\'\\            '\\  _        '       \\'\\            '\\  _        '        '/¯¯¯¯¯¯¯/          \\ \s
                          /            /:'|       |':\\            \\     '  '/         / '/____/|  _'\\'\\            '\\                 _'\\'\\            '\\                  /            '/\\           '|\s
                        '/  '°        /\\\\/¯¯¯¯¯\\//\\       °   '\\ _ '  |         |  |:::::::|:|  _  \\|            '|          '      _  \\|            '|          '      '|            '|:'|          °|\s
                       /             \\'|\\______/|/              \\ '   |         ¯\\|:::::::|/_      |            '|/¯¯¯¯¯¯¯\\       |            '|/¯¯¯¯¯¯¯\\  '|            '|:'|          °|\s
                     '/    °         /||'|::::::::::|'||\\        '°     \\   |         _/'¯¯¯¯   _    /            '/'/\\            |'     /            '/'/\\            |' '|            '|'/           /|\s
                    /________/:'|'\\|::::::::::|/|:'\\________ \\ '|\\         \\'|\\¯¯¯°*\\  _'/________/:/______°/'| _'/________/:/______°/'| |\\            \\______/:'|°
                    |::::::::::::::|::| '¯¯¯¯¯¯  |::|:::::::::::::::'| |:'\\_____\\\\|        |°  |::::::::::::::'|:|::::::::::::|:|   |::::::::::::::'|:|::::::::::::|:| |:'\\_______\\::::::::'|::|°
                    |::::::::::::::|:'/               \\:|:::::::::::::::'| |::|:::::::::|/____'/|°  |::::::::::::::'|:|::::::::::::|:|   |::::::::::::::'|:|::::::::::::|:| |::'|::::::::::::'|::::::::|:'/°
                    |::::::::::::::|/                 '\\|:::::::::::::::'| \\°'|:::::::::|::::::*'|:|°  |::::::::::::::'|/|::::::::::::|/_  |::::::::::::::'|/|::::::::::::|/_'\\':|::::::::::::'|::::::::|/  \s
                    '¯¯¯¯¯¯¯¯   _'                '¯¯¯¯¯¯¯¯¯ *'\\|:::::::::|::::::'°|:|°  '¯¯¯¯¯¯¯¯³  ¯¯¯¯¯¯¯ '    '¯¯¯¯¯¯¯¯³  ¯¯¯¯¯¯¯ '    \\|::::::::::::'|¯¯¯¯³'  _'
                
                """;
        System.out.println(logo);
        System.out.print("음식값 : ");
        foodPrice = scanner.nextInt();
        System.out.println("팁(10%, 12%, 15%) : ");
        percent = scanner.nextInt();
        // double로 percent를 형 변환
        percentModified = percent / 100;
        System.out.println("percnetModified :" + percentModified);
        //totalPrice = foodPrice + percentModified*foodPrice;
        totalPrice = foodPrice * (1+ (percentModified));
        System.out.println("totalPrice : "+ totalPrice);
        System.out.println("인원수 : ");
        persons = scanner.nextInt();
        pricePerPerson = totalPrice/persons;
        int ppp = (int) pricePerPerson; // 변수 선언을 해당 위치에서 한 이유는 형변환을 위해서는 반드시
                                        // pricePerPerson이 초기화돼야하기 때문
        System.out.println("더치페이 값 : "+ (int)pricePerPerson);
        System.out.println("더치페이 값 : "+ ppp);



    }
}
