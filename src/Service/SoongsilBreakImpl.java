package Service;

import domain.Building;
import domain.Character;

import java.util.Scanner;

public class SoongsilBreakImpl implements SoongsilBreak {
    Building[] buildings = new Building[5];
    int cost = 20;
    int week = 1;

    public void cost(CharacterAct ch)
    {
        ch.setCost(ch.getCost()-10);
        costToWeek(ch);
        System.out.println("현재 cost는 :" + ch.getCost());
        System.out.println("현재 week는 :" + week);
    }
    public void costToWeek(CharacterAct ch)
    {
        if (ch.getCost() <= 0){
            this.week += 1;
            ch.setCost(20);
            this.cost = 20;
        }
    }
    @Override
    public void creatBuilding() {
        buildings[0] = new Building("정보관",20, 20, 10, 10, 10, 10);
        buildings[1] = new Building("조만식",20, 20, 10, 10, 10, 10);
        buildings[2] = new Building("미래관",20, 20, 10, 10, 10, 10);
        buildings[3] = new Building("한경직",20, 20, 10, 10, 10, 10);
        buildings[4] = new Building("중도", 20, 20, 10, 10, 10, 10);
    }

    @Override
    public void init() {
        System.out.println("Welcome to SoongsilBreak");
        System.out.println("please select Major");
        System.out.println("1. DO, 2. Hwang, 3. Song");
        Scanner sc = new Scanner(System.in);
        int selector = sc.nextInt();
        if(selector == 1)
        {
            CharacterAct ch1 = new Character(cost,50,50,0,50);
            System.out.println("order   " + " 1 : enterBuildng    " + "  2 : quit" + "     3 : 공부" + "        4 : 현재 스탯");
            int action= sc.nextInt();
            while(!(action == 2))
            {
                if(week>=52) break;
                int cnt = 0;
                for(Building building : buildings)
                {
                    if (building.isClear()) cnt++;
                }
                if(cnt==5) {
                    System.out.println("claer ㅊㅊ");
                    break;
                }
                if(action == 1) {
                    System.out.println("부수고싶은 건물 이름을 얘기하세요");
                    System.out.println("남은 건물 : ");
                    ch1.BuildingCheck(buildings);
                    String BuildingName = sc.next();
                    Building b = ch1.search(buildings, BuildingName);
                    ch1.EnterBuilding(b);
                    ch1.BuildingCheck(buildings);

                }
                else if(action == 3)
                {
                    ch1.Study();
                    cost(ch1);
                }
                else if(action == 4){
                    ch1.showState();
                }

                System.out.println("order   " + " 1 : enterBuildng    " + "  2 : quit" + "     3 : 공부" + "        4 : 현재 스탯");
                action= sc.nextInt();
            }


        }
        else if(selector == 2)
        {
            Character ch2 = new Character(20,20, 10, 15, 30);
        }
        else if(selector == 3)
        {
            Character ch3 = new Character(20,20, 10, 15, 30);
        }
    }
}