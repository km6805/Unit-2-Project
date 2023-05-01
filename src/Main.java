import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake?");
        String priceText = scanner.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our Red Velvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake?");
        String priceText2 = scanner.nextLine();
        double price2 = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our Chocolate cupcake. Here is the description:");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake?");
        String priceText3 = scanner.nextLine();
        double price3 = Double.parseDouble(priceText);
        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
        Drink Water = new Drink();
        Soda Soda = new Soda();
        Milk Milk = new Milk();

        System.out.println("We are deciding on the price for our standard drink. Here is the description:");
        Water.type();
        System.out.println("How much would you like to charge for the water?");
        String priceText4 = scanner.nextLine();
        double price4 = Double.parseDouble(priceText);
        Water.setPrice(price);

        System.out.println("We are deciding on the price for our bottle of water. Here is the description:");
        Soda.type();
        System.out.println("How much would you like to charge for the soda?");
        String priceText5 = scanner.nextLine();
        double price5 = Double.parseDouble(priceText);
        Soda.setPrice(price);

        System.out.println("We are deciding on the price milk. Here is the description:");
        Milk.type();
        System.out.println("How much would you like to charge for the cupcake?");
        String priceText6 = scanner.nextLine();
        double price6 = Double.parseDouble(priceText);
        Milk.setPrice(price);

        drinkMenu.add(Water);
        drinkMenu.add(Soda);
        drinkMenu.add(Milk);
        new Order(cupcakeMenu, drinkMenu);
;    }
}
class Cupcake {
    public double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
       this.price = price;
    }
    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

class Drink {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void type() {
        System.out.println("A bottle of water");
    }
}
class Soda extends Drink {
    public void type() {
        System.out.println("A bottle of soda");
    }
}
class Milk  extends Drink {
    public void type() {
        System.out.println("A bottle of milk");
    }
}
