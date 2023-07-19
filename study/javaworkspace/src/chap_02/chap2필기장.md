## chap 2
#### 연산자
1. 산술 연산자
- System.out.println(4 + 2); // 6
- System.out.println(4 - 2); // 2
- System.out.println(4 * 2); // 8
- System.out.println(4 / 2); // 2 몫
- System.out.println(5 / 2); // 2 몫
- System.out.println(4 % 2); // 0 나머지
- System.out.println(5 % 2); // 1 나머지

2. 증감 연산 (++, --)
> int val;

> val = 10;

> System.out.println(val); // 10

> System.out.println(++val); // 11

> System.out.println(val); // 11

> System.out.println(val++); // 11

> System.out.println(val); // 12

3. 논리 연산자
- OR연산자 (||)

    A||B||C (A or B or C) --> 하나라도 ture 면 true

- AND 연산자 (&&)

    A&&B&&C (A and B and C) --> 모두 true 면 true

- 논리 부정 연산자

    !(true) --> false 출력


4. 삼항 연산자
> (결과) = (조건) ? (참의경우 결과값) : (거짓의 경우 결과값)

> (ex)  int max = (x > y) ? x : y;