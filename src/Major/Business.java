package Major;

import java.util.Random;
import java.util.Scanner;

public class Business extends CharacterImpl{
    public Business(){
        Dex = 20;
        Luk = 20;
    }
    @Override
    public void Skill() {
        if (MP >= 5) {
            System.out.println("사업에 성공하기 위해선 좋은 사람을 재빠르게 만나야 합니다.");
            System.out.println("동전던지기 (MP = 5 사용)");
            Random random = new Random();
            Scanner sc = new Scanner(System.in);
            int rand = random.nextInt(2);
            System.out.println("동전던지기에 참여했다 무엇을 낼까 1. 앞, 2. 뒤");
            int ans = sc.nextInt() - 1;
            if (rand == ans) {
                System.out.println("좋은 스타트업 CEO를 만났다 (모든 영구 5 증가)");
                MP -= 5;
                Str += 5;
                Dex += 5;
                INT += 5;
                Luk += 5;
                super.showState();
            } else {
                System.out.println("젠장!, 사기꾼을 만났다");
                System.out.println("난 똑똑하기 때문에 너 따위에겐 안당하지 (스탯 변화 없음)");
                MP -= 5;
            }
        } else {
            System.out.println("마나가 부족해서 스킬 사용이 불가합니다(휴식을 통해 MP를 회복하세요)");
        }
    }
}
