package org.vistula.customer;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.vistula.basket.BasketItem;

import java.util.ArrayList;


public class CustomerTest {

    @Test
    public void testIsAdult_forAdult() {
       Customer john = new Customer();
        john.setAge(62);
        Assertions.assertThat( john.isAdult()).isTrue();
    }

    @Test
    public void testIsAdult_forNotAdult() {
        Customer cyprian = new Customer("Cyprian", "Mulawa",8);
        Assertions.assertThat(cyprian.isAdult()).isFalse();
    }

    @Test
    public void testBasketTotal_forTwoItems() {
        Customer bianka = new Customer("Bianka", "Kowalska", 19);
        ArrayList<BasketItem> myBasket = new ArrayList<BasketItem>();
        BasketItem bread = new BasketItem(4,false);
        BasketItem wine = new BasketItem(36, true);
        myBasket.add(bread);
        myBasket.add(wine);

        bianka.setBasket(myBasket);
        Assertions.assertThat(bianka.basketTotal()).isEqualTo(40);

    }



}
