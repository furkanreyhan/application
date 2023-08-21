import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void testMenuSelection() {

        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));


        CoffeeMaker maker = new CoffeeMaker();
        Menu.setCoffeeProvider(maker);
        Menu.printMenu();


        String result = outContent.toString();

        assertTrue(result.contains("1.Espresso (20₺)"));
        assertTrue(result.contains("2.Double Espresso (29₺)"));
        assertTrue(result.contains("3.Cappuccino (27₺)"));
        assertTrue(result.contains("4.Caffe Latte (27₺)"));
        assertTrue(result.contains("5.Mocha (32₺)"));
        assertTrue(result.contains("6.Americano (25₺)"));
        assertTrue(result.contains("7.Hot Water (5₺)"));

        assertTrue(result.contains("2 doz süt köpüğü"));
        assertTrue(result.contains("1 doz espresso"));
        assertTrue(result.contains("2 doz buğulanmış"));

    }
}