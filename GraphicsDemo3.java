
import java.awt.*;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GERTRUDE ANGELA
 */
public class GraphicsDemo3 extends Canvas {
    /*
    1)the first number represents the x coordinate of the first point
      the second number represents the y coordinate of the first point
      the third number represents the x coordinate of the second point
      the fourth number represents the y coordinate of the second point
    
     4)upper left corner
     5)the beginning of the string
     6)error is created
     7)error is created
     
    
    */
      public void paint( Graphics g )
    {
        // lines
        g.setColor(Color.green);
        g.drawLine(10,100,400,100);
        
        g.setColor(Color.red);
        g.drawLine(45,75 ,300 ,120);
        
        g.setColor(Color.blue);
        g.drawLine(50,150,100,180);
        g.setColor(Color.magenta);
        g.drawLine(100,350,300,230);

        g.setColor(Color.red);
        g.drawLine(200,310 ,180 ,260 );
        
        g.setColor(Color.black);

        // fonts
        g.drawString("Graphics are pretty neat.",400, 100);
        g.setFont(new Font("Consolas", Font.PLAIN, 36)); // 36-pt plain
        g.drawString("Yes, they are.", 400, 200);

        g.setColor(Color.white);
        g.setFont(new Font("Calibri", Font.BOLD+Font.ROMAN_BASELINE, 60)); // 60-pt italic bold
        g.drawString("Leander Lions", 300, 350);
        
        
        g.setColor(Color.blue);
        g.setFont(Font.decode("Calibri-BOLDROMAN_BASELINE-60")); // a different way to specify the same font
        g.drawString("Leander Lions", 290, 360);
        
        g.setColor(Color.black);
        g.setFont(new Font(null)); // restore default font

        int x=400, y=490;
        g.drawRect(x,y,150,20);
        g.drawString("Where is the starting point?", x,y);
        g.setColor(Color.red);
        g.drawLine(x,y,x,y);	// drawing a line from a point to itself makes a 1px-by-1px dot

    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo3 canvas = new GraphicsDemo3();
        win.add( canvas );
        win.setVisible(true);
    }
}
