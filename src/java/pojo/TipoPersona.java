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
import javax.persistence.Table;

/**
 *  #Pray4Tanque
 * @author RigoBono
 */
//declaramos una entidad 
@Entity
//Mandamos llamar la tabla de nuestro sql
@Table(name="TipoPersona", catalog="generationHibernate")
public class TipoPersona {
    //pedimos un id que se valla generando
    @Id @GeneratedValue
    //Declaramos las columnas de la sql
    @Column(name="idTipoPersona")
    private int idTipoPersona;
    //Declaramos las columnas de la sql
     @Column(name="TipoPersonacol")
    private String TipoPersona;
    //Declaramos un metodo
     public TipoPersona(){
         
     }
     
    //Pedimos los get y set
    /**
     * @return the idTipoPersona
     */
    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    /**
     * @param idTipoPersona the idTipoPersona to set
     */
    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    /**
     * @return the TipoPersona
     */
    public String getTipoPersona() {
        return TipoPersona;
    }

    /**
     * @param TipoPersona the TipoPersona to set
     */
    public void setTipoPersona(String TipoPersona) {
        this.TipoPersona = TipoPersona;
    }
     
     
     
     
    
}
