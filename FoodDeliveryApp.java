import java.util.ArrayList;
import java.util.List;

// Renamed from MenuItem to Product
class Product {
    private String title;
    private int cost;

    public Product(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }
}

// Renamed from User to Account
class Account {
    protected int userId;
    protected String userName;

    public Account(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}

// Renamed from Customer to Buyer
class Buyer extends Account {
    public Buyer(int id, String name) {
        super(id, name);
    }
}

// Renamed interface from Bill to Invoice
interface Invoice {
    int computeTotal();
}

// Renamed from Cart to ShoppingBasket and swapped the rigid array for a dynamic List
class ShoppingBasket implements Invoice {
    private List<Product> selectedItems = new ArrayList<>();

    public void addProduct(Product prod) {
        selectedItems.add(prod);
    }

    public void displayBasket() {
        System.out.println("\n--- CURRENT BASKET ---");
        for (Product p : selectedItems) {
            System.out.println(p.getTitle() + " @ Rs." + p.getCost());
        }
    }

    @Override
    public int computeTotal() {
        int grandTotal = 0;
        for (Product p : selectedItems) {
            grandTotal += p.getCost();
        }
        return grandTotal;
    }
}

// Renamed from Order to Transaction
abstract class Transaction {
    protected int txId;

    public Transaction(int txId) {
        this.txId = txId;
    }

    public abstract void printProgress();
}

// Renamed from FoodOrder to DeliveryRequest
class DeliveryRequest extends Transaction {
    public DeliveryRequest(int txId) {
        super(txId);
    }

    @Override
    public void printProgress() {
        System.out.println("\nTracking ID " + txId + ": Order processed successfully.");
    }
}

// Main class renamed from Swiggy to FoodDeliveryApp
public class FoodDeliveryApp {
    public static void main(String[] args) {
        Buyer profile = new Buyer(101, "Ganesh");

        // Storing the menu items inside an array directly to get rid of 10 separate variables
        Product[] catalog = {
            new Product("Chicken Biryani", 250),
            new Product("Mutton Biryani", 350),
            new Product("Veg Biryani", 180),
            new Product("Pizza", 300),
            new Product("Burger", 120),
            new Product("French Fries", 90),
            new Product("Coke", 40),
            new Product("Ice Cream", 60),
            new Product("Shawarma", 150),
            new Product("Fried Rice", 170)
        };

        // Replaced the 10 repetitive print statements with a clean, professional loop
        System.out.println("===== RESTAURANT MENU =====");
        for (int i = 0; i < catalog.length; i++) {
            System.out.println((i + 1) + ". " + catalog[i].getTitle() + " - " + catalog[i].getCost());
        }

        ShoppingBasket basket = new ShoppingBasket();
        
        // Adding the exact same items using array indexing (Items: 1, 4, 7, 8, 10 -> indices: 0, 3, 6, 7, 9)
        basket.addProduct(catalog[0]);
        basket.addProduct(catalog[3]);
        basket.addProduct(catalog[6]);
        basket.addProduct(catalog[7]);
        basket.addProduct(catalog[9]);

        basket.displayBasket();

        Invoice invoice = basket;
        System.out.println("\nFinal Payable Amount: " + invoice.computeTotal());

        Transaction tx = new DeliveryRequest(5001);
        tx.printProgress();

        System.out.println("Appreciate your order, " + profile.getUserName() + "!");
    }
}