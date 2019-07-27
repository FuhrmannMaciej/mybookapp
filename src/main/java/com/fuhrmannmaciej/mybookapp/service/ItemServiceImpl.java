package com.fuhrmannmaciej.mybookapp.service;

import com.fuhrmannmaciej.mybookapp.dao.ItemDAO;
import com.fuhrmannmaciej.mybookapp.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemDAO itemDAO;

    @Autowired
    public ItemServiceImpl(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    @Transactional
    @Override
    public Item findById(int id) {

        return itemDAO.findById(id);
    }

    @Transactional
    @Override
    public void save(Item item) {

        itemDAO.save(item);
    }

    @Transactional
    @Override
    public void deleteById(int id) {

        itemDAO.deleteById(id);
    }
}
