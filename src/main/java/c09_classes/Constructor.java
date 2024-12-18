package c09_classes;
/*
    생성자(Constructor)
    생성자는 객체가 생성될 때 호출되는 특별한 메서드
    ClassExample example = new ClassExample();에서 'new ClassExample()'이 생성자에 해당됨. (생성될때 동시에 호출됨)

    특징
    1. 클래스의 이름과 생성자 이름은 동일하다.(즉, 다른 메서드들과 달리 대문자로 시작한다.)
    2. return값이 없다. 마치 call1(), call2() 유형같은 식으로 받아들일 수 있습니다.
    3. 객체 초기화 : 생성자는 객체의 필드 초기화를 담당한다.

    생성자의 정의 방식
    1. 기본 생성자 : 매개변수가 없는 생성자(사실 클래스를 만들 때 default로 생성되어 정의하지 않아도 될 때가 있음)
    2. 매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자
 */
public class Constructor {
    // 필드(속성) 선언
    int num;
    String name;

    // 기본 생성자를 직접 만들게 됐을 경우 // call1() 형태가 됩니다.
    Constructor(){
        System.out.println("NoArgsConstructor(기본생성자)");
    }
    // 매개변수 생성자 -> 기본적으로 만들어지지 않습니다. 개발자가 정의해야 함. call2() 형태가 됩니다.
    Constructor(int number){
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)" + number);
        this.num = number;  // this : 해당 클래스에서 객체를 만들게 되면 객체 이름으로 대체되는 것.
                            // 즉, '이객체의 num 필드에 number를 대입하겠다'는 의미가 됨.
                            // 여기서 여러분이 명심하셨으면 하는 바는 매개변수 number와 멤버변수 num과는
                            // 대입 연산자 = 전까지는 서로 다른 개념입니다.

    }
}
