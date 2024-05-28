package Service;

import Major.Character;

public interface SoongsilBreak { //1
    Character creatEnvironment();
    int menu(Character ch);
    void characterActivity(int n, Character ch);
    void enterBuilding(Character ch);
    void day_by_day(Character ch);
    void clearGame();

}