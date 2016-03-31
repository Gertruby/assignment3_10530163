/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author GERTRUDE ANGELA
 */
public class SmilingFaceFunction extends Canvas {
     public void paint( Graphics g )
    {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1024, 768);
        
        drawSmilingFace(g,100,100);
        drawSmilingFace(g,400,350);
        // etc
        drawSmilingFace(g, 300, 200);
        drawSmilingFace(g, 700, 500);
        drawSmilingFace(g, 200, 400);
    }

    public void drawSmilingFace( Graphics g, int x, int y )
    {
        // Draws a smiling face on the screen, where the point (x,y) is
        //  the upper-left corner of a box containing the face.
        
        // draw circle for the head
        g.setColor(Color.yellow);
        g.fillOval(x, y, 100, 100);
        
        // draw eyes
        g.setColor(Color.BLUE);
        g.fillOval(x+15,y+15, 30, 30);
        
        //
        g.setColor(Color.BLUE);
        g.fillOval(x+55, y+15, 30, 30);
        
       // draw mouth
        g.setColor(Color.red);
        g.drawArc(x+20, y+30, 60, 50, 225, 90);
    }

    public static void main(String[] args)
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("Smiling Face Function");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new SmilingFaceFunction() );
        win.setVisible(true);
    }    
}
