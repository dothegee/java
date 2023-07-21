## chap 3
- 문자열의 길이 체크
> String s = "I like Java and Python and C";

> System.out.println(s.length()); // 28

- 대소문자 변환
1. 대문자로 변환
> System.out.println(s.toUpperCase()); 

-> I LIKE JAVA AND PYTHON AND C
2. 소문자로 변환
> System.out.println(s.toLowerCase());

-> i like java and python and c

- 포함 관계
    - 포함된다면 true, 포함되지 않으면 false
>   > System.out.println(s.contains("Java"));

--> True
>   > System.out.println(s.contains("c#"));

--> false

- 위치 정보
> System.out.println(s.indexOf("Java"));

--> 7 (J의 시작점 index 출력)
> System.out.println(s.indexOf("C#")); 

--> -1 (포함되지 않는 단어를 찾게 되면 -1 출력)
> System.out.println(s.indexOf("and"));

--> 첫번째 index값 출력
> System.out.println(s.lastIndexOf("and"));

--> 마지막 일치하는 위치 정보 (23)

- 문자열 변환
> System.out.println(s.replace(" and", ",")); 

--> and를 ,로 변환

> System.out.println(s.substring(7)); 

> System.out.println(s.substring(s.indexOf("Java")));

--> 인덱스 기준 7부터 출력
>System.out.println(s.substring(s.indexOf("java"), s.indexOf("."))); 

--> "java"가 시작하는 위치 부터, "."이 시작하는 위치 바로 앞까지
- 공백 제거
> s = "              I love Java             .";

> System.out.println(s);

> System.out.println(s.trim());

- 문자열 비교
1. .equals(), equalsIgnoreCase() 로 비교
> String s1 = "Java";

>String s2 = "Python";

>System.out.println(s1.equals(s2));

--> false
>System.out.println(s1.equals("Java"));

--> true
>System.out.println(s2.equals("python"));

--> flase (대소문자 구분 때문에)
> System.out.println(s2.equalsIgnoreCase("python")); 

--> 대소문자 구분없이 문자열 내용이 같은지 check

2. 문자열 비교 (심화)
- 참조
> String s1 = "1234";
> String s2 = "1234";
> new String s3 = "1234";
> new String s4 = "1234";
>> System.out.println(s1.equals(s2));

    --> s1과 s2의 내용 비교 --> True
>> System.out.println(s1 == s2);

    --> s1과 s2의 참조 비교 --> True
>> System.out.println(s3.equals(s4));

    --> s3와 s4의 내용 비교 --> True
>> System.out.println(s3 == s4);

    --> s3와 s4의 참조 비교 --> False (서로 다른 메모리에 1234를 저장)

3. 특수문자
- \n

--> 줄바꿈
- \t

--> tab과 같은 기능 들여쓰기
- \\

--> \를 출력을 위해

--> (ex)System.out.println("C:\\program files\\java");  -->C:\program files\java 출력

- \"

--> 문자열 안에 "를 출력하기 위해

-->System.out.println("C:\\program \"files\"\\java"); --> C:\program "files"\java 출력