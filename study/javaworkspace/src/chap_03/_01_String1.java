package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); // 28

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함관계
        System.out.println(s.contains("Java")); // 포함된다면 true, 포함되지 않으면 false
        System.out.println(s.contains("c#"));
        System.out.println(s.indexOf("Java")); // 위치 정보
        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 -1 출력
        System.out.println(s.indexOf("and")); //12
        System.out.println(s.lastIndexOf("and"));// 23
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true(아니면 false)
        System.out.println(s.endsWith("C")); // 이 문자열로 끝나면 true (아니면 false)
        
    }   
}
