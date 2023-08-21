public class Mocha extends Recipe{
    Mocha(){
        super();
        setPrice(32);
        setName("Mocha");
        addResource(Ingredient.ESPRESSO);
        addResource(Ingredient.STEAMED_MILK);
        addResource(Ingredient.MILK_FOAM);
        addResource(Ingredient.HOT_CHOCOLATE);
        addResource(Ingredient.HOT_CHOCOLATE);
    }
}
