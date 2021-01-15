package ec.edu.epn.tdd.Project;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaloriasTest {

private Persona personaM;
private Persona personaH;
private Calorias caloriasH;
    private Calorias caloriasM;
    @Before
    public void prepare() {


        personaH = new Persona(2,"Boris","Caiza",55,161,20,1,"M");
        personaM = new Persona(1,"Elizabeth","Sarmiento",49,155,20,1,"M");
        caloriasH = new Calorias(personaH);
        caloriasM = new Calorias(personaM);

    }


    @Test
    public void given_a_women_then_calculate_calories(){

        assertEquals(caloriasM.getCaloriasMujer(), 1197.75,2);

    }


    @Test
    public void given_a_men_then_calculate_calories(){

        assertEquals(caloriasH.getCaloriasHombre(), 1461.25,2);

    }

    @Test
    public void given_a_persin_then_calculate_plus_exercise(){

        assertEquals(caloriasH.getCaloriasporEjercicio(caloriasH.getCaloriasHombre()), 1753.5,2);

    }

}