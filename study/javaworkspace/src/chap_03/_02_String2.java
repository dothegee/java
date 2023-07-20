package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // and를 ,로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 출력
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("java"), s.indexOf("."))); // "java"가 시작하는 위치 부터, "."이 시작하는 위치 바로 앞까지
        // 공백 제거
        s = "              I love Java             .";
        System.out.println(s);
        System.out.println(s.trim());

        
    }
}
