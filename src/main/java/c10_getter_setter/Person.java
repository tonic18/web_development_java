package c10_getter_setter;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    // 기본 생성자, 매개변수 생성자들 전부 만들어보세요ㅗ.
    // PersonMain.java에서 해당 객체들을 만드세요
    // Person person1 = new Person();
    // Person person2 = new Person("이름");
    // Person person3 = new Person(-100);
    // Person person4 = new Person("사실 나는 사람이 아니다", 1000);
    Person(){
    }
    Person(String Mname){
        this.name = Mname;
    }
    Person(int Mage){
        this.age = Mage;
    }
    Person(String Mname, int Mage){
        this.name = Mname;
        this.age = Mage;
    }
    void showInfo(){
        System.out.println("이름 : " + name + "이고, \n나이 : " + age + "입니다.\n");
    }

    // Setter 및 Getter 정의
    // set변수명() /get변수명()으로 사용하는 편

    // 1. 외부에서 필드에 직접 접근을 하지 못하도록 접근지정자를 설정함

    // 2. Setter의 구조
    //      메서드에 매개변수가 필수적을 ㅗ요구됨 -> 값을 변경하거나 대입할 argument가 필요하기 때문
    //      그리고 retur값이 없음 - > void
    public void setName(String newName){
        this.name = newName;
    }

    // 3. Getter의 구조
    //      데이터를 조회만 하면 되기 때문에 매개변수가 요구되지 않음. 즉 () 형태로 마무리됨.
    //      대신 필드와 동일한 자료형의 return 값이 요구됨 -> void가 아니다.
    public String getName(){
        return name;        // name값을 반환한다는 의미
    }

    public void setAge(int newAge){

        // method 이기 때문에 {} 내부에 코드를 작성할 수 있음.
        // -> 이를 통해 데이터 유효성 검증을 위한 부분을 추가할 수 있음.
        // 조건문을 적용해서 0이상의 값만 입력이 가능하게 끔 코드를 작성 하면 됩니다.

        // 중첩 if 문  사용
//        if (newAge >= 0) {
//            if (newAge < 150) {
//                this.age = newAge;
//            }
//        } else System.out.println("1 ~ 149 사이 입력");
//        //while (newAge == this.age) {
//            if(newAge >= 0 && newAge < 150){
//                this.age = newAge;
//            } else System.out.println("다시 입력하세요");
//        //}

        // 메서드 내에서 사용할 클래스를 import
        Scanner scanner = new Scanner(System.in);

        while (newAge < 0 || newAge >= 150) {
            System.out.println("나이는 0 이상 150 미만이어야합니다. 다시 입력하세요. >>");
            newAge = scanner.nextInt();         // argument로  age를 받았지만, 값이 적절하지 않기 때문에 재입력을 받아서
                                                // age에 '재'대입하는 과정이 필요
        }
        this.age = newAge;
        System.out.println("나이가 정상적으로 업데이트 됨.");
    }





    public int getAge(){
        return age;
    }

    // setAge와 getAge를 정의하고
    // person3의 age를 20으로 변경하고,
    // preson4의 name을 김삼, age를 30으로 변경 후, 바뀐 필드들만 콘솔에 출력하시오
}
