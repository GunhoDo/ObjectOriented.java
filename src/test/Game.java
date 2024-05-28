package test;

import Major.CharacterImpl;
import Service.*;
import Major.Character;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        SoongsilBreak soongsilBreak = new SoongsilBreakImpl();

        Scanner sc = new Scanner(System.in);

        Character character = soongsilBreak.creatEnvironment();

        System.out.println("이름을 설정해주세요");
        String name = sc.next();
        character.setName(name);

        System.out.println("현재 day는 " + CharacterImpl.day + "day 입니다.");
        while(!(CharacterImpl.day==52))
        {
            int n = soongsilBreak.menu(character);
            if (n == 3)break;
            soongsilBreak.characterActivity(n,character);
            soongsilBreak.clearGame();
            CharacterImpl.day++;
            System.out.println("현재 day는 " + CharacterImpl.day + "day 입니다.");
            soongsilBreak.day_by_day(character);
        }
    }
}
