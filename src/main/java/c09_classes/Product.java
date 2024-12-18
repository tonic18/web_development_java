package c09_classes;

public class Product {
    /*
        여러가지 생성자를 정의하세요
        기본 생성자
        매개변수 생성자

        showInfo()
        실행 예

        1. 기본 생성자 사용

        해당 제품의 시리얼 넘버는 147258이고,
        제품명은 LG제이패드입니다.

        2. 시리얼넘버 사용한 객체 생성

        해당 제품의 시리얼 넘버는 987654이고,
        제품명은 GS충전기입니다.

        3. 제품명을 사용한 객체 생성

        해당 제품의 시리얼 넘버는 159357이고,
        제품명은 피치 패드입니다.

        4. 시리얼넘버 및 제품명을 사용한 객체 생성

        해당 제품의 시리얼 넘버는 4862이고,
        제품명은 블루미플립6입니다.
     */
    int sNum;
    String Pname;

    // 기본 생성자를 직접 만들게 됐을 경우 // call1() 형태가 됩니다.
    Product(){
//        System.out.println("해당 제품의 시리얼 넘버는 147258이고,\n제품명은 LG제이패드입니다.");
    }
    // 매개변수 생성자 -> 기본적으로 만들어지지 않습니다. 개발자가 정의해야 함. call2() 형태가 됩니다.
    Product(int sNum) {
//        System.out.println("해당 제품의 시리얼 넘버는" + sNum + "이고,\n제품명은 GS충전기입니다.");
        this.sNum = sNum;
    }
    Product(String Pname) {
//        System.out.println("해당 제품의 시리얼 넘버는 147258이고,\n제품명은" + Pname + "입니다.");
        this.Pname = Pname;
    }
    Product(String Pname, int sNum) {
//        System.out.println("해당 제품의 시리얼 넘버는" + sNum + "이고,\n제품명은" + Pname + "입니다.");
        this.Pname = Pname;
        this.sNum = sNum;
    }
    // showInfo() 정의
    void showInfo(){
        System.out.println("해당 제품의 시리얼 넘버는 " + sNum + "이고, \n제품명은 " + Pname + "입니다.\n");
    }
}
