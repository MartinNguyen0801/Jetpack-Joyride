package GameObject;

import java.awt.*;

public abstract class GameObjects {
    private int x;
    private int y;
    private int width;
	  private int height;
    
    public int getX() 
    {
		return x;
    }
    
    public void setX(int x) 
    {
		this.x = x;
    }
    
    public int getY() 
    {
		return y;
    }
    
    public void setY(int y) 
    {
		this.y = y;
    }
    
    public int getWidth() 
    {
		return width;
    }
    
    public void setWidth(int width) 
    {
		this.width = width;
    }
    
    public int getHeight() 
    {
		return height;
    }
    
    public void setHeight(int height) 
    {
		this.height = height;
    }
    
    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract void remove();
    
    public Rectangle getBound() 
    {
    	return new Rectangle(x,y,width,height);
    }
}
