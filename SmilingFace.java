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
public class SmilingFace extends Canvas {
    public void paint (Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
        
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 300, 300);
        
        g.setColor(Color.BLUE);
        g.fillOval(150, 175, 60, 60);
        
        g.setColor(Color.BLUE);
        g.fillOval(275, 175, 60, 60);
        
        g.setColor(Color.red);
        g.drawArc(175, 225, 150, 125, 225, 90);
    } 
    
    public static void main(String[] args) {
          JFrame win = new JFrame("Smiling Face");
        win.setSize(500,500);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmilingFace canvas = new SmilingFace();
        win.add( canvas );
        win.setVisible(true);
    }
    
}
