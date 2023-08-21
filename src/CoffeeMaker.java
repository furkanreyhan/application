
public class CoffeeMaker implements CoffeeProvider {
    @Override
    public void makeCoffee(int type){

        Recipe coffee = switch (type) {
            case 1 -> new Espresso();
            case 2 -> new DoubleEspresso();
            case 3 -> new Cappuccino();
            case 4 -> new CaffeLatte();
            case 5 -> new Mocha();
            case 6 -> new Americano();
            case 7 -> new HotWater();

            default -> throw new IllegalStateException();
        };

        String result = coffee.makeCoffee();
        System.out.println(result);

    }

}
