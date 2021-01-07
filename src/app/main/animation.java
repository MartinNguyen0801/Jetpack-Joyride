package main;

import java.awt.Image;

public class animation {
    public Image[] images;
    private int n;
    private int currentImage;

    public int getN() {
    	return n;
    }
    
    public animation() {
        n = 0;
        currentImage=0;
    }
     public void addImage(Image image)
     {
        Image [] ar = images;
        images = new Image[n+1];
         
        for (int i = 0; i <n; i++)
        {
            images[i]=ar[i];
        }
        
        images[n]= image;
        n++;
         
    }
     
    public Image getCurrentImage(){
        return images[currentImage];
    }
    
    public void update(){
        currentImage++;
        if (currentImage>=n) currentImage =0;
    }
}
