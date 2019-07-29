package com.fuhrmannmaciej.mybookapp.service;

import com.fuhrmannmaciej.mybookapp.dao.ItemRepository;
import com.fuhrmannmaciej.mybookapp.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Transactional
    public Item findById(int id) {

        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item id not found - " + id));
    }

    @Transactional
    public void save(Item item) {

        itemRepository.save(item);
    }

    @Transactional
    public void update(Item item) {

        //logic to add
        Item dbItem = findById(item.getId());


        dbItem.setRating(item.getRating());

        save(dbItem);

    }

    @Transactional
    public void deleteById(int id) {

        itemRepository.deleteById(id);
    }
}
