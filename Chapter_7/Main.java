import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        int count = 0;
        double currentSum = 0.0;
        
        for (int i = 1; i < responseTimes.length; i++) {
            currentSum += responseTimes[i - 1];           
            double previousAverage = currentSum / i;           
            if (responseTimes[i] > previousAverage) {
                count++;
            }
        }

        System.out.println(count);
    }
}