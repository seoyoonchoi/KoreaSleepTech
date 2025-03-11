package chapter10.practice02.repository;

import chapter10.practice02.entity.Item;

import java.util.Set;

public interface ItemRepository {
    void addItem (Item item);
    void removeItem(String itemId);
    Item findById(String itemId);
    Set<Item> findAll();
}
