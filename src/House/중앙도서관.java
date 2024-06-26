package House;

import java.util.Scanner;

public class 중앙도서관 extends BuildingImpl {
    public 중앙도서관(){
        Str = 10;
        Dex = 10;
        Luk = 10;
        INT = 10;
    }
    @Override
    public void event() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정말 날 부수겠다고? 후회할 거야 분명");
        System.out.println("정말 도서관을 부수시겠습니까? 반드시 네, 아니요로 대답하세주세요");
        String ans = sc.next();
        if (ans.equals("아니요")) {
            Str = 1000;
            Dex = 1000;
            Luk = 1000;
            INT = 1000;
            once = 1;
        }
    }

    @Override
    public void revent() {
        if (once == 1) {
            Str = 10;
            Dex = 10;
            Luk = 10;
            INT = 10;
            once = 0;
        }
    }
}
