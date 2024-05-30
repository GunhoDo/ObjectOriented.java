package test;

import Major.CharacterImpl;
import Service.*;
import Major.Character;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoongsilBreak soongsilBreak = SoongsilBreakImpl.createSoongsilBreak();

        //메인메뉴
        SoongsilBreakImpl.mainMenu();

        //게임 시작(초기 건물 생성 및 캐릭터 생성)
        SoongsilBreakImpl.creatBuilding(); //건물들 생성
        Character user = SoongsilBreakImpl.createCharacter(); //캐릭터 생성
        user.setName(CharacterImpl.userNameSetting()); //유저 이름 설정

        soongsilBreak.gamePlay(soongsilBreak,user);
    }
}
