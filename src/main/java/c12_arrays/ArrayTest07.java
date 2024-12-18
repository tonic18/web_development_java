package c12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    while 반복문을 돌려서 5번 로또 번호 추출을 가능하게 하는 프로그램을 작성할 예정

    1~45까지의 숫자를 임의로 생성한 후, lootoNumbers라는 배열에 저장할 것
    로또 번호 6 -> index가 6개인 배열 : 게임 한번
    5개 만들어져야 함 -> 총 5000원치

    중복 제거와 관련된 부분이 걸릴 수 있다 -> getter / setter 학습한 부분 확인

    실행 예

    '여기부분에로또로고 출력해주세요'

    로또 번호 추첨기에 오신 것을 환영합니다. 5게임을 시작합니다. -> '5'는 String이 아닐 것
    이번 로또 당첨 번호는 다음과 같습니다.
    [3, 12, 25, 13, 24, 21]
    [3, 25, 25, 13, 24, 21]
    [3, 12, 25, 13, 24, 21]
    [3, 12, 25, 13, 24, 21]
    [3, 12, 25, 13, 24, 21]
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        // 필요한 객체 생성
        // random.nextInt(a) 의 의미 : 0부터 a-1까지의 int를 임의적으로 생성함.
        Random random = new Random();

        // 필요한 변수 선언
        int[] lottoNumbers = new int[6];
        int count = 5;      //횟수에 해다하는 count 변수
        boolean duplicate = false;  // duplicate : 중복 // false일 경우에만
        // lottoNumbers 배열에 element를 추가하면 됨
        int number;
        String logo = """
                LLLLLLLLLLL                  OOOOOOOOO     TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT     OOOOOOOOO    \s
                L:::::::::L                OO:::::::::OO   T:::::::::::::::::::::TT:::::::::::::::::::::T   OO:::::::::OO  \s
                L:::::::::L              OO:::::::::::::OO T:::::::::::::::::::::TT:::::::::::::::::::::T OO:::::::::::::OO\s
                LL:::::::LL             O:::::::OOO:::::::OT:::::TT:::::::TT:::::TT:::::TT:::::::TT:::::TO:::::::OOO:::::::O
                  L:::::L               O::::::O   O::::::OTTTTTT  T:::::T  TTTTTTTTTTTT  T:::::T  TTTTTTO::::::O   O::::::O
                  L:::::L               O:::::O     O:::::O        T:::::T                T:::::T        O:::::O     O:::::O
                  L:::::L               O:::::O     O:::::O        T:::::T                T:::::T        O:::::O     O:::::O
                  L:::::L               O:::::O     O:::::O        T:::::T                T:::::T        O:::::O     O:::::O
                  L:::::L               O:::::O     O:::::O        T:::::T                T:::::T        O:::::O     O:::::O
                  L:::::L               O:::::O     O:::::O        T:::::T                T:::::T        O:::::O     O:::::O
                  L:::::L               O:::::O     O:::::O        T:::::T                T:::::T        O:::::O     O:::::O
                  L:::::L         LLLLLLO::::::O   O::::::O        T:::::T                T:::::T        O::::::O   O::::::O
                LL:::::::LLLLLLLLL:::::LO:::::::OOO:::::::O      TT:::::::TT            TT:::::::TT      O:::::::OOO:::::::O
                L::::::::::::::::::::::L OO:::::::::::::OO       T:::::::::T            T:::::::::T       OO:::::::::::::OO\s
                L::::::::::::::::::::::L   OO:::::::::OO         T:::::::::T            T:::::::::T         OO:::::::::OO  \s
                LLLLLLLLLLLLLLLLLLLLLLLL     OOOOOOOOO           TTTTTTTTTTT            TTTTTTTTTTT           OOOOOOOOO \s
                """;
        //b = random.nextInt(a);

        // lottoNumbers[0] = random.nextInt(45) + 1;
        // number = random.nextInt(45) + 1;
        // if(lottoNumbers[0] == number){
        //  // 같으면 한번더 random.nextInt()가 있어야함
        // }
        // lottoNumbers[1] = number; // 이 코드가 실행된다면 lottoNumbers[0] != number이기 때문

        System.out.println(logo);
        System.out.println("로또 번호 추첨기에 오신 것을 환영합니다.");
        System.out.println("이번 로또 추천 번호는 다음과 같습니다.");
        //배열 출력
        //중복체크 조건문
        for(int j = 0; j < count; j++){
            for (int i = 0; i < lottoNumbers.length; i++) {
                number = random.nextInt(45) + 1;
                if(lottoNumbers[i] == number){
                    return;
                }else lottoNumbers[i] = number;

            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
        }
    }
}
