import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    Product product = new Product(12,12);


    @Test

    public void shouldGet(){

        int expected = 12;
        int actual = product.getAge();
        Assertions.assertEquals(expected,actual);
    }
}
