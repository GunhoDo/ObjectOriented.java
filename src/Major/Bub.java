package Major;

public class Bub extends CharacterImpl {
    public Bub(){
        INT = 30;
    }

    @Override
    public void Skill() { //단과대별 스킬
        if (MP >= 10) {
        System.out.println("법적으로 내일을 오늘로 정하겠습니다. (MP 소모, INT 영구 5 소모)");
        CharacterImpl.week -= 1;
        MP -= 10;
        INT -= 5;
        System.out.println("법은 시간을 다스렸다고 한다");
        }
        else System.out.println("마나가 부족해서 스킬 사용이 불가합니다(휴식을 통해 MP를 회복하세요)");
    }
}
