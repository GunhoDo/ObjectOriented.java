package House;

public class 베어드홀 extends BuildingImpl{
    public 베어드홀(){
        Luk = 30;
    }
    @Override
    public void event() {
        System.out.println("꿈의 강연장에 어서오세요, 베이드홀은 다양한 사람들이 몰려들죠");
        System.out.println("정말 다양한 사람들이 몰렸다, 건물의 운(?)이 상승한다");
        Luk += 20;
        showState();
        once = 1;
    }
    @Override
    public void revent() {
        if (once != 0) {
            Luk -= 20;
        }
    }
}
