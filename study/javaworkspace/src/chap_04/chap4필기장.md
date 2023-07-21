## chap 4
1. if elseif else 문 

if (조건1){

    수행할 명령

}

else if (조건2)

else{

    수행할 명령

}

2. SwitchCase
- case별 break 일 때 

switch (expression) {

    case A: 수행할 명령

        break;

    case B: 수행할 명령

        break;

    case C: 수행할 명령

        break;

    ...

    default: 수행할 명령

}
- 마지막 case에만 break 일때

switch (expression) {

    case A: 수행할 명령


    case B: 수행할 명령


    case C: 수행할 명령

        break;

}

--> case가 A이면 break가 있는 곳 까지 내려감. 따라서 A, B, C 명령을 모두 수행

- if else 문은 여러 조건 또는 범위에 해당하는 조건일때,
- switch문은 명확한 케이스가 있는 경우

3. for 문

for (int i = 0; i < 10; i++ ){

}

4. while 문

while (조건){


}

--> 조건이 참인 동안 반복 수행

5. do while 문

do{

} while(조건);

- while 문은 조건을 먼저 보고 할지 말지 결정
- do while문은 우선 먼저 한번을 실행하고 반복할지 말지 결정