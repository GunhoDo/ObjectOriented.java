package Service;

import House.*;
import Major.*;
import Major.Character;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoongsilBreakImpl implements SoongsilBreak {
    public static SoongsilBreak createSoongsilBreak()
    {
        return new SoongsilBreakImpl();
    }
    public static void mainMenu(){
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("You can select number");
            System.out.println("1. Game Start");
            System.out.println("2. What is the game?");
            System.out.println("3. give up");

            System.out.print("입력 : ");
            int n = sc.nextInt();

            switch (n){
                case 1:
                    System.out.println("\n" +
                            " _    _        _                                 _            _____                                   _  _ ______                     _    \n" +
                            "| |  | |      | |                               | |          /  ___|                                 (_)| || ___ \\                   | |   \n" +
                            "| |  | |  ___ | |  ___   ___   _ __ ___    ___  | |_   ___   \\ `--.   ___    ___   _ __    __ _  ___  _ | || |_/ / _ __   ___   __ _ | | __\n" +
                            "| |/\\| | / _ \\| | / __| / _ \\ | '_ ` _ \\  / _ \\ | __| / _ \\   `--. \\ / _ \\  / _ \\ | '_ \\  / _` |/ __|| || || ___ \\| '__| / _ \\ / _` || |/ /\n" +
                            "\\  /\\  /|  __/| || (__ | (_) || | | | | ||  __/ | |_ | (_) | /\\__/ /| (_) || (_) || | | || (_| |\\__ \\| || || |_/ /| |   |  __/| (_| ||   < \n" +
                            " \\/  \\/  \\___||_| \\___| \\___/ |_| |_| |_| \\___|  \\__| \\___/  \\____/  \\___/  \\___/ |_| |_| \\__, ||___/|_||_|\\____/ |_|    \\___| \\__,_||_|\\_\\\n" +
                            "                                                                                           __/ |                                           \n" +
                            "                                                                                          |___/                                            \n");
                    return ;
                case 2:
                    System.out.println("숭실대 부수기는 전공을 선택하고 캠퍼스 내의 건물에 들어가 건물을 부수는 게임입니다");
                    System.out.println("캐릭터는 건물에 입장해서 스킬을 사용할 수 있고 이는 건물을 부수는 데 큰 도움이 될 것입니다.");
                    System.out.println("난이도 1 : 정보과학관, 숭덕경상관, 중앙도서관, 한경직 기념관");
                    System.out.println("난이도 2 : 형남공학관, 백마관, 웨스터민스터홀, 베어드홀");
                    System.out.println("난이도 3 : 미래관, 진리관, 글로벌브레인홀, 문화관");
                    System.out.println("모든 건물을 부수게 되면 당신은 숭실대에서 해방되실 수 있습니다. 그럼 이만 행운을 빕니다.");
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    public static void creatBuilding() {
        //휴식취하는 곳 (MP 충전)
        Building.buildings.add(new 중앙도서관());
        //채플
        Building.buildings.add(new 한경직기념관());
        //공짜로 주는 거
        Building.buildings.add(new 정보과학관());
        Building.buildings.add(new 숭덕경상관());
        // 기본 스탯
        Building.buildings.add((new 형남공학관()));
        Building.buildings.add(new 백마관());
        Building.buildings.add(new 웨스터민스터홀());
        Building.buildings.add(new 베어드홀());
        //교수님
        Building.buildings.add(new 글로벌브레인홀());
        // 어려움
        Building.buildings.add(new 문화관());
        Building.buildings.add(new 미래관());
        Building.buildings.add(new 진리관());
    }


    public static CharacterImpl createCharacter(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("please select Major");
            System.out.print("1. IT, 2. Business 3.Bub 4.직업 설명\n입력 : ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    return new IT();
                case 2:
                    return new Business();
                case 3:
                    return new Bub();
                case 4:
                    System.out.println("1. IT전공은 밸런스가 모두 갖춰진 캐릭터 입니다. (초보자 추천)");
                    System.out.println("2. 경영대 전공은 운이 조금 필요하지만 성공하면 뛰어난 능력을 가지게 됩니다.(중급자 추천)");
                    System.out.println("3. 법대 전공은 시간을 좌지우지 할 수 있습니다. 다만 이를 위해선 수많은 과제가 필요할 것 입니다. (고수 추천)");
                    break;
                default:
                    System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력하세요.");
                    break;
            }
        }
    }


    @Override
    public int weeklySelection(Character ch) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean validInput = false;

        ch.showState();
        Building.showClear();
        System.out.println("안녕하세요. " + ch.getName() + "님 무엇을 도와드릴까요?");

        while (!validInput) {
            try {
                System.out.print("선택지 : 1. 건물입장하기 2. 운동하기 3. 알바하기 4. 과제하기 5. 술마시기 6. 휴식하기 7. 그만두기\n입력 : ");
                String input = sc.nextLine();
                n = Integer.parseInt(input);
                if (n >= 1 && n <= 7) {
                    validInput = true;
                } else {
                    System.out.println("잘못된 입력입니다. 1에서 7 사이의 숫자를 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }

        return n;
    }

    @Override
    public void gamePlay(SoongsilBreak soongsilBreak, Character user){
        while(true)
        {
            if(++(CharacterImpl.week) > 52){ //52주 지나면 종료
                System.out.println("\n52주안에 숭실대를 부수지 못하였습니다.");
                System.out.println("====게임 실패====\n게임을 종료합니다.");
                return;
            }
            System.out.println("\n현재 week는 " + CharacterImpl.week + "주차입니다.");
            boolean day_by_day_boolean = soongsilBreak.weeklyEvent(user);  //주간 이벤트함수
            //주간 이벤트 참여시 true리턴, 미참여시 false리턴 > 주간 이벤트 참여시 이벤트만 참여하고 day증가, 미참여시 평소 일상처럼 선택

            if(day_by_day_boolean){ //주간 이벤트 참여
                System.out.println("주간 이벤트에 참여했습니다. 다음주로 넘어갑니다.");
            }
            else{ //주간 이벤트 미참여
                int n = soongsilBreak.weeklySelection(user);
                if (n == 7) sadEnding(); //7이 quit //게임 종료
                soongsilBreak.characterActivity(n,user);
                soongsilBreak.happyEnding(); //성공시 게임 엔딩
            }

        }
    }

    @Override
    public void characterActivity(int n, Character ch) {
        switch (n){
            case 1:
                enterBuilding(ch);
                break;
            case 2:
                ch.act1();
                break;
            case 3:
                ch.act2();
                break;
            case 4:
                ch.act3();
                break;
            case 5:
                ch.act4();
            case 6:
                ch.act5();
            case 7:
        }

    }

    @Override
    public void enterBuilding(Character ch) {
        Scanner sc = new Scanner(System.in);

        System.out.println("어떤 건물을 부수고 싶으신가요?");
        Building.showClear();
        String want = sc.next();
        Building targetBuilding = Building.getBuilding(want);
        while (targetBuilding == null)
        {
            System.out.println("저런...!!! 건물 이름을 잘못 입력하셨군요 다시 한번 입력해주세요");
            Building.showClear();
            want = sc.next();
            targetBuilding = Building.getBuilding(want);
        }
        System.out.println("해당 건물은 다음과 같습니다 도전하시겠습니까? 포기시 다음날로 이동합니다.");
        targetBuilding.showState();
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

        if (targetBuilding.isOnce() == 0) {
            targetBuilding.event();
        }
        if (ch.getStr() >= targetBuilding.getStr() && ch.getDex() >= targetBuilding.getDex()
                && ch.getInt() >= targetBuilding.getINT() && ch.getLuk() >= targetBuilding.getLuk()) {
            System.out.println("도전에 성공했습니다.");
            Building.remove(want);
        }
        else {
            System.out.println("도전에 실패했습니다.");
            targetBuilding.revent();
        }

        if(ch.getMP()%5 == 1)// IT 원상복귀
        {
            ch.setStr(ch.getStr()-20);
            ch.setDex(ch.getDex()-20);
            ch.setInt(ch.getInt()-20);
            ch.setLuk(ch.getLuk()-20);
            ch.setMP(ch.getMP() - 1);
        }

    }
    @Override
    public boolean weeklyEvent(Character ch){ //주간 이벤트
        Scanner sc = new Scanner(System.in);

        int n;

        if (CharacterImpl.week % 3 == 0) {
            if (Building.getBuilding("한경직기념관") != null) {
                System.out.println("채플은 반드시 3주 마다 참여해 주세요!");
                ch.setInt(ch.getInt() + 5);
                return true;
            }
        }

        if (CharacterImpl.week % 10 == 0)    //살짝 이런식으로 주간 이벤트 만들면 될듯
        {
            System.out.println("축제 시즌이 다가왔습니다. 축제에 참여 하시겠습니까? (참여 : 1, 미참여 : 2)");
            System.out.print("입력 : ");
            n = sc.nextInt();

            if(n == 1) {
                System.out.println("축제에 참여 하였습니다.(올 스탯 : 10 증가)");
                ch.setStr(ch.getStr() + 10);
                ch.setDex(ch.getDex() + 10);
                ch.setInt(ch.getInt() + 10);
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
    public void happyEnding(){ //성공시 엔딩
        if(Building.isClear()){
            if (CharacterImpl.week <= 26){ //기준 반년정도로(?)
                System.out.println("이럴 수가 단 " + CharacterImpl.week + "주 만에 모두 부숴버렸군요!");
                System.out.println(" _____                                    _           _         _    _               \n" +
                        "/  __ \\                                  | |         | |       | |  (_)              \n" +
                        "| /  \\/  ___   _ __    __ _  _ __   __ _ | |_  _   _ | |  __ _ | |_  _   ___   _ __  \n" +
                        "| |     / _ \\ | '_ \\  / _` || '__| / _` || __|| | | || | / _` || __|| | / _ \\ | '_ \\ \n" +
                        "| \\__/\\| (_) || | | || (_| || |   | (_| || |_ | |_| || || (_| || |_ | || (_) || | | |\n" +
                        " \\____/ \\___/ |_| |_| \\__, ||_|    \\__,_| \\__| \\__,_||_| \\__,_| \\__||_| \\___/ |_| |_|\n" +
                        "                       __/ |                                                         \n" +
                        "                      |___/                                                          ");
            }
            System.out.println(" _____  _                    _     __   __               ______               ______  _                _               \n" +
                    "|_   _|| |                  | |    \\ \\ / /               |  ___|              | ___ \\| |              (_)              \n" +
                    "  | |  | |__    __ _  _ __  | | __  \\ V /   ___   _   _  | |_     ___   _ __  | |_/ /| |  __ _  _   _  _  _ __    __ _ \n" +
                    "  | |  | '_ \\  / _` || '_ \\ | |/ /   \\ /   / _ \\ | | | | |  _|   / _ \\ | '__| |  __/ | | / _` || | | || || '_ \\  / _` |\n" +
                    "  | |  | | | || (_| || | | ||   <    | |  | (_) || |_| | | |    | (_) || |    | |    | || (_| || |_| || || | | || (_| |\n" +
                    "  \\_/  |_| |_| \\__,_||_| |_||_|\\_\\   \\_/   \\___/  \\__,_| \\_|     \\___/ |_|    \\_|    |_| \\__,_| \\__, ||_||_| |_| \\__, |\n" +
                    "                                                                                                 __/ |            __/ |\n" +
                    "                                                                                                |___/            |___/ ");
            System.out.println("축하드립니다. 모든 건물을 파괴하셨습니다. 당신은 이제 숭실대에서 해방되었습니다.");
            System.exit(0);
        }
    }
    @Override
    public void sadEnding(){
        System.out.println("실패하셨습니다");
        System.out.println("완전 범죄는 들키지 않지만 불완전한 범죄는 들킨답니다");
        System.out.println("당신은 숭실대를 부수려한 죄로 감옥에 가게되었습니다.");
        System.exit(0);
    }

}