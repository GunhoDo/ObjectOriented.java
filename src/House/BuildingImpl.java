package House;

public class BuildingImpl implements Building{
    protected int Str = 10;
    protected int Dex = 10;
    protected int INT = 10;
    protected int Luk = 10;
    protected int once;

    @Override
    public void event() {} //하위 클래스에 오버라이드 하세요
    @Override
    public void revent(){} //하위 클래스에 오버라이드 하세요
    @Override
    public void showState() {
//        System.out.println("HP = " + HP);
        System.out.println("건물 요구 스탯 : Str = " + Str + ", INT = " + INT + ", Dex = " + Dex + ", Luk = " + Luk);
    }


//    private int HP = 10;
//    private int cost = 10;



    @Override
    public int isOnce() {
        return once;
    }
    //    public int getHP() {
//        return HP;
//    }
//    public int getCost() {
//        return cost;
//    }
    @Override
    public int getStr() {
        return Str;
    }
    @Override
    public int getDex() {
        return Dex;
    }
    @Override
    public int getINT() {
        return INT;
    }
    @Override
    public int getLuk() {
        return Luk;
    }
}

