package House;

import java.util.Scanner;

public class 정보관 extends BuildingImpl{
    public 정보관(){      //예를 들어, 미래관은 INT스탯을 30을 요구한다(생성자 알아서 바꾸세요)
        INT += 20;
    }
    @Override
    public void event() {  //입장이벤트
        Scanner sc = new Scanner(System.in);

        System.out.println("돌발 상황 : 교수님이 등장했다");

        System.out.println("ㅋㅋ 1 + 1 은 ?");
        String answer = sc.next();
        int adder = 0;
        if (answer.compareTo("귀요미") == 0)
        {
            adder = -10;
            System.out.println("정답을 맞췄다 건물의 공격력(?)이 감소한다");
        }
        else
        {
            adder=  10;
            System.out.println("정답을 틀렸다 건물의 공격력(?)이 증가한다");
        }
        Str = Str+adder;
        once = adder;
    }
    @Override
    public void revent() //입장 이벤트 전으로 돌려주는 함수
    {
        if(once != 0)
        {
            Str = Str-once;
        }
        once = 0;
    }


    //이 밑은 필요 없으면 지워라
//    private int HP = 10;
//    private int cost = 10;

//    public int getHP() {
//        return HP;
//    }
//    public int getCost() {
//        return cost;
//    }
}
