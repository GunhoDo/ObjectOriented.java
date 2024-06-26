package Major;

public class IT extends CharacterImpl {
    public IT() {
        Str = 15;
        Dex = 15;
        INT = 15;
        Luk = 15;
    }
    @Override
    public void Skill() {
        if (MP >= 10) {
            System.out.println("난 모든 걸 창조할 수 있어(MP = 10 사용)");
            System.out.println("IT대생은 만능이기 때문에 모든 스탯이 일시적으로 20 증가합니다.");
            MP -= 10;
            Str += 20;
            Dex += 20;
            INT += 20;
            Luk += 20;
            super.showState();
            MP += 1;
        }
        else{
            System.out.println("마나가 부족해서 스킬 사용이 불가합니다(휴식을 통해 MP를 회복하세요)");
        }
    }
}