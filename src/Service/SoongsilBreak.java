package Service;

public interface SoongsilBreak { //1
    void creatEnvironment();
    int menu(Character ch);
    void characterActivity(int n, Character ch);
    void enterBuilding(Character ch);
    void clearGame(int day);
}