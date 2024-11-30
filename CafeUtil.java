import java.lang.reflect.Array;
import java.util.ArrayList;

public class CafeUtil {

    public  int getStreakGoal(int numWeeks){
      int totalCoffee=0; 
        for(int i=1; i<=numWeeks; i++) {
            totalCoffee+=i;
        }
        return totalCoffee;

    }

    public double getOrderTotal( double[] prices){
        double totalPrice = 0;
        for (int i=0; i<prices.length; i++){
            totalPrice+=prices[i];
        }
        return totalPrice;
    }
    public void displayMenu(ArrayList<String> menu){
        for(int i=0; i<menu.size(); i++){
            System.out.println(i + " : " + menu.get(i));
    }
}
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "!");
        System.out.println("There are " + customers.size() + " people ahead of you.");
        customers.add(username);
        System.out.println("Customer list: " + customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
            System.out.println(product);
            for(int i=1; i<=maxQuantity; i++){
                 
                System.out.println("-1-  $"+price*i);
            }
    }
    public boolean displayMenu(ArrayList<String> menu, ArrayList<Double> prices) {
        
        if (menu.size() != prices.size()) {
            return false;
        }

        
        for (int i = 0; i <menu.size(); i++) {
            System.out.printf("%d. %s - $%.2f\n", i+1, menu.get(i), prices.get(i));
        }

        return true;
    }
}