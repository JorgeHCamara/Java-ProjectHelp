package br.com.projecthelp;

import br.com.projecthelp.dominio.model.Equipamento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");

        EntityManager manager = factory.createEntityManager();

        Equipamento e = new Equipamento();

        e.setNome("Monitor DELL").setNumeroDeSerie("132434");


        manager.getTransaction().begin();
        manager.persist(e);
        manager.getTransaction().commit();


    }
}