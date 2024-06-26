package House;

public class 형남공학관 extends BuildingImpl{
    public 형남공학관(){
        Str = 30;
    }

    @Override
    public void event() {
        System.out.println("공학도로서 문제해결능력도 좋지만 가끔 무식해야만 할 때가 있어");
        System.out.println("공학도가 되어 힘을 발휘했다, 건물의 공격력(?)이 상승한다");
        Str += 20;
        showState();
        once = 1;
    }

    @Override
    public void revent() {
        if (once != 0) {
            Str -= 20;
            once = 0;
        }
    }
}
