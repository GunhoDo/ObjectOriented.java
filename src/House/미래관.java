package House;

public class 미래관 extends BuildingImpl{

    public 미래관(){
        Luk = 50;
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

}
