package House;

import java.util.Scanner;

public class 정보과학관 extends BuildingImpl {
    public 정보과학관() {
        Str = 15;
        Dex = 15;
        Luk = 15;
        INT = 15;
    }

    @Override
    public void event() {
        System.out.println("21세기에 컴퓨터를 다룰 수 있으려면 모든 걸 잘해야 하지");
    }
    @Override
    public void revent() {}
}
