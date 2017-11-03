/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hbm.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.Persona;
import pojo.TipoPersona;

/**
 *
 * @author RigoBono
 * Se ara una clase para PersonaDAO
 */
public class PersonaDAO {
    Session session;
    
    public PersonaDAO(){
        //se declarara una sesion hibernateUtil.
        session=HibernateUtil.getLocalSession();
    }
    //con el id podemos hacer la sesion de persona.
    public  Persona getPersonaById(int id){
        return (Persona)session.load(Persona.class, id);
    }
    //Se crea una lista de personas y se crean los nombres.
    public List<Persona>  getPersonaByName(String nombre){
        List<Persona> listaDePersonas=(List<Persona>)
                session.createCriteria(Persona.class)
                .add(Restrictions.eq("Nombre", nombre));
        return listaDePersonas;
    }
    //Se va a ser un try catch de una transacion para hacer el commit 
    public boolean updateById(int id,Persona persona){
        Persona personaAModificar=getPersonaById(id);
        try{
            Transaction transaccion=session.beginTransaction();
            personaAModificar.setNombre(persona.getNombre());
            session.update(personaAModificar);
            transaccion.commit();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    //Aqui se agarran los valores a insertar
    public boolean savePersona(String nombre,String materno,String paterno,String telefono,int idTipoPersona){
        Persona personaDeTanque=new Persona();
        TipoPersona tipoDeTanque=(TipoPersona)session.load(TipoPersona.class, idTipoPersona);
        personaDeTanque.setNombre(nombre);
        personaDeTanque.setMaterno(materno);
        personaDeTanque.setPaterno(paterno);
        personaDeTanque.setTelefono(telefono);
        personaDeTanque.setTipoPersona(tipoDeTanque);
        try{
            Transaction transaccion=session.beginTransaction();
            session.save(personaDeTanque);
            transaccion.commit();
            return true;
        }catch(Exception e){
            
        }finally{
            
        }
        return true;
    }
    
}
