/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author GERTRUDE ANGELA
 */
public class RandomRightTriangles extends Canvas {
       public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 900, 700);
        
        for(int i=0; i<500; i++){
            Random r=new Random();
            Random q=new Random();
            Random w=new Random();
            Random j=new Random();
            Random t=new Random();
            int cod1, cod2, cod3;
            int x, y;

            cod1=1+r.nextInt(254);
            cod2=1+q.nextInt(254);
            cod3=1+w.nextInt(254);

            Color color=new Color(cod1, cod2, cod3);
            g.setColor(color);

            Polygon tri=new Polygon();
            x=1+j.nextInt(800);
            y=1+t.nextInt(600);
            tri.addPoint(x,y);
         
            x=x;
            y=y+50;
            tri.addPoint(x,y);
            
            x=x+50;
            y=y;
            tri.addPoint(x,y);
         
            g.fillPolygon(tri);
        }
    }
    public static void main(String[] args) {
        
        JFrame win=new JFrame("Random Triangles");
        win.setSize(900, 700);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomRightTriangles canvas=new RandomRightTriangles();
        win.add(canvas);
        win.setVisible(true);
    }
    
}
