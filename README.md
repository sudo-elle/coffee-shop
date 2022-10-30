# coffee-shop

Build a coffee shop order waiting list service for

- customers to create new orders
- update an old order if it has not been prepared
- Also allow the barista to get the next order

### Service details:

Customer provides name and any specific details when creating an order 
(Assume: No two customers share the same name)

Orders will be saved in a waiting list until the barista reads the order.

The customer can update the order, before the Barista reads the order.

If an order gets updated, it will then be put at the end of the waiting list.

## Unit test set:

`getNextOrder` when the waiting list is empty (An example of this has been coded)

`createNewOrder` and then `getNextOrder` returns the same order

Create 3 new orders (o1, o2, o3) and getNextOrder returns order in a sequence of o1, o2, o3.

Create 2 new orders (o1, o2) then update o1, then create another order o3, getNextOrder returns order in a sequence of 
o2, o1, o3.

Create new order o1, getNextOrder get o1 then update o1 fails because it's not in the waiting list.

Feel free to add further test cases. 