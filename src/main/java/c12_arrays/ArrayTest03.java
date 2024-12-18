package c12_arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
    배열의 출력

    이전 수업에서 System.out.println(arr)을 이용하여 출력하면 주소값만 나온다는 사실을 확인했습니다.
    그리고 반복문을 통해서 각 인덱스(주소값)에 저장된 요소(element)들을 불러올 수 있지만,
    배열 전체를 출력하는 방법에 대해서는 아직 수업하지 않았습니다.

    이번에는 배열을 출력하는 방법을 배울 예정입니다.

    'Arrays' 클래스 이용하여, 정적 메서드 .toString(배열명)을 사용하면 배열 전체를 출력할 수 있습니다.
    클래스명.메서드명()이었다는 점에 주의하세요. -> scanner.nextInt()와 다른 방식입니다.
    toString()이라는 메서드 역시 객체명.toString()에서 사용한 적이 있습니다.

    여기서 기억해야 할 점은
    동일한 method 명이라 할지라도 어떤 클래스에 종속돼있냐에 따라서 다른 결과값을 가지고 옵니다.
    예시)
    random.nextInt()와 scanner.nextInt()에서도 본적 있습니다.

 */
public class ArrayTest03 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//
//        System.out.println(Arrays.toString(arr));
//        String[] arr2 = {"일", "이" ,"삼", "사", "오"};
//        System.out.println(Arrays.toString(arr2));
        Integer[] arr3 = {4, 7, 10, 5, 2, 8, 3, 1, 6, 9};
//        System.out.println(arr3.length);
        Arrays.sort(arr3);      // arr3 배열을 오름차순 형태ㅐ로 아예 바꿔버리기 때문에 새로운 변수에 대입하지 않아도 됨
        System.out.println("오름 차순 정렬 배열 : " + Arrays.toString(arr3));

        // 내림 차순 배열
        Arrays.sort(arr3, Comparator.reverseOrder());   // 마찬가지로 재대입하지 않아도 이미 내림차순 정리가 됨.
        // Comparator.reverseOrder() 메서드를 적용하기 위해서는 <T>가 요구되고, T는 클래스여야만하기 때문에
        // int라는 원시 자료형은 해당되지 않음 -> 이 문제를 해결하기 위해 Integer 클래스 도입
        System.out.println("내림 차순 정렬 배열 : " + Arrays.toString(arr3));

    }
}
