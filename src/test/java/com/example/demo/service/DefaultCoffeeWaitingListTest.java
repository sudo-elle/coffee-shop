package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultCoffeeWaitingListTest {

    @Test
    public void testGetOrderForEmptyList() {
       CoffeeWaitingList coffeeWaitingList = new DefaultCoffeeWaitingList();
       String nextOrder = coffeeWaitingList.getNextOrder();
       assertEquals(null, nextOrder);
   }
}