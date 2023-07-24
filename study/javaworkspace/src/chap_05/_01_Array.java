package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 선언 첫 번째 방법
        String[] coffees = new String[4]; // 크기 4의 string data를 가지는 배열

        // 배열 선언 두 번째 방법
        // String coffees[] = new String[4];
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";

        // 배열 선언 세번째 방법
        String[] coffees3 = new String[] {"아메리카노","카페모카", "라떼", "카푸치노"};

        String[] coffees4 = {"아메리카노","카페모카", "라떼", "카푸치노"};

        System.out.println(coffees[1]);
        System.out.println(coffees3[2]);
        System.out.println(coffees4[3]);
    }
}
