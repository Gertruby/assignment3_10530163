/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author GERTRUDE ANGELA
 */
public class AreaCalculator {
      public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        
        System.out.println("Shape Area Calculator");
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        while(true){
            System.out.println("1) Triangle \n2) Rectangle \n3) Square \n4) Circle \n5) Quit");
            System.out.print("Which shape: ");
            int ans=kb.nextInt();
            if(ans==1){
                System.out.print("Radius -> ");
                int area=kb.nextInt();
                System.out.println("\nArea -> "+area_circle(area));

            }else if(ans==2){
                System.out.print("Length -> ");
                int len=kb.nextInt();
                System.out.println("Width -> ");
                int wid=kb.nextInt();
                System.out.println("\nArea -> "+area_rectangle(len, wid));
                
            }else if(ans==3){
                System.out.print("Side -> ");
                int area=kb.nextInt();
                System.out.println("\nArea -> "+area_square(area));
                
            }else if(ans==4){
                System.out.print("base -> ");
                int base=kb.nextInt();
                System.out.print("height -> ");
                int hg=kb.nextInt();
                System.out.println("\nArea -> "+area_triangle(base, hg));
                
            }else if(ans==5){
                System.out.println("\nGoodBye");
                System.exit(0);
            }
        }
    }
    
    public static double area_circle(int radius){
        return Math.PI*radius*radius;
    }
    
    public static double area_rectangle(int length, int width){
        return length*width;
    }
    
    public static double area_square(int side){
        return side*side;
    }
    
    public static double area_triangle(int base, int height){
        return 0.5*base*height;
    }
}
