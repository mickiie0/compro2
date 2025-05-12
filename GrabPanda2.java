import java.util.Scanner;

class FoodOrder {
    private String customerName;
    private int foodTotal;
    private int grandTotal;

    public FoodOrder(String name) {
        this.customerName = name;
        this.foodTotal = 0;
        this.grandTotal = 0;
    }

    public void addFood(int price) {
        foodTotal += price;
    }

    public void finalizeReceipt() {
        int deliveryFee;
        if (foodTotal <= 50) {
            deliveryFee = 20;
        } else if (foodTotal <= 150) {
            deliveryFee = 10;
        } else {
            deliveryFee = 0;
        }

        grandTotal = foodTotal + deliveryFee;

        System.out.println(customerName);
        System.out.println(foodTotal);
        System.out.println(deliveryFee);
        System.out.println(grandTotal);
    }

    public void distribIncome() {
        int riderIncome = (foodTotal > 200) ? 30 : 20;
        int grabPandaIncome = (foodTotal * 3) / 10;
        // int foodSellerIncome = foodTotal - grabPandaIncome;

        System.out.println("Rider: " + riderIncome);
        System.out.println("GrabPanda: " + grabPandaIncome);
        System.out.println("Food Seller: " + (grandTotal - riderIncome - grabPandaIncome));
    }
}

public class GrabPanda2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();

        FoodOrder order = new FoodOrder(name);
        for (int i = 0; i < N; ++i) {
            int price = scan.nextInt();
            order.addFood(price);
        }

        order.finalizeReceipt();
        order.distribIncome();
    }
}
