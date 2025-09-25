

import java.util.Scanner;

public class DebugThree1
{
    public static void main(String args[])
    {
        double check1;
        double check2;        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of your check >> ");
        
        check1 = input.nextDouble(); 

        System.out.print("Enter the amount of your friend's check >> ");
        
        check2 = input.nextDouble(); 

        calcTip(check1);

        calcTip(check2);
        
     
        input.close(); 
    }

   
    public static void calcTip(double bill) 
    {
  
        final double RATE = 0.15; 
        double tip;

      
        tip = bill * RATE; 
        
       
        System.out.printf("A bill of $%.2f requires a tip of at least $%.2f%n", bill, tip);
    }
}