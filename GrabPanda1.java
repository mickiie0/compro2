import java.util.Scanner;

class FoodOrder {
    public String Name;
    public int foodTotal;

    public FoodOrder(String Name) {
        this.Name = Name;
        this.foodTotal = 0;

    }

    public void addFood(int foodPrice) {
        this.foodTotal += foodPrice;
    }

    public void finalizeReceipt() {
        System.out.println(Name);
        System.out.println(foodTotal);
        if (foodTotal <= 50) {
            System.out.println(20);
            System.out.println(foodTotal + 20);
        } else if (foodTotal > 50 && foodTotal <= 150) {
            System.out.println(10);
            System.out.println(foodTotal + 10);
        } else {
            System.out.println(0);
            System.out.println(foodTotal);
        }
    }
}

public class GrabPanda1 {
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
    }
}