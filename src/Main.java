public class Main {
    public static void main(String[] args) {
        CoffeeProvider coffeeProvider = new CoffeeMaker();
        Menu.setCoffeeProvider(coffeeProvider);
        Menu.printMenu();
    }
}