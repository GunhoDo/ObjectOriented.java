package House;

public class 백마관 extends BuildingImpl{
    public 백마관(){
        Dex = 30;
    }
    @Override
    public void event() {
        System.out.println("나처럼 빨리 달려봐");
        System.out.println("백마가 되어 갑자기 달리기 시작했다, 건물의 민첩성(?)이 상승한다");
        Dex += 20;
        showState();
        once = 1;
    }

    @Override
    public void revent() {
        if (once != 0) {
            Dex -= 20;
            once = 0;
        }
    }
}
