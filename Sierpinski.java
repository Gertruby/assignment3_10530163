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
public class Sierpinski extends Canvas {
    public void paint(Graphics g){
        Random r=new Random();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1024, 768);
        g.setColor(Color.BLACK);
        int cod=0, dx=0, dy=0;
        int[] ver_x={512,146, 876};
        int[] ver_y={109, 654, 654};
        int x=512;
        int y=382;
        for(int i=0; i< 50000; i++){
            g.drawLine(x, y, x, y);
            cod=1+r.nextInt(3);
            if(cod == 1){
                dx=x- ver_x[0];
                dy=y- ver_y[0];
            }else if(cod == 2){
                dx=x- ver_x[1];
                dy=y- ver_y[1];
            }else if(cod == 3){
                dx=x- ver_x[2];
                dy=y- ver_y[2];
            }
            x = (int) (x - ((0.5)*dx));
            y =  (int) (y - ((0.5)*dy));
        }
    }
    
    public static void main(String[] args) {
        JFrame win=new JFrame("Sierpinski");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Sierpinski canvas=new Sierpinski();
        win.add(canvas);
        win.setVisible(true);
    } 
}
