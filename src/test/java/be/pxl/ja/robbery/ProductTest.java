package be.pxl.ja.robbery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void it_should_return_negativa_value_when_product1_larger_then_product2() {
        Product product1 = new Product("Product1", 0, 8.2);
        Product product2 = new Product("Product2", 0, 8.1);
        assertTrue(product1.compareTo(product2) < 0);
    }
    @Test
    void it_should_return_positive_value_when_product1_smaller_then_product2() {

        Product product1 = new Product("Product1", 0, 3);
        Product product2 = new Product("Product2", 0, 7);
        assertTrue(product1.compareTo(product2) > 0);
    }
    @Test
    void it_should_return_0_value_when_product1_same_as_product2() {

        Product product1 = new Product("Product1", 0, 7);
        Product product2 = new Product("Product2", 0, 7);
        assertEquals(0, product1.compareTo(product2));
    }
}