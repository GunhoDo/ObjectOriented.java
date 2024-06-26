package House;

import java.util.Scanner;

public class 문화관 extends BuildingImpl {
    public 문화관(){
        Str = 70;
        Dex = 70;
        Luk = 70;
        INT = 70;
    }
    @Override
    public void event() {  //입장이벤트
        Scanner sc = new Scanner(System.in);

        System.out.println("이 세상은 다문화 가정이죠 당신은 글로벌 시대의 인재인가요?");
        System.out.println("문화관이 말걸기 시작했다");

        System.out.println("객체 지향 프로그래밍의 약자는??");
        String answer = sc.next();
        int adder = 0;
        if (answer.equals("OOP"))
        {
            adder = -70;
            System.out.println("영어를 너무 잘하시네요...!!! 당신은 글로벌 시대의 인재입니다.");
        }
        else
        {
            adder = 30;
            System.out.println("이것도 모르면 글로벌 시대에 어떻게 살아남을 건가요?");
        }
        Luk = Luk + adder;
        once = adder;
        showState();
    }
    @Override
    public void revent() //입장 이벤트 전으로 돌려주는 함수
    {
        if(once != 0)
        {
            Luk = Luk - once;
        }
        once = 0;
    }
}
