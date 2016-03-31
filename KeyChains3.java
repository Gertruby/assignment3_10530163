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
public class KeyChains3 {
      public static Scanner kb=new Scanner(System.in);
    public static void main(String[] args) {
        int add=0;  
        int keychains=0;
        final  double cost=10.0;
        final  double shipPerOrder=5.00;
        final double tax=0.0825;
        final double extraShipPerKeychain=1.00;
        
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
                viewOrder(keychains,cost,tax, extraShipPerKeychain,shipPerOrder);
            }else if(ans==4){
                checkout(keychains,cost,tax, extraShipPerKeychain,shipPerOrder);
            }else {
                System.out.println("\nWrong input \nPlease Try again\n");
            }
        }
    }
    public static int addKeychains(int key){
                System.out.print("\nYou have "+ key +" keychains ."
                              + "\nHow many to add? ");
                int add=kb.nextInt();
                while(add<0){
                    System.out.print("Wrong input.\nPLease make a new input -> ");
                    add=kb.nextInt();
                }
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
    
    public static void  viewOrder(int key, double price,double tax, double additional, double shipO){
          System.out.println("\nYou have "+ key +" keychains ."
                              +"\nKeychains costs $"+price+" each.");
          System.out.println("Shipping charge on this order is $"+shipO);
          System.out.println("Total cost is $"+key*price);
          System.out.println("Tax on this order is $"+tax*key*price);
          System.out.println("Final cost is $"+((key*price)-(tax*key*price))+".\n");
    }
    
    public static void  checkout(int key, double price,double tax, double additional, double shipO){
        System.out.println("\nCHECKOUT\n");
        System.out.print("What is your name? ");
        String name;
        name=kb.next();
        viewOrder(key,  price,tax,additional, shipO);
        System.out.println("Thanks for your order, "+ name+"!");
        System.exit(0);
    }
}
