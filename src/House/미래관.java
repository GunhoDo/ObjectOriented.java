package House;

public class 미래관 extends BuildingImpl{

    public 미래관(){      //예를 들어, 미래관은 LUK스탯을 20을 요구한다(생성자 알아서 바꾸세요)
        Luk += 10;
    }

    @Override
    public void event(){
        System.out.println("미래관 입장 이벤트 넣으세요. ex)미래에 온걸 환영한다");
        once = 1;
    }
    @Override
    public void revent()
    {
        once = 0;
    }


//    private int HP = 10;
//    private int cost = 10;

//    public int getHP() {
//        return HP;
//    }
//    public int getCost() {
//        return cost;
//    }


}
