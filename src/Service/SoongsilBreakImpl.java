package Service;

import domain.Building;
import domain.Character;

import java.util.Scanner;

public class SoongsilBreakImpl implements SoongsilBreak {
    @Override
    public void init() {
        System.out.println("Welcome to SoongsilBreak");
        System.out.println("please select Major");
        System.out.println("1. DO, 2. Hwang, 3. Song");
        Scanner sc = new Scanner(System.in);
        int selector = sc.nextInt();
        if(selector == 1)
        {
            Character ch1 = new Character(10,10,10,10);
        }
        else if(selector == 2)
        {
            Character ch2 = new Character(20, 10, 15, 30);
        }
        else if(selector == 3)
        {
            Character ch3 = new Character(20, 10, 15, 30);
        }
    }

    @Override
    public void creatBuilding() {
        Building 정보관 = new Building(20, 20, 10, 10, 10, 10);
        Building 조만식 = new Building(20, 20, 10, 10, 10, 10);
        Building 미래관 = new Building(20, 20, 10, 10, 10, 10);
        Building 한경직 = new Building(20, 20, 10, 10, 10, 10);
        Building 중도 = new Building(20, 20, 10, 10, 10, 10);
        Building[] Building_check = {정보관, 조만식, 미래관, 한경직, 중도};
    }

}
