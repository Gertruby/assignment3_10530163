/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GERTRUDE ANGELA
 */import java.awt.*;
 import javax.swing.JFrame;
public class GraphicsDemo1Basics extends Canvas {
    /*
    1)800 pixels wide and 600 pixels tall
    
    2)the first value is the position of the graphic with relation to the x axis
      the second value is the position of the graphic with relation to the y axis
      the third value is the width of the graphic
      the fourth value is the length of the graphic.
    
    3)the first value gives the position of the oval in the direction of the x axis
      the second value is the position of the oval with relation to the y axis
      the third value is the width of the oval
      the fourth value is the length of the oval
    
    4)the values represent the position of the string
    5)the last component called is the one that is made to lie on top
    */
    public void paint( Graphics g )
    {
        g.setColor(Color.green);
        g.drawRect(50,20,100,200);  // draw a rectangle
        g.fillOval(160,20,100,200); // draw a filled-in oval  
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        g.setColor(Color.red);
        g.fillRect(600, 400, 150,150);
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1Basics canvas = new GraphicsDemo1Basics();
        win.add( canvas );
        win.setVisible(true);
    }
}

