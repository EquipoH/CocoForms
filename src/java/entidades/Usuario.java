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
@Table(name="usuario")
@NamedQueries({
@NamedQuery(name="Usuario",query="SELECT usuario from Usuario usuario"),
//@NamedQuery(name="inicio",query="SELECT usuario from Usuario usuario where usuario.nombre=:nombre and usuario.fk_pregunta=:contrasena")

})
public class Usuario {
    @Id
    @Column (name="id")
    private int id;
    
    @Column (name="nombre")
    private String nombre;
    @Column (name="contrasena")
    private String fk_pregunta;
       @Column (name="usuario")
    private String usuario;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String fk_pregunta, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.fk_pregunta = fk_pregunta;
        this.usuario = usuario;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFk_pregunta() {
        return fk_pregunta;
    }

    public void setFk_pregunta(String fk_pregunta) {
        this.fk_pregunta = fk_pregunta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
       
       


}
