package Service;

import Major.Character;

public interface SoongsilBreak {

    int menu(Character ch);
    void play(SoongsilBreak soongsilBreak, Character user);
    void characterActivity(int n, Character ch);
    void enterBuilding(Character ch);
    boolean day_by_day(Character ch);
    void clearGame();

}