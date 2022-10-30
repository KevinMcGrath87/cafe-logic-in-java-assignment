import java.util.ArrayList;

public class CafeUtil {

    public Integer getStreakGoal(int weeks){
        if (weeks > 0) {
            return (weeks*(weeks+1))/2;
        }
        else {
            return 0;
        }

    }

    public double getOrderTotal(double[] prices){
        double total = 0; 
        for(double price : prices){
            total = (total + price);
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i< menuItems.size(); i++){
            String item = menuItems.get(i);
            System.out.println(i + " " + item);
            }
        }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> menuPrices){
        if (menuItems.size() == menuPrices.size()){
            for(int i=0; i < menuItems.size(); i++){
                String item = menuItems.get(i);
                String price = String.valueOf(menuPrices.get(i));
                System.out.println(i + "-" + item +" " +
                "$" + " " + price);
                }
            return true;
            }
        else {
            return false;
        }

        }

    public Object addCustomer(ArrayList<String> customers){
        String userName = System.console().readLine("input name: ");
        customers.add(userName);
        System.out.println(String.format("%s There are %x people in front of you and their names are",userName, customers.size()));
        String customerSeq = "";
        for (String customer: customers){
            customerSeq = customerSeq + customer + ", ";
        }
        System.out.println(customerSeq);
        return addCustomer(customers);
    }

    public void printPriceChart(String product,double price, int maxQuantity){
        System.out.println(product);
        for(int i = 0 ; i < maxQuantity; i++){
            System.out.println(i+1 + " - " + "$" + ((price*(i+1))-(i*.5)));
        }


    }
    }


