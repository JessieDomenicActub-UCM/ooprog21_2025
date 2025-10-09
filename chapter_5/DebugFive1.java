import java.util.Scanner;

public class DebugFive1
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        
        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;
        
        int usersChoice;
        double bill = 0.0; 
        
        System.out.println("Order please\n1 - Burger\n2 - Hotdog");
        System.out.print("3 - Grilled cheese\n4 - Fish sandwich >> ");
        
        usersChoice = kb.nextInt();
        
        if(usersChoice == 1 || usersChoice == 2)
        {
            bill = bill + HIGH_PRICE;
        }
        else if (usersChoice == 3 || usersChoice == 4)
        {
            bill = bill + MED_PRICE;
        }
        

        System.out.print("Fries with that?\n1 - Yes\n2 - No >> ");
        usersChoice = kb.nextInt();
        
        if(usersChoice == 1) 
        {
            bill = bill + LOW_PRICE;
        }
        
        System.out.println("Total bill is " + bill);
    }
}