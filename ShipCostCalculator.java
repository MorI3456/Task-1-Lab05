//This code is made by Connor Casey 9/26/24
import java.util.Scanner;

// Class for Problem 1: ShipCostCalculator
class Problem1 {
    public void run() { // Run is just executing everthing inside of it
        Scanner x = new Scanner(System.in);// Scanner is just recceiveing the input and the scanners name is "x"

        // Get the item price
        System.out.print("Enter the price of your item: ");
        double price = x.nextDouble();

        double shippingCost;
        double totalPrice;

        // If-else
        if (price >= 100) {
            shippingCost = 0; // Free shipping
        } else {
            shippingCost = price * 0.02; // 2% shipping
        }

        // Calculate total cost
        totalPrice = price + shippingCost;

        // Display results
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Total Price: $" + totalPrice);
    }
}
