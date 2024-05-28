package Major;

import java.util.Scanner;

public class CharacterImpl implements Character {
    public static int day = 0; //날짜
    protected String name;
    protected int cost = 20; //피로도? 마나느낌?
    protected int Str = 10;
    protected int Dex = 10;
    protected int INT = 10;
    protected int Luk = 10;

    public static CharacterImpl create_character(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("please select Major");
            System.out.print("1. IT, 2. Engineer 3.직업 추가하셈 4.직업 설명\n입력 : ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    return new IT();
                case 2:
                    return new Engineer();
                case 4:
                    System.out.println("====캐릭터별 스탯, 스킬 설명====");
                    break;
                default:
                    System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력하세요.");
                    break;
            }
        }
    }

    public static String user_name_setting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("캐릭터의 이름을 설정해주세요. 이름 : ");
        return sc.next();
    }
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

    @Override
    public void showState(){
        System.out.println("=========현재 스탯=========");
        System.out.println("STR : " + Str + ", INT : " + INT + ", DEX : " + Dex + ", LUK : " + Luk);
        System.out.println("=========================");
    }
    @Override
    public void study(){
        System.out.println("공부해서 지력이 10 증가합니다.");
        INT += 10;
    }
//    characterAct.assignment();
//    characterAct.drinking();
//    characterAct.club();
//    characterAct.exercise();

    @Override
    public void Skill() {} //오버라이드해서 쓰세요
    @Override
    public  void rSkill(){} //오버라이드해서 쓰세요


}