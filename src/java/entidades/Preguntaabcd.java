/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */


@Entity
@Table(name="preguntaabcd")
@NamedQueries({
@NamedQuery(name = "Preguntasabcd", query = "SELECT preguntaabcd from Preguntaabcd preguntaabcd where preguntaabcd.fk_encuesta= :encuesta")
})
public class Preguntaabcd {
    
    @Id
    @Column (name="id")
    private int id;
    
    @Column (name="text")
    private String text;
    
     @Column (name="a")
    private String a;
     
        @Column (name="b")
    private String b;
        
           @Column (name="c")
    private String c;
              @Column (name="d")
    private String d;
    
    @Column (name="respuesta")
    private int respuesta;
    
    @Column (name="fk_encuesta")
    private int fk_encuesta;

    public Preguntaabcd(int id, String text, String a, String b, String c, String d, int respuesta, int fk_encuesta) {
        this.id = id;
        this.text = text;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.respuesta = respuesta;
        this.fk_encuesta = fk_encuesta;
    }

    public Preguntaabcd() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public int getFk_encuesta() {
        return fk_encuesta;
    }

    public void setFk_encuesta(int fk_encuesta) {
        this.fk_encuesta = fk_encuesta;
    }
    

       
}
