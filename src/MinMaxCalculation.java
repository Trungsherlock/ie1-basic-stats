import java.util.*;

public class MinMaxCalculation {
    public static void main(String[] args) {
        
    }

    public static double mininum(double ... numbers) {
        double min = numbers[0];

        for (double num: numbers) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public static double maxinum(double ... numbers) {
        double max = numbers[0];

        for (double num: numbers) {
            if (num < max) {
                max = num;
            }
        }

        return max;
    }
}
