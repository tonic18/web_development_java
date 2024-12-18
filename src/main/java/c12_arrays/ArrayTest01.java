package c12_arrays;
/*
    배열의 필요성 :
        여태까지의 수업을 기준으로 하면 10개의 정수형 데이터를 저장하려면 int 변수를 10개 선언해서 저장했어야함
        배열은 '같은' 자료형의 데이터를 하나의 변수에 저장해서 처리하는 방식입니다.

        선언 방식 :
            자료형[] 변수명 =
            ex)
            int[] arr = new int[5];     // 배열 선언 방식 1 -> 배열을 선언만 하고 후에 값을 대입하는 방식
            int[] arr2 = {1,2,3,4,5};   // 배열 선언 방식 2 -> 배열 선언 및 초기화
            System.out.println(arr);
            System.out.println(arr2)
            를 출력해 보면 [I@36baf30c, [I@7a81197d 와 같은 값이 출력되고 {1,2,3,4,5}와 같은 방식으로 출력 x

            여기서 일반 변수와 참조 변수 개념에 대해 짚고 넘어갈 필요가 있습니다.

            일반 변수 : 데이터를 직접 가지는 변수
                byte, short, int, double 등 기본 데이터 타입(자료형)을 가지는 경우
            참조 변수 : 데이터가 위치한 주소값을 가지는 변수로 해당 주소를 통해서 데이터에 접근하여 값을 가져오거나 변경하는 경우
                String, 배열, 객체(클래스), Collections -> Collections는 추후 수업 예정

 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = new int[5];     // 배열 선언 방식 1 -> 배열을 선언만 하고 후에 값을 대입하는 방식
        // 비어있는 배열에 값을 대입하는 방식
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        int[] arr2 = {1,2,3,4,5};   // 배열 선언 방식 2 -> 배열 선언 및 초기화


//        // 곧장 arr을 출력하고자 하면 주소값이 출력됨.
//        System.out.println(arr);
//        System.out.println(arr2);
        // [I@36baf30c
        // [I@7a81197d
        // 출력값 배열은 [ << 로 시작

        // String은 기본 자료형이 아니라 클래스이기 때문에 실제로는 객체 생성을 통해 데이터를 삽입한다는 근거 :
//        String strExample = new String("안녕하세요");
//        System.out.println(strExample);

        // {1,2,3,4,5}에서 중괄호 내에 있는 각 1,2,3,4,5를 요소(element)라고 부름.
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
        // index 범위를 벗어났기 때문에 오류가 발생하는 코드
//        System.out.println(arr[5]);

        // index 범위를 알고있다고 가정했을 때, 반복문을 통해 배열의 각 요소를 출력할 수 있음.

//        for(int i = 0; i<5; i++){
//            System.out.print(arr[i] + " ");
//        }
        // 그렇다면 학교 전교생 혹은 재직자 숫자와 같이 명확하지 않은 배열에서 각 요소를 출력하기 위한 방법
        // arr 객체의 field인 length를 활용하여 컴퓨터가 알아서 배열의 크기를 찾아서 반복문을 통해 출력하도록 함
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
