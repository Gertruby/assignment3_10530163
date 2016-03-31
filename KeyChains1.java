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
public class KeyChains1 {
        public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Ye Olde Keychain Shoppe");
        while(true){
            System.out.println("1) Add Keychains to Order \n2) Remove Keychains from Order"
                            + "\n3) View Current Order \n4) Checkout");
            System.out.print("Please enter your choice: ");
            int ans=kb.nextInt();
            if(ans==1){
                addKeychains();
            }else if(ans==2){
                removeKeychains();
            }else if(ans==3){
                viewOrder();
            }else if(ans==4){
                checkout();
            }else {
                System.out.println("\nWrong input \nPlease Try again\n");
            }
        }
    }
    public static void  addKeychains(){
        System.out.println("\nADD KEYCHAINS\n");
    }
    
    public static void  removeKeychains(){
        System.out.println("\nREMOVE KEYCHAINS\n");
    }
    
    public static void  viewOrder(){
        System.out.println("\nVIEW ORDER\n");
    }
    
    public static void  checkout(){
        System.out.println("\nCHECKOUT\n");
        System.exit(0);
    }
}
