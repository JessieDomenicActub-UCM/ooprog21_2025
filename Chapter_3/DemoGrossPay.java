public class DemoGrossPay {

    private static final double HOURLY_RATE = 22.75;

    public static double calculateGross(double hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }

    public static void main(String[] args) {

        double[] hours = {10.0, 25.0, 37.5};



        for (double hoursWorked : hours) {
            double grossPay = calculateGross(hoursWorked);

            System.out.printf("%.1f hours at $%.2f per hour is $%.3f%n",
                              hoursWorked, HOURLY_RATE, grossPay);
        }

        
    }
}