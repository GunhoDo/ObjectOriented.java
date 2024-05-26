package Service;

import domain.Building;
import domain.미래관;
import domain.정보관;

import java.util.Scanner;

public class SoongsilBreakImpl implements SoongsilBreak {

    @Override
    public void creatEnvironment() {
        Building.buildings.add(new 정보관());
        Building.buildings.add(new 미래관());
    }

    @Override
    public int menu(Character ch) {
        Scanner sc = new Scanner(System.in);
        System.out.println("안녕하세요. " + ch.getName() + "님 무엇을 도와드릴까요?");
        ch.showState();
        Building.showClear();
        System.out.println("1. enterBuildng, 2. study 3. quit");
        return sc.nextInt();
    }
    @Override
    public void characterActivity(int n, Character ch) {

        if (n == 1) {
            enterBuilding(ch);
        } else if (n == 2) {
            ch.study();
            ch.showState();
        }
    }
    @Override
    public void enterBuilding(Character ch) {

        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 건물을 부수고 싶으신가요?");
        Building.showClear();
        String want = sc.next();
        System.out.println("해당 건물은 다음과 같습니다 도전하시겠습니까?");
        Building.getBuilding(want).showState();
        System.out.println("1. 도전, 2. 포기");
        int n = sc.nextInt();
        if (n == 1)
        {
            if (Building.getBuilding(want).isOnce() == 0) {
                Building.getBuilding(want).event();
            }
            if (ch.getStr() >= Building.getBuilding(want).getStr() && ch.getDex() >= Building.getBuilding(want).getDex()
                    && ch.getInt() >= Building.getBuilding(want).getINT() && ch.getInt() >= Building.getBuilding(want).getLuk()) {
                System.out.println("도전에 성공했습니다.");
                Building.remove(want);
            }
            else
            {
                System.out.println("도전에 실패했습니다.");
                Building.getBuilding(want).revent();
            }
        }
    }
    @Override
    public void clearGame(int day)
    {
        if(Building.isClear())
        {
            if (day < 5)
            {
                System.out.println("이럴 수가 단 " + day + "일 만에 모두 부숴버렸군요!");
            }
            System.out.println("축하드립니다. 모든 건물을 파괴하셨습니다. 숭실대는 이제 당신껍니다");
            System.exit(0);
        }
    }
}