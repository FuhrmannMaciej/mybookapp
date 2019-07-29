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
@RequestMapping("/items")
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/{itemId}")
    public Item getItem(@PathVariable int itemId) {

        return itemService.findById(itemId);
    }

    @PostMapping
    public Item addItem(@RequestBody Item item) {

        itemService.save(item);

        return item;
    }

    @PutMapping("/{itemId}")
    public Item updateItem(@PathVariable String itemId, @RequestBody Item item) {

        itemService.update(item);

        return item;
    }

    @DeleteMapping("/{itemId}")
    public String deleteItem(@PathVariable int itemId) {

        itemService.deleteById(itemId);

        return "Deleted item id - " + itemId;
    }
}
