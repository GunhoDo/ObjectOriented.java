package domain;

public class 미래관 implements Building{
    @Override
    public void event()
    {
        System.out.println("미래에 온걸 환영한다");
        once = 1;
    }
    @Override
    public void revent()
    {
        once = 0;
    }

    @Override
    public void showState() {
//        System.out.println("HP = " + HP);
        System.out.println("Str = " + Str);
        System.out.println("Dex = " + Dex);
        System.out.println("INT = " + INT);
        System.out.println("Luk = " + Luk);
    }

    private int once;
//    private int HP = 10;
//    private int cost = 10;

    private int Str = 10;
    private int Dex = 10;
    private int INT = 10;
    private int Luk = 10;

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
