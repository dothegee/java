package chap_06;

public class _05_Overloading {
    public static int getpower(int num) {
        int answer = num * num;
        return answer;
    }
    public static int getpower(String strnum) {
        int number = Integer.parseInt(strnum);
        int result = number * number;
        return result;
    }
    public static void main(String[] args) {
        
    }
}
