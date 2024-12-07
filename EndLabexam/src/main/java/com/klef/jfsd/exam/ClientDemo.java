package com.klef.jfsd.exam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.security.auth.login.Configuration;

public class ClientDemo {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = emf.createEntityManager();
		Configuration cfg = new Configuration().configure("persistance.xml");


        try {
            em.getTransaction().begin();

            Device device = new Device();
            device.setId(1);
            device.setBrand("GenericBrand");
            device.setModel("GenericModel");
            device.setPrice(100.0);
            em.persist(device);

            SmartPhone smartphone = new SmartPhone();
            smartphone.setId(2);
            smartphone.setBrand("Samsung");
            smartphone.setModel("Galaxy S23");
            smartphone.setPrice(999.00);
            smartphone.setBatteryCapacity(5000);
            smartphone.setOperatingSystem("Android");
            em.persist(smartphone);

            Tablet tablet = new Tablet();
            tablet.setId(3);
            tablet.setBrand("Apple");
            tablet.setModel("iPad Pro");
            tablet.setPrice(1299.99);
            tablet.setBattery(50000);
            tablet.setScreenResolution("2388x1668");
            em.persist(tablet);

            em.getTransaction().commit();
            System.out.println("inserted successfully");

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}

