package c09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor0 = new Constructor();    // 기본 생성자는 자동 생성되기 때문에 정의하지 않아도 된 경우

        //constructor0의 필드에 값 대입
        constructor0.num = 38;
        constructor0.name = "박경호";
        // 매개변수 생성자1을 사용하여 생성
        Constructor constructor1 = new Constructor(37);
        constructor1.num = 20;
        constructor1.name = "박박박";

        System.out.println(constructor0.name);
        System.out.println(constructor0.num);
        System.out.println(constructor1.name);
        System.out.println(constructor1.num);
    }
}
