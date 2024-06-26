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
        System.out.println("건물 요구 스탯 : STR = " + Str + ", DEX = " + Dex + ", INT = " + INT + ", LUK = " + Luk);
    }

    @Override
    public int isOnce() {
        return once;
    }
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

