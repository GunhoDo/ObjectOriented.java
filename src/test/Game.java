package test;

import House.Building;
import House.미래관;
import House.정보관;
import Major.CharacterImpl;
import Service.*;
import Major.Character;

import javax.swing.*;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //메인메뉴
        int main_menu_n;
        main_menu_n = SoongsilBreakImpl.main_menu();
        if(main_menu_n == 3){
            System.out.println("게임을 종료합니다");
            return;
        }

        //게임 시작(초기 건물 생성 및 캐릭터 생성)
        System.out.println("Welcome to SoongsilBreak");
        SoongsilBreak soongsilBreak = new SoongsilBreakImpl();
        SoongsilBreakImpl.creatBuilding(); //건물들 생성
        Character user = CharacterImpl.create_character(); //캐릭터 생성
        user.setName(CharacterImpl.user_name_setting()); //유저 이름 설정


        //게임 플레이(참고해서 함수 따기) //지워도 되긴 함, 일단 남겨놓음
//        System.out.println("현재 날짜 : " + CharacterImpl.day + "일 입니다.(52일 종료)");
//        while(!(CharacterImpl.day==52))
//        {
//            int n = soongsilBreak.menu(user);
//            if (n == 3)break;
//            soongsilBreak.characterActivity(n,user);
//            soongsilBreak.clearGame();
//            CharacterImpl.day++;
//            System.out.println("현재 day는 " + CharacterImpl.day + "day 입니다.");
//            soongsilBreak.day_by_day(user);
//        }


        //게임 플레이(진짜 시작)
        //인자로 SoongsilBreak soongsilBreak, Character user 주면 될듯 //이 줄은 지워도 됨
        soongsilBreak.play(soongsilBreak,user);
    }
}
