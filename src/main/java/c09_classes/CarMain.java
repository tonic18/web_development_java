package c09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "빨강";     // myCar. 찍으면 자동완성으로 f color로 나오는데 field의 축약어입니다.
        Car yourCar = new Car();
        yourCar.color = "노랑";

        myCar.drive();      // myCar. 찍으면 자동완성으로 m drive로 나오는데, method의 축약어입니다.
        yourCar.stop();
    }
}
