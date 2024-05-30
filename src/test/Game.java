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
        SoongsilBreak soongsilBreak = SoongsilBreakImpl.getSoongsilBreak();

        //메인메뉴
        int main_menu_n = SoongsilBreakImpl.main_menu();
        if(main_menu_n == 3){
            System.out.println("게임을 종료합니다");
            return;
        }

        //게임 시작(초기 건물 생성 및 캐릭터 생성)
        System.out.println("Welcome to SoongsilBreak");
        SoongsilBreakImpl.creatBuilding(); //건물들 생성
        Character user = CharacterImpl.create_character(); //캐릭터 생성
        user.setName(CharacterImpl.user_name_setting()); //유저 이름 설정

        soongsilBreak.play(soongsilBreak,user);
    }
}
