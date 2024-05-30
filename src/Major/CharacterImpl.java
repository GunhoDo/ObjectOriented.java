package Major;

import java.util.Scanner;

public class CharacterImpl implements Character {
    public static int week = 0; //날짜
    protected String name;
    protected int MP = 20;
    protected int Str = 10;
    protected int Dex = 10;
    protected int INT = 10;
    protected int Luk = 10;



    public static String userNameSetting(){
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
    public int getMP() {
        return MP;
    }
    @Override
    public void setMP(int MP) {
        this.MP = MP;
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
    public void Skill() {} //오버라이드해서 쓰세요
    @Override
    public  void rSkill(){} //오버라이드해서 쓰세요
    @Override
    public void act1(){
        ;
    }
    @Override
    public void act2(){
        ;
    }
    @Override
    public void act3(){
        ;
    }
    @Override
    public void act4(){
       ;
    }
    @Override
    public void act5(){
       ;
    }

}