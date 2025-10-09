public class Employee {
    
    // Class-level constants for constraints
    public static final double OVERTIME_MULTIPLIER = 1.5;
    public static final int REGULAR_HOURS_LIMIT = 40;

    // Attributes
    private double payRate;
    private double hoursWorked;

    // Constructor
    public Employee(double payRate, double hoursWorked) {
        // Note: Removed employeeNumber as it wasn't used in the calculation logic
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Calculates the total regular pay for the week using the input pay rate.
     */
    public double calculateRegularPay() {
        // Regular hours are capped at 40
        double regularHours = Math.min(this.hoursWorked, REGULAR_HOURS_LIMIT);
        
        return regularHours * this.payRate;
    }

    /**
     * Calculates the total overtime pay for the week.
     */
    public double calculateOvertimePay() {
        if (this.hoursWorked <= REGULAR_HOURS_LIMIT) {
            return 0.0;
        }

        // Overtime hours is anything beyond 40
        double overtimeHours = this.hoursWorked - REGULAR_HOURS_LIMIT;
        
        return overtimeHours * this.payRate * OVERTIME_MULTIPLIER;
    }
}