package ec.edu.epn.tdd.Project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class DietaParameterTest2 {
    private String  a;
    private int  b;
    private  String expect;
    private Excel e;


    @Parameterized.Parameters
    public static  Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"a",2,"a ",});
        objects.add(new Object[]{"c",3,"c  ",});
        objects.add(new Object[]{"e",2,"e ",});
        objects.add(new Object[]{"S",4,"S   ",});
        objects.add(new Object[]{"Milan",10,"Milan     ",});
        return objects;}

    public DietaParameterTest2(String a, int b, String expect) {
        this.a = a;
        this.b = b;
        this.expect = expect;
    }

    @Test
    public void given_one_string_and_one_integer_addition_then_ok(){
        System.out.println("Test unitario con parámetro 2");
        assertEquals(expect,e.agregar_espacios(a,b));
    }
}