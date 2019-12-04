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
@Table(name="opciones")
@NamedQueries({
@NamedQuery(name="Opciones",query="SELECT opciones from Opciones opciones"),


})
public class Opciones {
    @Id
    @Column (name="id")
    private int id;
    @Column (name="opcionA")
    private String opcionA;
    @Column (name="opcionB")
    private String opcionB;
    @Column (name="opcionC")
    private String opcionC;
    @Column (name="opcionD")
    private String opcionD;
    @Column (name="fk_pregunta")
    private int fk_pregunta;

    public int getId() {
        return id;
    }

    public Opciones(int id, String opcionA, String opcionB, String opcionC, String opcionD, int fk_pregunta) {
        this.id = id;
        this.opcionA = opcionA;
        this.opcionB = opcionB;
        this.opcionC = opcionC;
        this.opcionD = opcionD;
        this.fk_pregunta = fk_pregunta;
    }

    public Opciones() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpcionA() {
        return opcionA;
    }

    public void setOpcionA(String opcionA) {
        this.opcionA = opcionA;
    }

    public String getOpcionB() {
        return opcionB;
    }

    public void setOpcionB(String opcionB) {
        this.opcionB = opcionB;
    }

    public String getOpcionC() {
        return opcionC;
    }

    public void setOpcionC(String opcionC) {
        this.opcionC = opcionC;
    }

    public String getOpcionD() {
        return opcionD;
    }

    public void setOpcionD(String opcionD) {
        this.opcionD = opcionD;
    }

    public int getFk_pregunta() {
        return fk_pregunta;
    }

    public void setFk_pregunta(int fk_pregunta) {
        this.fk_pregunta = fk_pregunta;
    }

    
    
    
    
}
