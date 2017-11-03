/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author RigoBono
 */
//declaramos una entidad que vamos a definir una row
@Entity
//Mandamos llamar la tabla de nuestro sql
@Table(name="Persona",catalog="generationHibernate")
//Declaramos nuestra clase
public class Persona {
    //pedimos un id que se valla generando
    @Id @GeneratedValue
    //Declaramos las columnas de la sql
    @Column(name="idPersona")
    private int idPersona;
    //Declaramos las columnas de la sql
    @Column(name="Nombre",nullable=true)
    private String Nombre;
    //Declaramos las columnas de la sql
    @Column(name="Paterno")
    private String Paterno;
    //Declaramos las columnas de la sql
    @Column(name="Materno")
    private String Materno;
    //Declaramos las columnas de la sql 
    @Column(name="Telefono")
    private String Telefono;
    //Declararemos la relacion que existe en la tabla muchos a uno
     @ManyToOne
     //LLave foranea 
     @JoinColumn(name="idTipoPersona")
    private TipoPersona tipoPersona;

    /**
     * @return the idPersona
     */
     
     //Declararemos los Get y Set
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Paterno
     */
    public String getPaterno() {
        return Paterno;
    }

    /**
     * @param Paterno the Paterno to set
     */
    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    /**
     * @return the Materno
     */
    public String getMaterno() {
        return Materno;
    }

    /**
     * @param Materno the Materno to set
     */
    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the tipoPersona
     */
    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    /**
     * @param tipoPersona the tipoPersona to set
     */
    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
     
     
    
}
