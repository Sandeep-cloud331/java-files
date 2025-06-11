import java.util.Scanner;
public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for unit price
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
		
		// Take input for quantity		
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double total = unitPrice * quantity;

        // Display result
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}