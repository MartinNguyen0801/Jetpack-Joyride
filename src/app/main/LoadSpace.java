package main;

import GameObject.*;

public class LoadSpace {
    public static Space[][] sp;

    public static void LSpace()
    {
        sp = new Space[11][1];
        sp[0][0] = new Space(1280, 550);
        sp[1][0] = new Space(1280, 495);
        sp[2][0] = new Space(1280, 440);
        sp[3][0] = new Space(1280, 385);
        sp[4][0] = new Space(1280, 330);
        sp[5][0] = new Space(1280, 275);
        sp[6][0] = new Space(1280, 220);
        sp[7][0] = new Space(1280, 165);
        sp[8][0] = new Space(1280, 110);
        sp[9][0] = new Space(1280, 55);
        sp[10][0] = new Space(1280, 0);
    }
    
}
