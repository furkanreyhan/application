public class Americano extends Recipe {
    Americano() {
        super();
        setPrice(25);
        setName("Americano");
        addResource(Ingredient.ESPRESSO);
        addResource(Ingredient.HOT_WATER);
        addResource(Ingredient.HOT_WATER);
        addResource(Ingredient.HOT_WATER);
        addResource(Ingredient.HOT_WATER);
    }
}
