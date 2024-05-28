package Major;

public class Engineer extends CharacterImpl {
    public Engineer(){ //예를들어 공대생 STR 110으로 시작
        Str += 100;
    }

    @Override
    public void Skill() { //단과대별 스킬
        System.out.println("Engineer스킬 아직 없음");
    }
    @Override
    public void rSkill() { //스킬 ㅣ사용 후 원상 복구 필요하면 사용
        System.out.println("구현 필요");
    }
}
