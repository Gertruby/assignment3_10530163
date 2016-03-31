/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GERTRUDE ANGELA
 */
public class DistanceFormula {
    	public static void main( String[] args )
	{
		// test the formula a bit
		double d1 = distance(1,5 , -2,1);
		System.out.println(" (-2,1) to (1,5) => " + d1 );
 
		double d2 = distance(-4,4 , -2,-3);
		System.out.println(" (-2,-3) to (-4,4) => " + d2 );
 
		System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );
 
		System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
	}
 
	public static double distance( int x1, int y1, int x2, int y2 )
	{
                double d=0.0;
                
                d=(double)
                        Math.sqrt(((x2-x1)*(x2-x1))- ((y2-y1)*(y2-y1)));
                return d;
	}
}
