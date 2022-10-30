package com.example.demo.service;

public interface CoffeeWaitingList {
    // return if create success, fail when customer name already exists
    boolean createNewOrder(String customerName, String orderDetails);
    // return if update success, fail when no customer name found
    boolean updateOrder(String customerName, String newOrderDetails);
    // return customer name + order details, return null when empty
    String getNextOrder();
}
