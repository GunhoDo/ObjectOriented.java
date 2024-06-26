package House;

import java.sql.SQLOutput;

public class 웨스터민스터홀 extends BuildingImpl{
    public 웨스터민스터홀(){
        INT = 30;
    }
    @Override
    public void event() {
        System.out.println("여기는 법대학생회관이 있는 곳이죠 지능이 뛰어나야만 합니다만??");
        System.out.println("갑자기 머리를 쓰기 시작했다, 건물의 지능(?)이 상승한다");
        INT += 20;
        showState();
        once = 1;
    }

    @Override
    public void revent() {
        if (once != 0) {
            INT -= 20;
            once = 0;
        }
    }
}
