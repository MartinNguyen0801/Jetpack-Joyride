package GameObject.Bullet;

import java.awt.Graphics;
import main.load;
import GameObject.*;

public class coin extends Bullet {
    private long time = System.currentTimeMillis();
    public coin(int x, int y)
    {
        ObjList.coin.add(this);
        this.setX(x);
        this.setY(y);
        this.setWidth(100);
        this.setHeight(100);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(load.coin, this.getX(), this.getY(), 100, 100, null);
    }

    @Override
    public void tick() {
        if(System.currentTimeMillis() - time > (1000/60)) 
        {
			time = System.currentTimeMillis();
            this.setX(getX() - speed);
        }
        checkCollision();

    }

    public void checkCollision()
    {
        if(this.getBound().intersects(ObjList.Player.get(0).getBound()))
        {
            ObjList.coin.remove(this);
        }
    }
    public void remove()
    {
        if(getX() <= 0)
        {
            ObjList.coin.remove(this);
        }
    }
    
}
