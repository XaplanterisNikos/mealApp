/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meals;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import meals.exceptions.NonexistentEntityException;
import meals.exceptions.PreexistingEntityException;
import model.Meal;

/**
 *
 * @author developerTeam_EAP_PLH24
 * 
 */

public class MealJpaController implements Serializable {

    public MealJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Meal meal) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(meal);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findMeal(meal.getMealid()) != null) {
                throw new PreexistingEntityException("Meal " + meal + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Meal meal) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            meal = em.merge(meal);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = meal.getMealid();
                if (findMeal(id) == null) {
                    throw new NonexistentEntityException("The meal with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Meal meal;
            try {
                meal = em.getReference(Meal.class, id);
                meal.getMealid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The meal with id " + id + " no longer exists.", enfe);
            }
            em.remove(meal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Meal> findMealEntities() {
        return findMealEntities(true, -1, -1);
    }

    public List<Meal> findMealEntities(int maxResults, int firstResult) {
        return findMealEntities(false, maxResults, firstResult);
    }

    private List<Meal> findMealEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Meal.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Meal findMeal(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Meal.class, id);
        } finally {
            em.close();
        }
    }

    public int getMealCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Meal> rt = cq.from(Meal.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    //Query που επιστρέφει όλα γεύματα από τον πίνακα Meal ταξινομημένα     
    public List<Meal> getMealsOrderedByViews() {
        EntityManager em = getEntityManager();
        Query q = em.createQuery("select m from Meal m order by m.mealcounter desc, m.mealname");
        List<Meal> meals = q.getResultList();
        return meals;
    }
}
