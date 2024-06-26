package House;

import java.util.Scanner;

public class 글로벌브레인홀 extends BuildingImpl{
    public 글로벌브레인홀() {
        Str = 70;
        Dex = 70;
        Luk = 70;
        INT = 70;
    }
    @Override
    public void event() {  //입장이벤트
        Scanner sc = new Scanner(System.in);

        System.out.println("돌발 상황 : 교수님이 등장했다");
        int dec = (int) (Math.random() * 100 + 1);

        System.out.println("0x"+Integer.toHexString(dec) +"은 십진수로 무엇일까? ");
        String answer = sc.next();
        int adder = 0;
        if (answer.equals(Integer.toString(dec)))
        {
            adder = -70;
            System.out.println("자네 훌륭하군 대학원에 오게나(?), 건물의 지능(?)이 떨어졌다");
        }
        else
        {
            adder=  30;
            System.out.println("자넨 이 건물을 부술 자격이 없네 너무 한심하구만, 건물의 지능(?)이 상승했다");
        }
        INT = INT + adder;
        once = adder;
        showState();
    }
    @Override
    public void revent() //입장 이벤트 전으로 돌려주는 함수
    {
        if(once != 0)
        {
            INT = INT - once;
        }
        once = 0;
    }
}
