import java.util.Scanner;

public class HousePriceCalculator {

    public static void main(String[] args) {
        // Fixed rate per square unit
        double ratePerUnit = 5000.0;

        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input house area
        System.out.print("Enter house area (in square units): ");
        double area = scanner.nextDouble();

        // Calculate house price
        double housePrice = area * ratePerUnit;

        // Display result
        System.out.println("House Area: " + area + " sq units");
        System.out.println("Rate per sq unit: ₹" + ratePerUnit);
        System.out.println("Total House Price: ₹" + housePrice);

        scanner.close();
    }
}
