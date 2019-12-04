/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todito;

import entidades.Encuesta;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Lenovo
 */
@Named(value = "mbIndex")
@SessionScoped
public class MbIndex implements Serializable {

    /**
     * Creates a new instance of MbIndex
     */
    private ArrayList<Encuesta> cmb1 = null;

    public ArrayList<Encuesta> getCmb1() {
        cmb1=new ArrayList<Encuesta>();
        EntityManagerFactory emf;

        EntityManager em;
        emf = Persistence.createEntityManagerFactory("CocoFormsPU");
        em = emf.createEntityManager();
        Query consulta = em.createNamedQuery("FindtoAllEncuestas");
         List <Encuesta> tipo= consulta.getResultList(); 
         System.out.println("holaaaa");
          for(Encuesta encuesta : tipo){
              
              
              cmb1.add(encuesta);
          }
         
        return cmb1;
    }

    public void setCmb1(ArrayList<Encuesta> cmb1) {
        this.cmb1 = cmb1;
    }

    public MbIndex() {

    }
    
    public String toForm(Encuesta encuesta){
        
        System.out.println("Holiiiiiiii");
        
        return "form";
       
    }

}
