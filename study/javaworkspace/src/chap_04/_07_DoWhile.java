package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m

        int height = 25; // 키 2m

        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3;
        }
        System.out.println("도착!!!!!!");

        distance = 25; // 전체 거리 25m
        move = 0; // 현재 이동 거리 0m

        height = 25; // 키 2m
        do{
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착!!!!!!");
    }
}
