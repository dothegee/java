package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean kimchi = true;
        boolean fork = true;
        boolean beef = false;

        System.out.println(kimchi || fork || beef); // || == or
        System.out.println(kimchi&&fork&&beef);// && == and

        System.out.println((5 > 3) && (3 > 1)); //5는 3 보다 크고, 3은 1보다 크다면 true
        System.out.println(5 > 3 && 3 > 1); // 같은 결과

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
