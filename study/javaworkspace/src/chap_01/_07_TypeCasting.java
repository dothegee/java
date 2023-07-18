package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형에서 실수형으로 
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float, double to int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98
        
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = score + 98.8; // 정수형 score 가 자동으로 실수형으로 바뀜
        System.out.println(score_d);

        // 숫자를 문자열로
        String s1 = String.valueOf(score);
        System.out.println(s1);
        s1 = Integer.toString(score);
        System.out.println(s1);

        // 문자열을 숫자로
        int i = Integer.parseInt("11");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);
    }
}