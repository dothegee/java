## chap 01
#### 자동완성
- psvm or main

> public static void main(String[] args) {
        
     }

- sout

> System.out.println();


#### 변수
- double과 float 차이 (소수점은 자동으로 double자료형으로 인식)
> double은 일반소수를 넣어 작성 가능

 (ex) double d = 3.14;
> float은 일반 소수 뒤에 F나 f 를 넣어 작성(들어가는 데이터양 적어)

 (ex) float f = 3.14F;

- int와 long 차이 (정수는 자동으로 int자료형으로 인식)
> int는 일반정수를 넣어 작성 가능

 (ex) int i = 123;
> long은 일반 정수 뒤에 L 을 넣어 작성(abs(21억) 이상의 정수를 넣을 때)

 (ex) long l = 123456789123L;

>> 작은 범위 계산을 위해 큰 자료형을 쓰면 그만큼 공간 낭비, 큰 범위 계산을 해야되는데 작은 자료형을 쓰면 에러

#### 변수 이름 짓는 법
1. 저장할 값에 어울리는 이름
2. 밑줄(_), 문자(a, b, c), 숫자(1, 2, 3)
    공백은 사용 불가!!!
3. 밑줄 또는 문자로 시작 가능
4. 한 단어 또는 2개 이상 단어의 연속
5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
6. 예약여 사용 불가 (public, static, void, int, double, float, ...)

#### 상수
- 변수와 상수 작성 법
> 변수

String a = "a"
> 상수

final String A = "a"

* 상수의 변수명은 전부 대문자로 작성

#### 형 변환
- 정수형에서 실수형으로, 실수형에서 정수형으로
> int -> long -> float -> double (자동 형변환)
> 반대로는 직접 형 변환해야됨

(ex) int i = int(98.8)
- 숫자를 문자열로
> String 클래스에서 valueOf()함수, Integer에서 toString, Double에서 toString 호출

(ex1) String s1 = String.valueOf(93);

(ex2) String s1 = Integer.toString(93);

(ex3) String s1 = Double.toString(93.3);
- 문자열을 숫자로
> Integer에서 parseInt, double에서 parseDouble 호출

(ex1) int i = Integer.parseInt("11");

(ex2) double d = Double.parseDouble("98.8");
