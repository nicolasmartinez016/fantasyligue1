package fr.univtln.nmartinez016.fantasyfootball.database;

import javax.persistence.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by marti on 30/07/2016.
 */
public class CCrudMethods {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");
    EntityManager em = emf.createEntityManager();

    public <T> T persist(T t) {
        //EntityTransaction transac = em.getTransaction();
        //transac.begin();
        this.em.persist(t);
        this.em.flush();
        this.em.refresh(t);
        //transac.commit();
        return t;
    }


    public <T> T create(T t) {
        //EntityTransaction transac = em.getTransaction();
        //transac.begin();
        this.em.merge(t);
        this.em.flush();
        //this.em.refresh(t);
        //transac.commit();
        return t;
    }

    public <T> T find(Class<T> type, Object id) {

        T t = this.em.find(type, id);
        //em.refresh(t);
        //return (T) this.em.find(type, id);
        return t;
    }

    public void delete(Class type, Object id) {
        //EntityTransaction transac = em.getTransaction();
        //transac.begin();
        Object ref = this.em.getReference(type, id);
        this.em.remove(ref);
        //transac.commit();
    }

    public <T> T update(T t) {
        //EntityTransaction transac = em.getTransaction();
        //transac.begin();
        em.merge(t);
        this.em.flush();
        //this.em.refresh(t);
        //transac.commit();
        return t;
    }


    public List findWithNamedQuery(String namedQueryName) {
        return this.em.createNamedQuery(namedQueryName).getResultList();
    }

    public List findWithNamedQuery(String namedQueryName, Map parameters, int i) {
        Set<Map.Entry> rawParameters = parameters.entrySet();
        Query query = this.em.createNamedQuery(namedQueryName);
        if (i > 0)
            query.setMaxResults(i);
        for (Map.Entry entry : rawParameters) {
            query.setParameter((String) entry.getKey(), entry.getValue());
        }
        return query.getResultList();
    }

    public List findWithNamedQuery(String namedQueryName, Map parameters, int i, int j) {
        Set<Map.Entry> rawParameters = parameters.entrySet();
        Query query = this.em.createNamedQuery(namedQueryName);
        if (i > 0)
            query.setMaxResults(i);
        if (j > 0)
            query.setMaxResults(j);
        for (Map.Entry entry : rawParameters) {
            query.setParameter((String) entry.getKey(), entry.getValue());
        }
        return query.getResultList();
    }

    public List findWithNamedQuery(String namedQueryName, Map parameters) {
        return findWithNamedQuery(namedQueryName, parameters, 0);
    }

    public void clearCache() {
        em.getEntityManagerFactory().getCache().evictAll();
    }

    public Boolean openTransaction() {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
            return true;
        } else {
            return false;
        }
    }

    public void commitTransaction() {
        em.getTransaction().commit();
    }
}
