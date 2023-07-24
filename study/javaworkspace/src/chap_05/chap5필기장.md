## chap 5
1. 배열
- 같은 자료형의 값 여러개를 저정하는 연속된 공간
    1. 배열 선언 첫 번째 방법
        - String[] coffees = new String[4]; // 크기 4의 string data를 가지는 배열

    2. 배열 선언 두 번째 방법
        - String coffees[] = new String[4];

    3. 배열 선언 세 번째 방법
        - String[] coffees3 = new String[] {"아메리카노","카페모카", "라떼", "카푸치노"};
    4. 배열 선언 네 번째 방법
        - String[] coffees4 = {"아메리카노","카페모카", "라떼", "카푸치노"};

- 배열 순회
    - enhanced for (for-each) 반복문
        >> for (String coffee : coffees4){ 
            System.out.println(coffee + "하나"); 
        }

2. 다차원 배열
- 선언 방법
    - String[][] seat = {{"A1","A2","A3"},{"B1","B2","B3"},{"C1","C2","C3"}};
- 접근 방법
    - A3에 접근하려면?
        > System.out.println(seat[0][2]);