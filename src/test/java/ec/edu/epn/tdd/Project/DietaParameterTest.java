package ec.edu.epn.tdd.Project;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;


@RunWith(value = Parameterized.class)
public class DietaParameterTest {

    private double actual, expected;
    private Persona p;
    private  Calorias c;

    @Before
    public void prepare() {
        System.out.println("prepare");
        p = new Persona(1,"Boris","Caiza",56,161,20,1,"M");
        c = new Calorias(p);}

    @Parameterized.Parameters
    public static  Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{2,4});
        objects.add(new Object[]{1,8});
        objects.add(new Object[]{2,5});
        objects.add(new Object[]{22,50});
        objects.add(new Object[]{120,150});
        return objects;}

    public DietaParameterTest(double actual, double expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Test
    public void given_two_doubles_when_you_consume_more_calories_than_you_should_then_wrong(){

        System.out.println("Test unitario con parámetro 1 ");
        Dieta d = new Dieta(c, p);
        assertFalse(d.comprobarCaloriasConsumidas(actual,expected));
    }
}