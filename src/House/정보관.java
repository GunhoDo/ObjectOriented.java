package House;

import java.util.Scanner;

public class 정보관 implements Building{

    @Override
    public void event()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("돌발 상황 : 교수님이 등장했다");
        System.out.println("ㅋㅋ 1 + 1 은 ?");
        String answer = sc.next();
        int adder = 0;
        if (answer.compareTo("귀요미") == 0)
        {
            adder = -10;
            System.out.println("정답을 맞췄다 건물의 공격력이 감소한다");
        }
        else
        {
            adder=  10;
            System.out.println("정답을 틀렸다 건물의 공격력이 증가한다");
        }
        Str = Str+adder;
        once = adder;
    }
    @Override
    public void revent()
    {
        if(once != 0)
        {
            Str = Str-once;
        }
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
