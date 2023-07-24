package chap_06;

public class _02_Parameter {
    public static void power(int num) {
        int answer = num * num;
        System.out.println(answer);
    }
    public static void powerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        power(4);
        powerByExp(2, 3);
    }
}
