package com.fuhrmannmaciej.mybookapp.dao;

import com.fuhrmannmaciej.mybookapp.entity.Item;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ItemDAOImpl implements ItemDAO {

    private EntityManager entityManager;

    @Autowired
    public ItemDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Item findById(int id) {

        Session session = entityManager.unwrap(Session.class);

        return session.get(Item.class, id);
    }

    @Override
    public void save(Item item) {

        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(item);
    }

    @Override
    public void deleteById(int id) {

        Session session = entityManager.unwrap(Session.class);

        Query query = session.createQuery("delete from Item where id=:itemId");

        query.setParameter("itemId", id);

        query.executeUpdate();
    }
}
