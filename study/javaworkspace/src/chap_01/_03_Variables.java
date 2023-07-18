package chap_01;

public class _03_Variables {
    public static void main(String[] args) {

        String name;
        // String은 ""로 작성
        name = "doothegee";
        // String name = "doothegee" --> 이것도 가능
        int hour = 15;
        System.out.println(name + ", 안녕하세요?" + hour + "시에 만나요");
        System.out.println(name + ", 오랜만~");

        double score = 90.5;
        // char는 ''로 작성
        char grade = 'A';
        // 변수 name 값 변경
        name = "아이폰";
        System.out.println(name + "점수는 " + score);
        System.out.println("학점은 " + grade);

        boolean pass = true;
        System.out.println("이번 시험에 합격?" + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;
        // 보다 정밀한 소수를 확인하려면 double을 이용
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;

        System.out.println(l);

        l = 1_000_000_000_000L;
        
        System.out.println(l);

    }
}
 