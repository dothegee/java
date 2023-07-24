package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees4 = {"아메리카노","카페모카", "라떼", "카푸치노"};

        for (int i = 0; i < 4; i++){
            System.out.println(coffees4[i] + " 하나");
        }
        System.out.println("주세요");

        for (int i = 0; i < coffees4.length; i++) {
            System.out.println(coffees4[i] + " 하나");
        }

        // enhanced for (for-each) 반복문
        for (String coffee : coffees4){
            System.out.println(coffee + "하나");
        }
    }
}
