package com.example.springjpa_20_03;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class TransctionPersistenceContextUserService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Person insertWithTransaction(Person user) {
        entityManager.persist(user);
        return user;
    }

    public Person insertWithoutTransaction(Person user) {
        entityManager.persist(user);
        return user;
    }

    public Person find(long id) {
        return entityManager.find(Person.class, id);
    }
}
