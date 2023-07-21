package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자(escape sequence, escape character, special character)
        // \n, \t, \\, \", \'

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("잼");
        // \n 줄바 꿈
        System.out.println("자바가\n너무\n잼");

        // \t
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t\t5000원");
        // \\ :역슬래시 출력
        System.out.println("C:\\program files\\java");

        // \" 큰따옴표 출력
        System.out.println("C:\\program \"files\"\\java");
    }
}
