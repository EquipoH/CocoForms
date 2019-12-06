/*
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
@Table(name="respuesta")
@NamedQueries({
//@NamedQuery(name = "Respuesta", query = "INSERT INTO Respuesta respuesta values respuesta.respuesta = :respuesta,respuesta.fk_pregunta = :fk_pregunta ")
        
})

public class Respuesta {
    @Id
    @Column (name="id")
    private int id;
    
    @Column (name="respuesta")
    private String respuesta;
    
  
    
    @Column (name="fk_pregunta")
    private int fk_pregunta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getFk_pregunta() {
        return fk_pregunta;
    }

    public void setFk_pregunta(int fk_pregunta) {
        this.fk_pregunta = fk_pregunta;
    }

    public Respuesta() {
    }

    public Respuesta(int id, String respuesta, int fk_pregunta) {
        this.id = id;
        this.respuesta = respuesta;
        this.fk_pregunta = fk_pregunta;
    }


    

}
