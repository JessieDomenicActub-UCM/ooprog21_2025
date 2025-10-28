import java.util.Scanner;

public class BankBalanceByRateAndYear {

    public static void main(String[] args) {
        double[] interestRates = {0.02, 0.03, 0.04, 0.05};
        
        final int MAX_YEARS = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        double initialBalance = scanner.nextDouble();
        
    
        scanner.close();
        
        System.out.println(); 

        for (double rate : interestRates) {
            double currentBalance = initialBalance; 
            System.out.printf("With an initial balance of $%.2f at an interest rate of %.2f%n", 
                                initialBalance, rate);

            for (int year = 1; year <= MAX_YEARS; year++) {

                currentBalance = currentBalance * (1 + rate);
                

                System.out.printf("After year %d balance is $%.4f%n", year, currentBalance);
            }
            
            System.out.println(); 
        }       
    }
}