package org.vistula.customer;

import org.vistula.basket.BasketItem;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private int age;
    private List<BasketItem> basket;

    public Customer() {

    }

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBasket(ArrayList<BasketItem> basket) {
        this.basket = basket;
    }

    public List<BasketItem> getBasket() {
        return basket;
    }
    // 2. Napisać metodę, która zwraca true jeżeli wiek klienta jest większy lub równy 18 + testy

    public boolean isAdult() {

        if(age >= 18) {
            return true;
        } else {
            return false;
        }

    }

    public float basketTotal() {
        float sum = 0;
        for(int i = 0; i < basket.size(); i++ ) {
            BasketItem item;
            item = basket.get(i);
            float price = item.getPrice();
            sum = sum + price;
        }
        return sum;
    }


}
