package com.codeup.lister.dao;

import java.util.List;

public interface Item {

    List<Item> getAllItems();
    long deleteItem(long id); // returns id of item deleted
    long updateItem(long id); // returns id of item updated
    long createItem(Item item); // returns id of item created
    Item findItem(long id);

}
