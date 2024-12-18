package c12_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    여태까지 배운 자바 자체 클래스

    Scanner
    Random
    Arrays
    Integer
    Comparator

    Math.random() 메서드
    Java에서 난수를 생성하기 위해 Math.random() 메서드를 사용할 수 있음
    0.0 ~ 1.0 미만의 난수를 반환

    1. index가 10개인 배열을 만들고 Math.random()을 이용하여 값을 집어넣으시오 -> 1~10까지의 int 배열을 만들것
    2. 값이 입력된 배열을 출력할 것
    3. 해당 배열의 합을 구할 것
    4. 짝수만 추출해서 합을 구할 것
 */
public class ArrayTest04 {
    public static void main(String[] args) {

//        double a = Math.random();
//        System.out.println(a);
//
//        // 이상의 메서드를 응용해서 0~9까지의 int가 출력되도록 작성하시오.
//        int b = (int)(Math.random() * 10);
//        System.out.println(b);
//
//        // 이상의 메서드를 응용해서 1~10까지의 int가 출력되도록 작성하시오.
//        int c = (int)(Math.random()*10 +1);
//        System.out.println(c);
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
//        System.out.print("값 입력: ");
        arr[i] = (int)(Math.random()*10 + 1);
        }
        System.out.println(Arrays.toString(arr));
    }
}
