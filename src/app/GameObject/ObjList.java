package GameObject;

import java.awt.Graphics;
import java.util.ArrayList;

import GameObject.*;
import GameObject.Bullet.*;

public class ObjList {
    public static ArrayList<Player> Player = new ArrayList<Player>();
    public static ArrayList<Missle> Missle = new ArrayList<Missle>();
    public static ArrayList<coin> coin = new ArrayList<coin>();

    public static void tick()
    {
        for (int i = 0; i < Player.size(); i++) {
            GameObjects tempObject = Player.get(i);
            
            tempObject.tick();
        }
        for (int i = 0; i < Missle.size(); i++) {
            GameObjects tempObject = Missle.get(i);
            
            tempObject.tick();
        }
        for (int i = 0; i < coin.size(); i++) {
            GameObjects tempObject = coin.get(i);
            
            tempObject.tick();
        }
    }

    public static void render(Graphics g)
    {
        for (int i = 0; i < Player.size(); i++) {
            GameObjects tempObject = Player.get(i);
            
            tempObject.render(g);
        }
        for (int i = 0; i < Missle.size(); i++) {
            GameObjects tempObject = Missle.get(i);
            
            tempObject.render(g);
        }
        for (int i = 0; i < coin.size(); i++) {
            GameObjects tempObject = coin.get(i);
            
            tempObject.render(g);
        }
    }

    public static void reset()
    {

    }
}
