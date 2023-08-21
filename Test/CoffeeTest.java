import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class CoffeeTest {
    @Test
    void testEspressoCreation(){
        Espresso espresso = new Espresso();
        assertEquals("Espresso" , espresso.getName());
        assertEquals(20, espresso.getPrice());

        ArrayList<Ingredient> resources = espresso.getResources();
        assertTrue(resources.containsAll(
                Arrays.asList(Ingredient.ESPRESSO)));
    }
    @Test
    void testDoubleEspressoCreation(){
        DoubleEspresso doubleEspresso = new DoubleEspresso();

        assertEquals("Double Espresso" , doubleEspresso.getName());
        assertEquals(29, doubleEspresso.getPrice());

        ArrayList<Ingredient> resources = doubleEspresso.getResources();
        assertTrue(resources.containsAll(
                Arrays.asList(Ingredient.ESPRESSO,
                        Ingredient.ESPRESSO)));

    }

    @Test
    void testCappuccinoCreation() {
        Cappuccino cappuccino = new Cappuccino();
        assertEquals("Cappuccino" , cappuccino.getName());
        assertEquals(27, cappuccino.getPrice());

        ArrayList<Ingredient> resources = cappuccino.getResources();
        assertTrue(resources.containsAll(
                Arrays.asList(
                        Ingredient.ESPRESSO,
                        Ingredient.STEAMED_MILK,
                        Ingredient.STEAMED_MILK,
                        Ingredient.MILK_FOAM,
                        Ingredient.MILK_FOAM
                )));


    }

    @Test
    void testCaffeLatteCreation(){
        CaffeLatte caffeLatte = new CaffeLatte();

        assertEquals("Caffe Latte" , caffeLatte.getName());
        assertEquals(27, caffeLatte.getPrice());

        ArrayList<Ingredient> resources = caffeLatte.getResources();
        assertTrue(resources.containsAll(
                Arrays.asList(Ingredient.ESPRESSO,
                        Ingredient.STEAMED_MILK,
                        Ingredient.STEAMED_MILK,
                        Ingredient.STEAMED_MILK,
                        Ingredient.MILK_FOAM)));

    }

    @Test
    void testMochaCreation(){
        Mocha mocha = new Mocha();

        assertEquals("Mocha" , mocha.getName());
        assertEquals(32, mocha.getPrice());

        ArrayList<Ingredient> resources = mocha.getResources();
        assertTrue(resources.containsAll(
                Arrays.asList(Ingredient.ESPRESSO,
                        Ingredient.STEAMED_MILK,
                        Ingredient.MILK_FOAM,
                        Ingredient.HOT_CHOCOLATE,
                        Ingredient.HOT_CHOCOLATE
                        )));

    }

    @Test
    void testAmericanoCreation(){
        Americano americano = new Americano();

        assertEquals("Americano" , americano.getName());
        assertEquals(25, americano.getPrice());

        ArrayList<Ingredient> resources = americano.getResources();
        assertTrue(resources.containsAll(
                Arrays.asList(Ingredient.ESPRESSO,
                        Ingredient.HOT_WATER,
                        Ingredient.HOT_WATER,
                        Ingredient.HOT_WATER,
                        Ingredient.HOT_WATER
                )));

    }
    @Test
    void testHotWaterCreation(){
        HotWater hotWater = new  HotWater();

        assertEquals("Hot Water" , hotWater.getName());
        assertEquals(5, hotWater.getPrice());

        ArrayList<Ingredient> resources = hotWater.getResources();
        assertTrue(resources.containsAll(
                Arrays.asList(Ingredient.HOT_WATER,
                        Ingredient.HOT_WATER,
                        Ingredient.HOT_WATER,
                        Ingredient.HOT_WATER,
                        Ingredient.HOT_WATER
                )));

    }


}
