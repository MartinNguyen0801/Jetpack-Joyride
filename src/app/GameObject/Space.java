package GameObject;

import java.awt.Graphics;

public class Space extends GameObjects {

    public Space (int x, int y, int width, int height)
    {
        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height);
    }

    public Space (int x, int y)
    {
        this.setX(x);
        this.setY(y);
        this.setWidth(100);
        this.setHeight(100);
    }

    @Override
    public void remove() {}

    @Override
    public void tick(){}

    @Override
    public void render(Graphics g) {}
    
}
