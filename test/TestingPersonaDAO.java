/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.PersonaDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Persona;

/**
 *
 * @author RigoBono
 */
public class TestingPersonaDAO {
    
    public TestingPersonaDAO() {
    }
    //Metodos que va a realizar y void
    //Y los pasos que debe de seguir para los void 
    //Se ejecutara clase antes de cada metodo
    @BeforeClass
    public static void setUpClass() {
    }
    //Se ejecutara despues de cada metodo
    @AfterClass
    public static void tearDownClass() {
    }
    //Se ejecutara antes de cada metodo
    @Before
    public void setUp() {
    }
    //Se ejecutara despyes de cada metodo
    @After
    public void tearDown() {
    }

    //Es para identificar que el metodo sera un metodo a testear
     @Test
     public void hello() {
         //Se declara un objeto personita y personaProNuevoPablo
         PersonaDAO personita=new PersonaDAO();
         Persona personaProNuevoPablo=new Persona();
         //Aqui se manda al set el nombre que introdusimos
         personaProNuevoPablo.setNombre("Martha");
         //Aqui se va a modificar la columna 4 por el nuevo nombre
         personita.updateById(4, personaProNuevoPablo);
     }
}
