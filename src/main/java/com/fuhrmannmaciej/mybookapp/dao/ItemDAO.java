package com.fuhrmannmaciej.mybookapp.dao;

import com.fuhrmannmaciej.mybookapp.entity.Item;

public interface ItemDAO {

    Item findById(int id);

    void save(Item item);

    void deleteById(int id);
}
