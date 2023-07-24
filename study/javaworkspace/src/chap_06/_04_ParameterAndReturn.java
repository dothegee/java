package chap_06;

public class _04_ParameterAndReturn {
    public static int getpower(int num) {
        int answer = num * num;
        return answer;
    }
    public static int powerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int a = getpower(7);
        System.out.println(a);
        int b = powerByExp(7, 3);
        System.out.println(b);
    }
}
