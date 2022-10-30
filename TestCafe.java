import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args){
        CafeUtil utility = new CafeUtil();


        int weeks = Integer.parseInt(System.console().readLine("Enter Number of Weeks: "));
        System.out.println("streak goal:" + utility.getStreakGoal(weeks));

        String[] initial = {"ruffage","sinew","vestiges","slurry","grain","veg","flesh"};

        double[] initPrices = {2.35, 3.45, 4.56, 5.60, 6.66, 4.50, 123.89};
        String[] initialCustomers = {"Hag", "Bart", "Gretch","The Retch", "Old Hag", "Witch","Wart Face"};

        ArrayList<String> menu = new ArrayList<String>();
        for(String item : initial){
            menu.add(item);
        }

        ArrayList<Double> priceList = new ArrayList<Double>();
        for (Double price: initPrices){
            priceList.add(price);
        }

        utility.displayMenu(menu, priceList);
        double[] prices = {20.00, 10.00, 100.00, 1.00, 23.23, 189.67};
        System.out.printf("Order Total: %.2f \n",utility.getOrderTotal(prices));
        
        ArrayList<String> customers = new ArrayList<String>();
        for(String customer : initialCustomers){
            customers.add(customer);
        }
        utility.printPriceChart("ground-up beans",6.00,4);
        utility.addCustomer(customers);
    }

}
