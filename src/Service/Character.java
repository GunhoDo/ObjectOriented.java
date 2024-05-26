package Service;

import domain.Building;

public class Character implements CharacterAct {
    private String name;
    private int HP;
    private int cost; //피로도
    private int Str;
    private int Dex;
    private int INT;
    private int Luk;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }
    @Override
    public int getCost() {
        return cost;
    }
    public void setStr(int str) {
        Str = str;
    }

    public int getStr() {
        return Str;
    }

    public void setDex(int dex) {
        Dex = dex;
    }

    public int getDex() {
        return Dex;
    }

    public void setInt(int Int) {
        INT = Int;
    }

    public int getInt() {
        return INT;
    }

    public void setLuk(int luk) {
        Luk = luk;
    }

    public int getLuk() {
        return Luk;
    }

    public Character(){
        HP = 20;
        this.cost = 20;
        this.Str = 10;
        this.Dex = 10;
        this.INT = 10;
        this.Luk = 10;
    }
    @Override
    public void showState(){
        System.out.println("STR : " + Str + "  INT : " + INT + "  DEX : " + Dex + "  LUK : " + Luk);
    }
    @Override
    public void study()
    {
        INT += 10;
    }

//        characterAct.assignment();
//        characterAct.drinking();
//        characterAct.club();
//        characterAct.exercise();
}