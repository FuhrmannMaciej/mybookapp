package com.fuhrmannmaciej.mybookapp.dao;

import com.fuhrmannmaciej.mybookapp.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
