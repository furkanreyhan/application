

public class CaffeLatte extends Recipe {
    CaffeLatte(){
        super();
        setPrice(27);
        setName("Caffe Latte");
        addResource(Ingredient.ESPRESSO);
        addResource(Ingredient.STEAMED_MILK);
        addResource(Ingredient.STEAMED_MILK);
        addResource(Ingredient.STEAMED_MILK);
        addResource(Ingredient.MILK_FOAM);
    }
}
