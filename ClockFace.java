/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;
import java.awt.*;

/**
 *
 * @author GERTRUDE ANGELA
 */
public class ClockFace extends Canvas {
     public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Consolas", Font.BOLD, 20));
        g.drawOval(75, 75, 350, 350);
        g.drawString("12", 240, 100);
        g.drawString("3", 400, 250);
        g.drawString("6", 240, 400);
        g.drawString("9", 80, 250);
        
        g.drawLine(100, 250, 250, 250);
        g.drawLine(150, 300, 250, 250);


    }
    public static void main(String[] args) {
        JFrame win=new JFrame("Clock Face");
        win.setSize(500, 500);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas=new ClockFace();
        win.add( canvas );
        win.setVisible(true);
    }
    
}
