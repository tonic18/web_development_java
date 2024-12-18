package c19_generic.wildcards.wildcard_practice;

public class Tiger extends Animal{

    // 상속 받은 메서드
    @Override
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    // 호랑이 고유 메서드
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
    // Human.java 가ㅣ서 toString 애너테이션 쓰고, 오버라이드해서
    // 사람이 두발로 뜁니다. 하세요ㅕ
}
