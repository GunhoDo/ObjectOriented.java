package Major;

public class IT extends CharacterImpl {
    public IT(){ //예를들어 IT대생 Dex 110으로 시작
        Dex += 100;
    }
    @Override
    public void Skill() {
        if (cost >= 5) {
            System.out.println("INT 증가 스킬을 사용합니다");
            System.out.println("cost가 5 감소합니다.");
            cost = cost - 5;
            INT = INT + 10;
        }
        else{
            System.out.println("코스트가 부족해서 스킬 사용이 불가합니다.");
            System.out.println("약을 쳐 먹고 cost를 늘리세요");
        }
    }
    @Override
    public void rSkill() {
        INT -= 10;
    }
}