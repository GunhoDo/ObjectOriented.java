package Major;

public class CharacterImpl implements Character {
    public static int day = 1;
    protected String name;
    protected int cost; //피로도
    protected int Str;
    protected int Dex;
    protected int INT;
    protected int Luk;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getCost() {
        return cost;
    }
    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }
    @Override
    public int getStr() {
        return Str;
    }
    @Override
    public void setStr(int str) {
        Str = str;
    }
    @Override
    public int getDex() {
        return Dex;
    }
    @Override
    public void setDex(int dex) {
        Dex = dex;
    }

    @Override
    public int getInt() {
        return INT;
    }
    @Override
    public void setInt(int Int) {
        INT = Int;
    }
    @Override
    public int getLuk() {
        return Luk;
    }
    @Override
    public void setLuk(int luk) {
        Luk = luk;
    }
    public CharacterImpl(){
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

    @Override
    public void Skill() {
        ;
    }
    @Override
    public  void rSkill(){
        ;
    }

    //        characterAct.assignment();
//        characterAct.drinking();
//        characterAct.club();
//        characterAct.exercise();
}