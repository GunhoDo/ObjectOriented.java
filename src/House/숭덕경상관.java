package House;
public class 숭덕경상관 extends BuildingImpl{
    public 숭덕경상관() {
        Dex = 20;
        Luk = 20;
    }
    @Override
    public void event() {
        System.out.println("자네가 '경영대' 학생이라면 수월할게 부술 수 있을경영");
        showState();
    }
    @Override
    public void revent() {}
}
