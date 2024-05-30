package Service;

import Major.Character;
import Major.CharacterImpl;
import Major.Engineer;
import Major.IT;
import House.Building;
import House.미래관;
import House.정보관;

import java.util.Scanner;

public class SoongsilBreakImpl implements SoongsilBreak {

    public static void creatBuilding() {
        Building.buildings.add(new 정보관());
        Building.buildings.add(new 미래관());
    }
    public static SoongsilBreak getSoongsilBreak()
    {
        return new SoongsilBreakImpl();
    }

    public static int main_menu(){
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("======숭실대 부수기=======");
            System.out.println("1. 게임 시작");
            System.out.println("2. 게임 설명");
            System.out.println("3. 종료");

            System.out.print("입력 : ");
            int n = sc.nextInt();

            switch (n){
                case 1:
                    return 1;
                case 2:
                    System.out.println("================\n게임 설명 알아서 하세요.\n=================");
                    break;
                case 3:
                    return 3;
            }
        }
    }

    @Override
    public int menu(Character ch) {
        Scanner sc = new Scanner(System.in);
        ch.showState();
        Building.showClear();
        System.out.println("안녕하세요. " + ch.getName() + "님 무엇을 도와드릴까요?");
        System.out.print("선택지 : 1. enterBuildng 2. study 3. quit 4.테스트용 날짜 45일 증가\n입력 : ");
        return sc.nextInt();
    }

    @Override
    public void play(SoongsilBreak soongsilBreak, Character user){
        while(true)
        {
            if(++(CharacterImpl.day) > 52){ //52주 지나면 종료
                System.out.println("\n52주안에 숭실대를 부수지 못하였습니다.");
                System.out.println("====게임 실패====\n게임을 종료합니다.");
                return;
            }
            System.out.println("\n현재 week는 " + CharacterImpl.day + "week입니다.");
            boolean day_by_day_boolean = soongsilBreak.day_by_day(user);  //주간 이벤트함수
            //주간 이벤트 참여시 true리턴, 미참여시 false리턴 > 주간 이벤트 참여시 이벤트만 참여하고 day증가, 미참여시 평소 일상처럼 선택

            if(day_by_day_boolean){ //주간 이벤트 참여
                System.out.println("주간 이벤트에 참여했습니다. 다음주로 넘어갑니다.");
            }
            else{ //주간 이벤트 미참여
                int n = soongsilBreak.menu(user);
                if (n == 3)return; //3이 quit //게임 종료
                soongsilBreak.characterActivity(n,user);
                soongsilBreak.clearGame(); //성공시 게임 엔딩
            }

        }
    }

    @Override
    public void characterActivity(int n, Character ch) {
        switch (n){
            case 1:
                enterBuilding(ch);
                break;
            case  2:
                ch.study();
                break;

            case 4: //테스트용임
                CharacterImpl.day += 45;
        }
    }

    @Override
    public void enterBuilding(Character ch) {
        Scanner sc = new Scanner(System.in);

        System.out.println("어떤 건물을 부수고 싶으신가요?");
        Building.showClear();
        String want = sc.next();
        System.out.println("해당 건물은 다음과 같습니다 도전하시겠습니까? 포기시 다음날로 이동합니다.");
        Building.getBuilding(want).showState();
        System.out.println("1. 도전, 2. 스킬사용 3. 포기");

        int n = sc.nextInt();

        if(n == 2){
            System.out.println("스킬을 사용하였습니다.");
            ch.Skill();
        }
        else if (n == 3) {
            System.out.println("포기하였습니다.");
            return;
        }

        if (Building.getBuilding(want).isOnce() == 0) {
            Building.getBuilding(want).event();
        }
        if (ch.getStr() >= Building.getBuilding(want).getStr() && ch.getDex() >= Building.getBuilding(want).getDex()
                && ch.getInt() >= Building.getBuilding(want).getINT() && ch.getInt() >= Building.getBuilding(want).getLuk()) {
            System.out.println("도전에 성공했습니다.");
            Building.remove(want);
        }
        else {
            System.out.println("도전에 실패했습니다.");
            Building.getBuilding(want).revent();
        }

        if(n==2){
            ch.rSkill();
        }

    }
    @Override
    public boolean day_by_day(Character ch){ //주간 이벤트
        Scanner sc = new Scanner(System.in);

        int n;

        if (CharacterImpl.day == 3)    //살짝 이런식으로 주간 이벤트 만들면 될듯
        {
            System.out.println("축제 시즌이 다가왔습니다. 축제에 참여 하시겠습니까? (참여 : 1, 미참여 : 2)");
            System.out.print("입력 : ");
            n = sc.nextInt();

            if(n == 1) {
                System.out.println("축제에 참여 하였습니다.(LUK : 10 증가)");
                ch.setLuk(ch.getLuk() + 10);
                return true;
            }
            else if(n == 2){
                System.out.println("축제에 참여 하지 않았습니다.");
                return false;
            }
        }


        return false; //일단 false리턴
    }
    @Override
    public void clearGame(){ //성공시 엔딩
        if(Building.isClear()){
            if (CharacterImpl.day <= 26){ //기준 반년정도로(?)
                System.out.println("이럴 수가 단 " + CharacterImpl.day + "주 만에 모두 부숴버렸군요!");
            }
            System.out.println("축하드립니다. 모든 건물을 파괴하셨습니다. 숭실대는 이제 당신껍니다");
            System.exit(0);
        }
    }

}