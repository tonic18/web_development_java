package c19_generic.wildcards;

import java.util.ArrayList;
import java.util.List;

// 하한 제한 와일드카드
public class WildcardExample03 {
    public static void addNumbers(List<? super Integer> list){
        // 추가하는 갯수를 고정시킨 상태로 할거라 일반적인 for문으로 작성할겁니다.
        for (int i = 0; i < 6; i++){
            list.add(i);            // 나중에 수업할 건데 list에 요소 추가하는
                                    // 메서드가 .add()입니다.
        }
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);

        System.out.println(numbers);        // 이부분도 예전에 배운 Array와 차이가 있음

        // List<? super Integer>는 Integer와 그 상위 타입(ex) Number, Object)만 허용
        // 데이터를 추가하는 것은 안전하지만, 읽을 때는 항상 Object 타입으로 반환됨

        // wildcards 패키지 내에 wildcard_practice 패키지 생성
        // Animal/Car/Human/Tiger/Main/AnimalData 클래스 생성ㅎ
    }
}
