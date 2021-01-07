package GameObject.Bullet;

import java.awt.Graphics;
import main.load;
import GameObject.*;

public class Missle extends Bullet {
    private long time = System.currentTimeMillis();

    public Missle(int x, int y)
    {
        ObjList.Missle.add(this);
        this.setX(x);
        this.setY(y);
        this.setWidth(100);
        this.setHeight(100);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(load.missle.getCurrentImage(), this.getX(), this.getY(), 100, 100, null);
    }

    @Override
    public void tick() {
        if(System.currentTimeMillis() - time > (1000/60)) 
        {
			time = System.currentTimeMillis();
            this.setX(getX() - speed);
        }

    }
    public void remove()
    {
        if(getX() <= 0)
        {
            ObjList.Missle.remove(this);
        }
    }
    
}
