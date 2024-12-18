package c11_access_modifiers;

public class StudentAcessModifierMain {
    public static void main(String[] args) {
        // 기본생성자
//        StudentAccessModifier studentAccessModifier1 = new StudentAccessModifier();
//        // Setter를 통해서 데이터 입력
//        studentAccessModifier1.setStudentName("박경호");
//        studentAccessModifier1.setStudentAvg(100);
//        studentAccessModifier1.setStudentCode(20241205);
//        // showInfo() 메서드를 통해서 객체 정보 출력
//        studentAccessModifier1.showInfo();

        // 새로운 객체를 student01로 생성하는데, 생성 시에 이름을 "여러분이름"으로 만들어주세요.
        // 점수는 4.5, 학번은 10101로 입력하세요. -> 아직 없는 값에 대입
        // "여러분이름"을 "이일"로 고치세요       -> 기존에 있는 값에 재 대입
        // 고친 이름을 콘솔창에서 확인하기 위해 getter를 사용하세요
        // 이름이 "이일"로 고쳐졌다면, showinfo()를 통해 전체 정보를 콘솔에 출력하세요.
        StudentAccessModifier student01 = new StudentAccessModifier("박경호");
        System.out.println(student01.getStudentName());
        student01.setStudentAvg(4.5);
        student01.setStudentCode(10101);
        student01.setStudentName("이일");
        System.out.println(student01.getStudentName());
        // 이름이 "이일"로 고쳐졌다면, showinfo()를 통해 전체 정보를 콘솔에 출력하세요
        // showinfo()의 경우 메서드 내에 sout으로 처리했기 때문에 getter 정보를 출력할 때와
        // 코드가 다릅니다. 주의하시기 바랍니다.

        student01.showInfo();
        // c12_arrays class ArrayTest01
    }
}
