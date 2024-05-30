package Service;

import Major.Character;

public interface SoongsilBreak {

    int weeklySelection(Character ch);
    void gamePlay(SoongsilBreak soongsilBreak, Character user);
    void characterActivity(int n, Character ch);
    void enterBuilding(Character ch);
    boolean weeklyEvent(Character ch);
    void happyEnding();
    void sadEnding();

}