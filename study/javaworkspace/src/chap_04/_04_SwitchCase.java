package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // if 문을 통해
        int ranking = 1; // 1등
        if (ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking == 2){
            System.out.println("반액 장학금");
        } else if (ranking == 3){
            System.out.println("반액 장학금");
        } else{
            System.out.println("장학금 대상 아님");
        }
        System.out.println("if문");

        //switch 문을 통해
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            // case 2:
            //     System.out.println("반액 장학금");
            //     break;
            // case 3:
            //     System.out.println("반액 장학금");
            //     break;
            default:
                System.out.println("대상 아님");

        }
        System.out.println("switch문");
        
    }
}
