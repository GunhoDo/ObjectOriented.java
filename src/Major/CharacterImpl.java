package Major;

import House.Building;

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
        System.out.println(" _____  _                                _                 _____  _           _   \n" +
                "/  __ \\| |                              | |               /  ___|| |         | |  \n" +
                "| /  \\/| |__    __ _  _ __   __ _   ___ | |_   ___  _ __  \\ `--. | |_   __ _ | |_ \n" +
                "| |    | '_ \\  / _` || '__| / _` | / __|| __| / _ \\| '__|  `--. \\| __| / _` || __|\n" +
                "| \\__/\\| | | || (_| || |   | (_| || (__ | |_ |  __/| |    /\\__/ /| |_ | (_| || |_ \n" +
                " \\____/|_| |_| \\__,_||_|    \\__,_| \\___| \\__| \\___||_|    \\____/  \\__| \\__,_| \\__|");
        System.out.println("STR : " + Str + ", DEX : " + Dex + ", INT : " + INT + ", LUK : " + Luk + ", MP : " + MP );
    }
    @Override
    public void Skill() {}
    @Override
    public void act1(){
        System.out.println("운동을 하여 힘과 민첩성이 향상 되었다");
        Str += 10;
        Dex += 5;
    }
    @Override
    public void act2(){
        System.out.println("알바를 하여 민첩과 운이 상승하였다");
        Dex += 10;
        Luk += 5;
    }
    @Override
    public void act3(){
        System.out.println("과제를 하여 지능이 상승하였다");
        INT += 15;
    }
    @Override
    public void act4(){
        System.out.println("술을 마셔서 운이 상승하였다");
        Luk += 15;
    }
    @Override
    public void act5(){
        if (Building.getBuilding("중앙도서관") != null) {
            System.out.println("도서관에 가서 휴식을 취했다");
            MP = 20;
        } else {
            System.out.println("저런...!!! MP의 원천인 성스러운 도서관을 부수다니");
            System.out.println("MP를 회복할 수 없습니다.");
        }
    }
}