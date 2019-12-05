/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todito;

import entidades.Encuesta;
import entidades.Pregunta;
import entidades.Preguntaabcd;
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
    private Encuesta formSelected;
    private ArrayList<Pregunta> cmb2 = null;
    private ArrayList<Preguntaabcd> cmb3 = null;
    private ArrayList<Pregunta> cmb4 = null;    

    public Encuesta getFormSelected() {
        return formSelected;
    }

    public void setFormSelected(Encuesta formSelected) {
        this.formSelected = formSelected;
    }
    
    

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

    public ArrayList<Pregunta> getCmb2() {
        return cmb2;
    }

    public void setCmb2(ArrayList<Pregunta> cmb2) {
        this.cmb2 = cmb2;
    }

    public void setCmb1(ArrayList<Encuesta> cmb1) {
        this.cmb1 = cmb1;
    }

    public MbIndex() {

    }
    
    public String toForm(Encuesta encuesta){
        formSelected=encuesta;
        cmb2=new ArrayList<Pregunta>();
        cmb3=new ArrayList<Preguntaabcd>();
        EntityManagerFactory emf;
        EntityManager em;
        emf = Persistence.createEntityManagerFactory("CocoFormsPU");
        em = emf.createEntityManager();
        
        
        
        
        Query consulta = em.createNamedQuery("Preguntas");
        consulta.setParameter("encuesta", formSelected.getId());
         List <Pregunta> tipo= consulta.getResultList(); 
         

         
          for(Pregunta pregunta : tipo){
              
              System.out.println(pregunta.getTexto());
              
              cmb2.add(pregunta);
              
          }
          
          
          
        Query consulta2 = em.createNamedQuery("Preguntasabcd");
        consulta.setParameter("encuesta", formSelected.getId());
         List <Preguntaabcd> tipo2= consulta2.getResultList(); 
         
         System.out.println(formSelected.getId());
         
          for(Preguntaabcd preguntaabcd : tipo2){
              
              System.out.println(preguntaabcd.getTexto());
              
              cmb3.add(preguntaabcd);
              
          }
          
          
        
    
        return "form";
       
    }

}
