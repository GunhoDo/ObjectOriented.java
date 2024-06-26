package House;

import java.util.Iterator;

public class 미래관 extends BuildingImpl{

    public 미래관(){
        Str = 70;
        Dex = 70;
        Luk = 70;
        INT = 70;
    }
    @Override
    public void event() {
        System.out.println("미래에 온걸 환영한다");
        System.out.println("매순간의 선택으로 삶은 변화하는 법이지");
        System.out.println("지금까지 부수지 않은 건물만큼 너의 미래는 암울할 것이다");
        Iterator<Building> iter = buildings.iterator();
        int n = 0;
        while(iter.hasNext()) {
           n++;
           iter.next();
        }
        Str += 10*(n-1);
        Dex += 10*(n-1);
        Luk += 10*(n-1);
        INT += 10*(n-1);
        super.showState();
        once = 1;
    }
    @Override
    public void revent() {
        if(once == 1) {
            Iterator<Building> iter = buildings.iterator();
            int n = 0;
            while(iter.hasNext()) {
                n++;
                iter.next();
            }
            Str -= 10*(n-1);
            Dex -= 10*(n-1);
            Luk -= 10*(n-1);
            INT -= 10*(n-1);
            once = 0;
        }
    }
}
