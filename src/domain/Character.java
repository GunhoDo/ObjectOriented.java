package domain;

public class Character {
    private String name;
    private int HP; //체력
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

    public Character(int str, int dex, int Int, int luk){
        HP = 20;
        cost = 20;
        this.Str = str;
        this.Dex = dex;
        this.INT = Int;
        this.Luk = luk;
    }
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
    public void BuildingCheck(Building[] buildings)
    {
        for (Building b : buildings) {
            if(!b.isClear())
            {
                System.out.println(b.getName());
            }
        }
    }
    public void Study()
    {
        INT += 10;
    }
    public Building search(Building[] buildings, String search)
    {
        for(Building b : buildings)
            if (search.equals(b.getName()))
                return b;
        return null;
    }

    public void showState(){
        System.out.println("현재 상태 \n " + "  STR : " + Str + "  INT : " + INT + "  DEX : " + Dex + "  LUK : " + Luk);
    }



}
