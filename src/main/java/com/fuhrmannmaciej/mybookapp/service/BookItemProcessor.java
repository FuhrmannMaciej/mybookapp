package com.fuhrmannmaciej.mybookapp.service;

import com.fuhrmannmaciej.mybookapp.entity.Item;
import org.springframework.batch.item.ItemProcessor;

public class BookItemProcessor implements ItemProcessor<Item, Item> {

    @Override
    public Item process(Item item) {
        return item;
    }
}
