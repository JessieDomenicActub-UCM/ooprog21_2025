import java.util.Scanner;
import java.text.DecimalFormat;

public class Payroll {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // --- Get Input ---
        
        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double payRate = scanner.nextDouble();
        
        scanner.close();

        // --- Create Employee Object ---
        // Note: The constructor has been simplified to only take rate and hours
        Employee employee = new Employee(payRate, hoursWorked);

        // --- Calculate and Format Output ---
        
        double regularPay = employee.calculateRegularPay();
        double overtimePay = employee.calculateOvertimePay();
        
        // Format to one decimal place to match the output image (e.g., 6200.0)
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Regular pay is " + df.format(regularPay));
        System.out.println("Overtime pay is " + df.format(overtimePay));
    }
}