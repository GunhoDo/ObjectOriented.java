package Service;

import domain.Building;

public interface CharacterAct {
    void setCost(int cost);
    int getCost();

    void EnterBuilding(Building building);
    void BuildingCheck(Building[] buildings);
    void Study();
    Building search(Building[] buildings, String search);
    void showState();
}
