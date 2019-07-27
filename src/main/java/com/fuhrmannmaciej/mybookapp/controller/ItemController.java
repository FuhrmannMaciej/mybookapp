package com.fuhrmannmaciej.mybookapp.controller;

import com.fuhrmannmaciej.mybookapp.entity.Item;
import com.fuhrmannmaciej.mybookapp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/item/{itemId}")
    public Item getItem(@PathVariable int itemId) {

        Item item = itemService.findById(itemId);

        if (item == null) {
            throw new RuntimeException("Item id not found - " + itemId);
        }
        return item;
    }

    @PostMapping("/item")
    public Item addItem(@RequestBody Item item) {

        item.setId(0);

        itemService.save(item);

        return item;
    }

    @PutMapping("/item")
    public Item updateItem(@RequestBody Item item) {

        itemService.save(item);

        return item;
    }

    @DeleteMapping("/item/{itemId}")
    public String deleteItem(@PathVariable int itemId) {

        Item tempItem = itemService.findById(itemId);

        if (tempItem == null) {
            throw new RuntimeException("Item id not found - " + itemId);
        }

        itemService.deleteById(itemId);

        return "Deleted item id - " + itemId;
    }
}
