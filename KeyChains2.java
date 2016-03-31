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
public class KeyChains2 {
     public static Scanner kb=new Scanner(System.in);
    public static void main(String[] args) {
        int add=0;  
        int keychains=0;
        double cost=10.0;
        System.out.println("Ye Olde Keychain Shoppe");
        while(true){
            System.out.println("1) Add Keychains to Order \n2) Remove Keychains from Order"
                            + "\n3) View Current Order \n4) Checkout");
            System.out.print("Please enter your choice: ");
            int ans=kb.nextInt();
            if(ans==1){
                 keychains=addKeychains(keychains);
                 System.out.println("You now have "+keychains+" keychains.\n");
            }else if(ans==2){
                keychains=removeKeychains(keychains);
                System.out.println("You now have "+keychains+" keychains.\n");
            }else if(ans==3){
                viewOrder(keychains,cost);
            }else if(ans==4){
                checkout(keychains,cost);
            }else {
                System.out.println("\nWrong input \nPlease Try again\n");
            }
        }
    }
    public static int addKeychains(int key){
                System.out.print("\nYou have "+ key +" keychains ."
                              + "\nHow many to add? ");
                int add=kb.nextInt();
                key+=add;
                return key;
    }
    
    public static int  removeKeychains(int key){
        System.out.print("\nYou have "+ key +" keychains ."
                              + "\nHow many to remove? ");
        int add=kb.nextInt();  
        key += -add;
        return key;
          
    }
    
    public static void  viewOrder(int key, double price){
          System.out.println("\nYou have "+ key +" keychains ."
                              +"\nKeychains costs $"+price+" each.");
          System.out.println("Total cost is $"+key*price+".\n");
    }
    
    public static void  checkout(int key, double price){
        System.out.println("\nCHECKOUT\n");
        System.out.print("What is your name? ");
        String name;
        name=kb.next();
        System.out.println("You have "+key+" keychains.");
        System.out.println("Keychains cost $"+price+" each.");
        System.out.println("Total cost is "+key*price+".");
        System.out.println("Thanks for your order, "+ name+"!");
        System.exit(0);
    }
}
