import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    public void testName() {
        String name = "TEST NAME";

        Recipe recipe = new RecipeStub();
        recipe.setName(name);

        assertEquals(name, recipe.getName());
    }

    @Test
    public void testPrice() {
        int price = 10;

        Recipe recipe = new RecipeStub();
        recipe.setPrice(price);

        assertEquals(price, recipe.getPrice());
    }

    @Test
    public void testResource() {
        Ingredient ingredient = Ingredient.HOT_WATER;

        Recipe recipe = new RecipeStub();
        recipe.addResource(ingredient);

        ArrayList<Ingredient> resources = recipe.getResources();
        assertTrue(resources.contains(ingredient));
    }

    @Test
    public void testAddResource() {

        String name = "TEST NAME";

        Recipe recipe = new RecipeStub();
        recipe.setName(name);
        recipe.addResource(Ingredient.MILK_FOAM);
        recipe.addResource(Ingredient.HOT_WATER);


        String result = recipe.makeCoffee();


        assertTrue(result.contains("1 doz " + Ingredient.MILK_FOAM.toString().toLowerCase()));
        assertTrue(result.contains("1 doz " + Ingredient.HOT_WATER.toString().toLowerCase()));
    }


    private static class RecipeStub extends Recipe {
        RecipeStub() {
            super();
        }
    }
}