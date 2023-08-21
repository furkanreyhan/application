import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static CoffeeProvider coffeeProvider;

    public static void setCoffeeProvider(CoffeeProvider provider) {
        coffeeProvider = provider;
    }
    public static void printMenu(){
        ArrayList<Recipe> arrayList = new ArrayList<>();
        arrayList.add(new Espresso());
        arrayList.add(new DoubleEspresso());
        arrayList.add(new Cappuccino());
        arrayList.add(new CaffeLatte());
        arrayList.add(new Mocha());
        arrayList.add(new Americano());
        arrayList.add(new HotWater());

        for (int i = 1; i <= arrayList.size() ; i++) {
            System.out.println( i + "." + arrayList.get(i - 1).getName() + " (" + arrayList.get(i - 1).getPrice() + "₺)");
        }

        System.out.println("Kahvenizi seçiniz : ");

        Scanner scanner = new Scanner(System.in);

        int selection = scanner.nextInt();
        scanner.close();

        System.out.println("Teşekkürler kahveniz hazırlanıyor.");

        coffeeProvider.makeCoffee(selection);

    }


}