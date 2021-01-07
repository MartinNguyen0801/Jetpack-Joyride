package GameObject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import main.load;

public class Player extends GameObjects implements KeyListener{
    private final static int boost = 3;
    private int jump = 2, n = 0;
    private long time1 = System.currentTimeMillis();
    private enum PLAYER {
		Run, Jump, Fall
    };
    public PLAYER state = PLAYER.Run;

    public Player()
    {
        ObjList.Player.add(this);
        this.setX(30);
        this.setY(550);
        this.setHeight(100);
        this.setWidth(100);
    }

    @Override
    public void tick()
    {
        if(state == PLAYER.Jump)
        {
            if(this.getY() > 0)
            {
                this.setY(this.getY() - boost);
            }
            else
            {
                this.setY(0);
            }
        }
        else if(state == PLAYER.Fall)
        {
            if(this.getY() < 550)
            {
                this.setY(this.getY() + boost);
            }
            else
            {
                this.setY(550);
            }
        }
    }


    @Override
    public void remove(){}

    @Override
    public void render(Graphics g) 
    {
        if(state == PLAYER.Run || state == PLAYER.Fall)
        {   
            g.drawImage(load.run.getCurrentImage(), getX(), this.getY(), 100, 100, null);
            n++;
            if(n % 50 == 0)
            {
                load.run.update();
            }
        }
        else if (state == PLAYER.Jump)
        {
            g.drawImage(load.jump.getCurrentImage(), getX(), this.getY(), 100, 100, null);
            n++;
            if(n % 50 == 0)
            {
                load.jump.update();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) 
    {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_SPACE)
        {
            state = PLAYER.Jump;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_SPACE)
        {
            state = PLAYER.Fall;
        }

    }
}
