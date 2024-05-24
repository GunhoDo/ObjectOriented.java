package domain;

import Service.CharacterAct;

public class Character implements CharacterAct {
    private String name;
    private int HP; //체력

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    private int cost; //피로도
    private int Str;

    private int Dex;
    private int INT;
    private int Luk;

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

    public Character(int cost, int str, int dex, int Int, int luk){
        HP = 20;
        this.cost = 20;
        this.Str = str;
        this.Dex = dex;
        this.INT = Int;
        this.Luk = luk;
    }
    @Override
    public void EnterBuilding(Building building)
    {
        if(building.getStr() < this.Str && building.getDex() < this.Dex && building.getINT() < this.INT && building.getLuk() < this.Luk)
        {
            building.setClear(true);
            System.out.println("건물깨기에 성공 하셨습니다");
        }
        else{
            System.out.println("건물깨기에 실패 하셨습니다");
        }
    }
    @Override
    public void BuildingCheck(Building[] buildings)
    {
        for (Building b : buildings) {
            if(!b.isClear())
            {
                System.out.println(b.getName());
            }
        }
    }
    @Override
    public void Study()
    {
        INT += 10;
    }
    @Override
    public Building search(Building[] buildings, String search)
    {
        for(Building b : buildings)
            if (search.equals(b.getName()))
                return b;
        return null;
    }

    @Override
    public void showState(){
        System.out.println("현재 상태 \n " + "  STR : " + Str + "  INT : " + INT + "  DEX : " + Dex + "  LUK : " + Luk);
    }

}