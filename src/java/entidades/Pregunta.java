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
@Table(name="pregunta")
@NamedQueries({
@NamedQuery(name="Pregunta",query="SELECT pregunta from Pregunta pregunta"),


})
public class Pregunta {
    @Id
    @Column (name="id")
    private int id;
    
    @Column (name="texto")
    private String texto;
    @Column (name="tipo")
    private int tipo;
    
    @Column (name="fk_encuesta")
    private int fk_encuesta;

    public Pregunta(int id, String texto, int tipo, int fk_encuesta) {
        this.id = id;
        this.texto = texto;
        this.tipo = tipo;
        this.fk_encuesta = fk_encuesta;
    }

    public Pregunta() {
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getFk_encuesta() {
        return fk_encuesta;
    }

    public void setFk_encuesta(int fk_encuesta) {
        this.fk_encuesta = fk_encuesta;
    }
    
    

}
