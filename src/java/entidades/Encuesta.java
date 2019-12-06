/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
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
@Table(name="encuesta")
@NamedQueries({
@NamedQuery(name="FindtoAllEncuestas",query="SELECT encuesta from Encuesta encuesta"),
@NamedQuery(name="EliminarEncuesta",query="DELETE FROM Encuesta c WHERE c.id = :user")

})
public class Encuesta implements Serializable {
    @Id
    @Column (name="id")
    private int id;
    @Column (name="titulo")
    private String titulo;
    @Column (name="f_estado")
    private int f_estado;
    @Column (name="fecha_v")
    private String fecha_v;
    @Column (name="fk_usuario")
    private int fk_usuario;

    public Encuesta(int id, String titulo, int f_estado, String fecha_v, int fk_usuario) {
        this.id = id;
        this.titulo = titulo;
        this.f_estado = f_estado;
        this.fecha_v = fecha_v;
        this.fk_usuario = fk_usuario;
    }

    public Encuesta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getF_estado() {
        return f_estado;
    }

    public void setF_estado(int f_estado) {
        this.f_estado = f_estado;
    }

    public String getFecha_v() {
        return fecha_v;
    }

    public void setFecha_v(String fecha_v) {
        this.fecha_v = fecha_v;
    }

    public int getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(int fk_usuario) {
        this.fk_usuario = fk_usuario;
    }
    
    
    
    
    
    
    
    
    
    
    
}
