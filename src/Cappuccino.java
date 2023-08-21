public class Cappuccino extends Recipe {
    Cappuccino(){
        super();
        setPrice(27);
        setName("Cappuccino");
        addResource(Ingredient.ESPRESSO);
        addResource(Ingredient.STEAMED_MILK);
        addResource(Ingredient.STEAMED_MILK);
        addResource(Ingredient.MILK_FOAM);
        addResource(Ingredient.MILK_FOAM);
    }

}
