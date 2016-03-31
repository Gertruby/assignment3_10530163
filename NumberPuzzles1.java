/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GERTRUDE ANGELA
 */
public class NumberPuzzles1 {
     public static void main(String[] args) {
        for(int i=0;i<=60; i++){
            for(int j=0; j<=60; j++){
                if(((i+j)==60)&&((j-i)==14))
                    System.out.println("("+i+","+j+")");
            }
        }
    }
}
