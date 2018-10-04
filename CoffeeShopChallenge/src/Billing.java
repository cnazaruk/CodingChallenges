import java.util.ArrayList;
import java.util.List;

public class Billing {

    // Create a method that asks for the user's input:
    public static void processOrder(String order) {

        float total = 0f;
        float milk = 0.53f;
        float sugar = 0.17f;
        float cream = 0.73f;
        float sprinkles = 0.29f;
        float xigua = 1.03f;
        float itemPrice = 0f;
        float amount = 0f;

        // Split the original order up into different item orders
        String[] items = order.split(", ");

        //for each item, split the string into an array
        for (String item : items) {
            String[] words = item.split(" ");

            // Set the number of drinks/items
            amount = Float.valueOf(words[0]);

            switch (words[2].toLowerCase()) {
                // Find the type of drink or item
                case "regular":
                    RegularCoffee regular = new RegularCoffee();
                    itemPrice = regular.getCost();
                    break;

                case "decaf":
                    DecafCoffee decaf = new DecafCoffee();
                    itemPrice = decaf.getCost();
                    break;

                case "xigua":
                    itemPrice = xigua;
                    break;
            }
                    // If there are additional items to add, find them and add to running total (itemPrice)
                    if(words.length > 2) {
                        for (int i = 4; i < words.length; i += 2) {
                            switch (words[i].toLowerCase()) {
                                case "milk":
                                    itemPrice += milk;
                                    break;

                                case "sugar":
                                    itemPrice += sugar;
                                    break;

                                case "cream":
                                    itemPrice = itemPrice + cream;
                                    break;

                                case "sprinkles":
                                    itemPrice = itemPrice + sprinkles;
                                    break;
                            }
                        }
                    }
                    // Calculate price for each type of item and add to total
                    total = total + (amount * itemPrice);

        }

        // Return total price
        System.out.printf("Final bill is $" + "%1.2f", total);

    }

}







