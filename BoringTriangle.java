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
public class BoringTriangle extends Canvas {
     public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
        
        Polygon tri=new Polygon();
        tri.addPoint(250, 100);
        tri.addPoint(320, 300);
        tri.addPoint(180, 320);
        
        Color purp=new Color(153,0,153);
        g.setColor(purp);
        g.fillPolygon(tri);
    }
    
    public static void main(String[] args) {
        JFrame win=new JFrame("Boring Triangle");
        win.setSize(500, 500);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoringTriangle canvas=new BoringTriangle();
        win.add(canvas);
        win.setVisible(true);
    }
    
}
