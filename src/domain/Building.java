package domain;

import java.io.StringReader;

public class Building implements BuildingEvent{
    boolean clear;
    private String name;
    private int HP;//건물의 HP 0은 부순 것을 의미

    private int cost; //들어올때 감소되는 피로도

    //입장 요구 능력치
    private int Str;
    private int Dex;
    private int INT;
    private int Luk;

    public Building(String name ,int HP, int cost, int str, int dex, int INT, int luk) {
        this.name = name;
        this.HP = HP;
        this.cost = cost;
        Str = str;
        Dex = dex;
        this.INT = INT;
        Luk = luk;
    }
    public boolean isClear() {
        return clear;
    }

    public void setClear(boolean clear) {
        this.clear = clear;
    }
    public String getName() {
        return name;
    }
    public int getHP() {
        return HP;
    }

    public int getCost() {
        return cost;
    }

    public int getStr() {
        return Str;
    }

    public int getDex() {
        return Dex;
    }

    public int getINT() {
        return INT;
    }

    public int getLuk() {
        return Luk;
    }

    @Override
    public void event() {
        System.out.println("최지웅이 출몰했다");
    }
}