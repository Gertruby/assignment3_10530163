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
public class Boxy3 extends Canvas {
    	public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		drawBox( window, Color.YELLOW, 200, 300, 50, 30 );
		drawBox( window, Color.GREEN,  400, 220, 30, 150 );

		// draw six more boxes -- different colors, different places, different sizes
                drawBox( window, Color.BLACK, 50, 30, 50, 50);
		drawBox( window, Color.RED,  150, 20, 100, 150 );
                drawBox( window, Color.PINK, 300, 300, 120, 200 );
		drawBox( window, Color.ORANGE,  400, 220, 80, 150 );
                drawBox( window, Color.MAGENTA, 500, 300, 90, 90);
		drawBox( window, Color.LIGHT_GRAY,  450, 220, 150, 150 );
                drawBox( window, Color.GRAY, 70, 300, 200, 100 );
		drawBox( window, Color.DARK_GRAY,  400, 150, 250, 60 );
	}
	
	public void drawBox( Graphics window, Color c, int x, int y, int w, int h )
	{
		// add code to draw a WxH box in color c at (x,y)
                window.setColor(c);
		window.fillRect(x,y,w,h);
                window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,w-20,h-20);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy3();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
