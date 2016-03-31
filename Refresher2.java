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
public class Refresher2 {
      public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String name;
        
        System.out.print("What is your name: ");
        name=kb.next();
        
        for(int i=0; i<10; i++){
            if(name.equals("Mitchell")&&(i==5))
                break;
            System.out.println(name);
        }
    }
    
}
