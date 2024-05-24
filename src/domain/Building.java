package domain;

public class Building {
    boolean clear;
    private int HP;//건물의 HP 0은 부순 것을 의미

    private int cost; //들어올때 감소되는 피로도

   //입장 요구 능력치
    private int Str;
    private int Dex;
    private int INT;
    private int Luk;

    public Building(int HP, int cost, int str, int dex, int INT, int luk) {
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


}
