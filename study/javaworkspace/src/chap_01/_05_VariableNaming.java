package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(a, b, c), 숫자(1, 2, 3)
        //  공백은 사용 불가!!!
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약여 사용 불가 (public, static, void, int, double, float, ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "길동"; // 이름
        String lastName = "홍"; // 성
        String dateOfBrith = "1919-03-01"; //생년월일
        String residentialAddress = "호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국 목적
        String flightNo = "KOR123456"; // 항공편명
        String _flightNo = "KOR123456"; // 항공편명
        String flight_no_2 = "KOR123456";
        
        int accompany = 2; //동반 가족수
        int lengthOfStay = 5; //체류 기간

        String item1 = "옷";
        String item2 = "시계";

        // 프로그램의 흐름을 위해 사용되는 경우 (크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = "";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";

    }
}

