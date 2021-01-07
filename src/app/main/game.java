package main;

import javax.swing.JFrame;
import java.awt.image.BufferStrategy;
import java.awt.*;
import GameObject.*;
import GameObject.Bullet.*;

import java.util.Random;

class game extends Canvas implements Runnable{
    load loading;
    LoadSpace sp;
    Player p;
    int num, n = 0;
    private boolean running;
    public enum STATE {
		Menu, Game
    };
    public static STATE gameState = STATE.Game;

    public game() 
    {
        loading = new load();
        p = new Player();
        sp.LSpace();
        addKeyListener(p);

        new Window(1280, 720, "Jetpack Joyride", this); 
    }

    public synchronized void stop() {
		if (!running) {
			return;
		}
		running = false;
    }
    
    public synchronized void start() {
		if (running) {
			return;
		}
        running = true;
        new Thread(this, "Jetpack Joyride").start();
    }

    @Override
    public void run() 
    {
        this.requestFocus();
        //long timer = System.currentTimeMillis();
        final double miliPerTick = 500;
        long lastTime = System.currentTimeMillis();
        double interval = 0.0;

        while (running)
        {
            long now = System.currentTimeMillis();
            interval = (now - lastTime) / miliPerTick;

            if(interval >= 1.0)
            {
                tick();
                render();
            }
        }
        System.exit(0);
    }

    private void tick()
    {
        if (gameState == STATE.Game)
        {
            ObjList.tick();
        }
        
        Random();
        checkEnd();
    }

    private void render()
    {
        BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}
        Graphics g = bs.getDrawGraphics();
        
        g.drawImage(load.background, 0, 0, null);
        ObjList.render(g);
        
        g.dispose();
		bs.show();
    }

    public void Random()
    {
        Random ran = new Random();
        num = ran.nextInt(2);
        for(int i = 0; i <= num; i++)
        {
            int col = ran.nextInt(11);
            int obj = ran.nextInt(100);

            if(obj == 0)
            {
                new Missle((sp.sp[col][0]).getX(), (sp.sp[col][0]).getY());
            }
            else if(obj == 1)
            {
                new coin((sp.sp[col][0]).getX(), (sp.sp[col][0]).getY());
            }
        }
    }

    public void checkEnd()
    {   for(int i = 0; i < ObjList.Missle.size(); i++)
        if(ObjList.Missle.get(i).getBound().intersects(ObjList.Player.get(0).getBound()))
        {
            running = false;
        }
    }
  
} 
