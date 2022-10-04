package be.pxl.ja.robbery;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackTest {

    @Test
    void it_should_return_a_list_with_2_products() throws KnapsackFullException {
        Knapsack knapsack = new Knapsack(100);

        Product product1 = new Product("Product 1", 5, 0);
        Product product2 = new Product("Product 2", 6, 0);
        knapsack.add(product1);
        knapsack.add(product2);

        assertEquals(Arrays.asList(product1, product2), knapsack.getItems());

    }
    @Test
    void it_should_throw_an_exception_when_maximum_capacity_reached() throws KnapsackFullException {
        Knapsack knapsack = new Knapsack(10);

        Product product1 = new Product("Product 1", 5, 0);
        Product product2 = new Product("Product 2", 6, 0);
        knapsack.add(product1);

        assertThrows(KnapsackFullException.class, () -> {
            knapsack.add(product2);
        });

    }

    @Test
    void it_should_return_currentweight_10() throws KnapsackFullException {
        Knapsack knapsack = new Knapsack(100);

        Product product1 = new Product("Product 1", 5, 0);
        Product product2 = new Product("Product 2", 6, 0);

        knapsack.add(product1);
        knapsack.add(product2);

        assertEquals(11, knapsack.getCurrentWeight());
    }
}