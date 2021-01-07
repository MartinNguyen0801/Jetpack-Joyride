package main;


import java.awt.*;
import javax.imageio.ImageIO;
import java.io.*;

public class load {
    public static Image background;
    public static Image run1, run2, jump1, jump2, missle2, missle3, coin;

    public static animation run, jump, missle;

    public load()
    {
        Load();
        loadAnimation();
    }
    public void Load()
    {
        try 
            {
                background = ImageIO.read(new File("src/app/assets/images/background 1.png"));
                run1 = ImageIO.read(new File("src/app/assets/images/Run 1.png"));
                run2 = ImageIO.read(new File("src/app/assets/images/Run 2.png"));
                jump1 = ImageIO.read(new File("src/app/assets/images/Jump.png"));
                jump2 = ImageIO.read(new File("src/app/assets/images/Jump 2.png"));
                missle2 = ImageIO.read(new File("src/app/assets/images/Missle 2.png"));
                missle3 = ImageIO.read(new File("src/app/assets/images/Missle 3.png"));
                coin = ImageIO.read(new File("src/app/assets/images/Coin.png"));
            } 
        catch (IOException e) 
            {
                e.printStackTrace();
            }
    }

    public void loadAnimation()
    {
        run = new animation();
        run.addImage(run1);
        run.addImage(run2);

        jump = new animation();
        jump.addImage(jump1);
        jump.addImage(jump2);

        missle = new animation();
        missle.addImage(missle2);
        missle.addImage(missle3);
    }
}
