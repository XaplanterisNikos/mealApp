/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author developerTeam_EAP_PLH24
 * 
 */
@Entity
@Table(name = "MEAL")
@NamedQueries({
    @NamedQuery(name = "Meal.findAll", query = "SELECT m FROM Meal m"),
    @NamedQuery(name = "Meal.findByMealid", query = "SELECT m FROM Meal m WHERE m.mealid = :mealid"),
    @NamedQuery(name = "Meal.findByMealname", query = "SELECT m FROM Meal m WHERE m.mealname = :mealname"),
    @NamedQuery(name = "Meal.findByMealcategory", query = "SELECT m FROM Meal m WHERE m.mealcategory = :mealcategory"),
    @NamedQuery(name = "Meal.findByMealcountry", query = "SELECT m FROM Meal m WHERE m.mealcountry = :mealcountry"),
    @NamedQuery(name = "Meal.findByMealinstructions", query = "SELECT m FROM Meal m WHERE m.mealinstructions = :mealinstructions"),
    @NamedQuery(name = "Meal.findByMealcounter", query = "SELECT m FROM Meal m WHERE m.mealcounter = :mealcounter")})
public class Meal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MEALID")
    private Integer mealid;
    @Basic(optional = false)
    @Column(name = "MEALNAME")
    private String mealname;
    @Basic(optional = false)
    @Column(name = "MEALCATEGORY")
    private String mealcategory;
    @Basic(optional = false)
    @Column(name = "MEALCOUNTRY")
    private String mealcountry;
    @Basic(optional = false)
    @Column(name = "MEALINSTRUCTIONS")
    private String mealinstructions;
    @Basic(optional = false)
    @Column(name = "MEALCOUNTER")
    private int mealcounter;

    // κενός κατασκευαστής
    public Meal() {
    }

    //κατασκευαστής
    public Meal(Integer mealid) {
        this.mealid = mealid;
    }
    //κατασκευαστής με ορίσματα τα πεδία της βάσης
    public Meal(Integer mealid, String mealname, String mealcategory, String mealcountry, String mealinstructions) {
        this.mealid = mealid;
        this.mealname = mealname;
        this.mealcategory = mealcategory;
        this.mealcountry = mealcountry;
        this.mealinstructions = mealinstructions;
        this.mealcounter = 1; //αρχικοποιούμε τον μετρητή σε 1
    }

    //μέθοδοι get και set των πεδίων
    public Integer getMealid() {
        return mealid;
    }

    public void setMealid(Integer mealid) {
        this.mealid = mealid;
    }

    public String getMealname() {
        return mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    public String getMealcategory() {
        return mealcategory;
    }

    public void setMealcategory(String mealcategory) {
        this.mealcategory = mealcategory;
    }

    public String getMealcountry() {
        return mealcountry;
    }

    public void setMealcountry(String mealcountry) {
        this.mealcountry = mealcountry;
    }

    public String getMealinstructions() {
        return mealinstructions;
    }

    public void setMealinstructions(String mealinstructions) {
        this.mealinstructions = mealinstructions;
    }

    public int getMealcounter() {
        return mealcounter;
    }

    public void setMealcounter(int mealcounter) {
        this.mealcounter = mealcounter;
    }
    
    // μέθοδος addMealCounter() που αυξάνει τον μετρητή κατά ένα
    public void addMealCounter(){
        mealcounter += 1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mealid != null ? mealid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meal)) {
            return false;
        }
        Meal other = (Meal) object;
        if ((this.mealid == null && other.mealid != null) || (this.mealid != null && !this.mealid.equals(other.mealid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Meal[ mealid=" + mealid + " ]";
    }
    
}
