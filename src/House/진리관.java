package House;

import java.util.Scanner;

public class 진리관 extends BuildingImpl{
    public 진리관() {
        Str = 70;
        Dex = 70;
        Luk = 70;
        INT = 70;
    }

    @Override
    public void event() {  //입장이벤트
        Scanner sc = new Scanner(System.in);

        System.out.println("이런...!!! 진리의 문이라도 가지고 있는 건가?");
        System.out.println("감히 진리에 도전하려들다니 말이야");
        System.out.println("문제입니다. 진리의 문은 어디서 나온 말일까요?, Hint : FULLMETAL ALCHEMIST");
        System.out.println("공백 포함, 한글로 적어주세요");
        String answer = sc.nextLine();;
        int adder = 0;
        if (answer.equals("강철의 연금술사"))
        {
            adder = -20;
            System.out.println("고통을 수반하지 않는 교훈에는 의의가 없다. 인간은 어떤 희생 없이는 아무것도 얻을 수 없으므로.");
            System.out.println("하지만 그것을 뛰어넘어 자신의 것으로 만들었을 때, 사람은 무엇에게도 지지 않는 강인한 마음을 갖게 될 것이다.");
            System.out.println("그래. 강철과도 같은 마음을.");
        }
        else
        {
            adder=  30;
            System.out.println("애니메이션좀 보고 사세요!!!");
        }
        Str = Str + adder;
        Dex = Dex + adder;
        INT = INT + adder;
        Luk = Luk + adder;
        once = adder;
        showState();
    }
    @Override
    public void revent() //입장 이벤트 전으로 돌려주는 함수
    {
        if(once != 0)
        {
            Str = Str - once;
            Dex = Dex - once;
            INT = INT - once;
            Luk = Luk - once;
        }
        once = 0;
    }
}
