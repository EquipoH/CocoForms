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
    
    @Column (name="texto")
    private String texto;
    
    @Column (name="respuesta")
    private int respuesta;
    
    @Column (name="fk_encuesta")
    private int fk_encuesta;

    public Preguntaabcd() {
    }

    public Preguntaabcd(int id, String texto, int respuesta, int fk_encuesta) {
        this.id = id;
        this.texto = texto;
        this.respuesta = respuesta;
        this.fk_encuesta = fk_encuesta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
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
