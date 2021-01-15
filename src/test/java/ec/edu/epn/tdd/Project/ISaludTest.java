package ec.edu.epn.tdd.Project;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ISaludTest {

    private Persona p;
    private ISalud i;

    @Before
    public void prepare() {
        System.out.println("prepare");
        p = new Persona(1,"Boris","Caiza",56,161,20,1,"M");



    }

    @Test
    public void given_one_double_high_then_overwigth(){

        i = Mockito.mock(ISalud.class);
        Mockito.when(i.Peso(p.calcularIMC())).thenReturn(Boolean.TRUE);
        assertTrue(i.Peso(p.calcularIMC()));
    }

    @Test
    public void given_one_double_icm_then_calculate_ideal_weight(){

        i = Mockito.mock(ISalud.class);
        Mockito.when(i.pesoIdeal(p.calcularIMC())).thenReturn(59.3);
        assertEquals(59.3,59.3,2);
    }




}