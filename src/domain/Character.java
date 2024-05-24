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
        Str = Str;
        Dex = dex;
        INT = Int;
        Luk = luk;
    }
    public void EnterBuilding(Building building)
    {
        if(building.getStr() < this.Str && building.getDex() < this.Dex && building.getINT() < this.INT && building.getLuk() < this.Luk)
        {
            System.out.println("건물깨기에 성공 하셨습니다");
            building.setClear(true);
        }
    }
}
