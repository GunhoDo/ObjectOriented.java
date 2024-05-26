package test;

import Service.Character;
import Service.SoongsilBreak;
import Service.SoongsilBreakImpl;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int day = 1;
        SoongsilBreak soongsilBreak = new SoongsilBreakImpl();
        Character character = new Character();

        Scanner sc = new Scanner(System.in);

        soongsilBreak.creatEnvironment();
        System.out.println("Welcome to SoongsilBreak");
//        System.out.println("please select Major");
//        System.out.println("1. Worrier, 2. Hwang, 3. Song");
//        int selector = sc.nextInt();
        System.out.println("이름을 설정해주세요");
        String name = sc.next();
        character.setName(name);
        System.out.println("현재 day는 " + day + "day 입니다.");
        while(day<52)
        {
            int n = soongsilBreak.menu(character);
            if (n == 3)break;
            soongsilBreak.characterActivity(n,character);
            soongsilBreak.clearGame(day);
            day++;
            System.out.println("현재 day는 " + day + "day 입니다.");
        }
    }
}
