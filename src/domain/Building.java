package domain;

import java.util.HashSet;
import java.util.Iterator;

public interface Building {
    HashSet<Building> buildings = new HashSet<>();

    static void addBuilding(Building building)
    {
        buildings.add(building);
    }
    static void showClear()
    {
        Iterator<Building> iter = buildings.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next().getClass().getSimpleName()+" ");
        }
        System.out.println();
    }
    static Building getBuilding(String s) {
        Iterator<Building> iter = buildings.iterator();
        while (iter.hasNext()) {
            Building building = iter.next();
            if (s.equals(building.getClass().getSimpleName())) {
                return building;
            }
        }
        return null;
    }
    static void remove(String s) {
        Iterator<Building> iter = buildings.iterator();
        while (iter.hasNext()) {
            Building building = iter.next();
            if (s.equals(building.getClass().getSimpleName())) {
                iter.remove();
            }
        }
    }
    static boolean isClear() {
        Iterator<Building> iter = buildings.iterator();
        if (!iter.hasNext()) {
            return true; // 프로그램 정상 종료
        }
        else return false;
    }
    void event();
    void revent();
    void showState();
    int isOnce();
    int getStr();
    int getDex();
    int getINT();
    int getLuk();

}