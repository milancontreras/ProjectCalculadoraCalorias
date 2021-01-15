package ec.edu.epn.tdd.Project;


import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {


    @Test
    public void a(){
        Persona personaH = new  Persona (2,"Boris","Caiza",55,161,20,1,"M");;
        assertEquals(personaH.calcularIMC(),21.60,2);
    }
}