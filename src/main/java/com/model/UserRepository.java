package com.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import main.java.com.model.User;

public class UserRepository {

    private EntityManager em;

    private EntityTransaction et;

    private EntityManagerFactory emf;

    public UserRepository() {
        this.emf = Persistence.createEntityManagerFactory("pu");
        this.em = this.emf.createEntityManager();
        this.et = this.em.getTransaction();
    }

    public void add(User empToAdd) {
        et.begin();
        em.persist(empToAdd);
        et.commit();
        System.out.println("Coming here");
    }

    public User find(int id) {
        return em.find(User.class , id);
    }

    /*public User update(User updatedEmp) {
        User empInDB = em.find(User.class, updatedEmp.getEid());
        et.begin();
        empInDB.setName(updatedEmp.getName());
        empInDB.setSalary(updatedEmp.getSalary());
        et.commit();
        return updatedEmp;
    }*/

   /* public void remove(User empToRemove){
        User empInDB = em.find(User.class, empToRemove.getEid());
        et.begin();
        em.remove(empInDB);
        et.commit();
    }*/

    public void close() {
        em.close();
        emf.close();
    }
}
