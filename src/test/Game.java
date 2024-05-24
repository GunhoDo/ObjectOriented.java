package test;

import Service.SoongsilBreak;
import Service.SoongsilBreakImpl;

public class Game {
    public static void main(String[] args) {
        SoongsilBreak soongsilBreak = new SoongsilBreakImpl();
        soongsilBreak.creatBuilding();
        soongsilBreak.init();
    }
}
