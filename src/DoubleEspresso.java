public class DoubleEspresso extends Recipe {
    DoubleEspresso() {
        super();
        setPrice(29);
        setName("Double Espresso");
        addResource(Ingredient.ESPRESSO);
        addResource(Ingredient.ESPRESSO);
    }
}
