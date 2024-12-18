package c15_casting.centralcontroll;

public class LED implements Power{
    @Override
    public void on() {
        System.out.println("LED의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("LED의 전원을 끕니다.");
    }

    // 지시사항 1번 -> CentralControl로 넘어가
    public void changeColor(){
        System.out.println("색깔 바꿈");
    }
}
