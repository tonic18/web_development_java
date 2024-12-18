package c09_classes;

public class ProductMain {
    public static void main(String[] args) {
        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();       -> 이제는 new 클래스명()에서 '클래스명()'이 기본 생성자라는 사실

        //1번 지시사항 - 기본 생성자 사용
        Product product1 = new Product();
        // 기본 생성자를 사용했다는 말은 객체 생성 시 속성에 아무런 값을 대입하지 않았다는 의미이므로
        // 추가적인 코드 작성을 통해 속성에 값을 대입해야만 함
        // 예시를 위한 product1.showInfo() 메서드 확인
        product1.Pname = "LG제이패드";
        product1.sNum = 147258;
        product1.showInfo();

        //2번 지시사항 - 시리얼 넘버 매개변수 생성자 사용
        Product product2 = new Product(987654);
        product2.Pname = "GS충전기";
        product2.showInfo();
        //3번 지시사항 - 제품명 매개변수 생성자 사용
        Product product3 = new Product("피치패드");
        product3.sNum = 159357;
        product3.showInfo();
        //4번 지시사항 - 시리얼 넘버 및 제품명 매개변수-3 생성자 사용
        Product product4 = new Product("블루미플립6", 4862);
        product4.showInfo();

        int productNum;
        String productName;
        }
    }

