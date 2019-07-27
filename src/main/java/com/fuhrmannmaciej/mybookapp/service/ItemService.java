package com.fuhrmannmaciej.mybookapp.service;

import com.fuhrmannmaciej.mybookapp.entity.Item;

public interface ItemService {

    Item findById(int id);

    void save(Item item);

    void deleteById(int id);
}
