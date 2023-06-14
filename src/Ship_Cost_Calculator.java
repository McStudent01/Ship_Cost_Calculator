import java.util.Scanner;

public class Ship_Cost_Calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double SHIPPING_RATE = 0.02;
        double itemCost = 0;

        System.out.println("What is the item cost: ");
        itemCost = in.nextDouble();

        double shippingCost;
        if (itemCost >= 100)
            {
                shippingCost = 0;
            } else {
            shippingCost = itemCost * SHIPPING_RATE;
        }
        double totalCost = itemCost + shippingCost;

        System.out.println("The shipping cost is $" + shippingCost);
        System.out.println("The total cost is $" + totalCost);
    }
}