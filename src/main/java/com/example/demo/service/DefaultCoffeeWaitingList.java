package com.example.demo.service;

public class DefaultCoffeeWaitingList implements CoffeeWaitingList {
    @Override
    public boolean createNewOrder(String customerName, String orderDetails) {
        return false;
    }

    @Override
    public boolean updateOrder(String customerName, String newOrderDetails) {
        return false;
    }

    @Override
    public String getNextOrder() {
        return null;
    }
}
