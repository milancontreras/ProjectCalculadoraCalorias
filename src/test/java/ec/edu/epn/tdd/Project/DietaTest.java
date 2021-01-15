package ec.edu.epn.tdd.Project;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class DietaTest {
    private Persona p;
    private Calorias c;
    private Dieta d;
    @Before
    public void prepare() {


        p = new Persona(1,"Boris","Caiza",56,161,20,1,"M");
        c = new Calorias(p);
        d = new Dieta(c,p);


    }
    @Test
    public void given_an_array_when_not_null_then_ok(){
        System.out.println("Test unitario 1");
        assertNotNull(d.caloriasPorComida());
    }

    @Test
    public void given_two_doubles_when_you_consume_more_calories_than_you_should_then_wrong(){

        System.out.println("Test unitario 2");
        assertFalse(d.comprobarCaloriasConsumidas(25,50));
    }

    @Test
    public void given_two_doubles_when_consuming_less_calories_than_you_should_then_ok(){

        System.out.println("Test unitario 3");
        assertTrue(d.comprobarCaloriasConsumidas(50, 25));
    }



    @Test
    public void given_one_file_incorrect_then_wrong(){
        System.out.println("Test unitario 5 ");
        String[] AlimentoSeleccionadoTeclado2={"2","1","4","6"};
        try {
            d.RealizarDieta(0,AlimentoSeleccionadoTeclado2);
        }catch (Exception e) {
            fail();
        }
    }



    @Test
    public void given_a_table_a_FoofTime_and_the_selection_of_the_food_then_an_expected_array_of_selection(){
        //Comentar la linea 160 y 169 y descomentar la 159 y 171 para realizar las pruebas de Dieta.java
        System.out.println("Test unitario 8 ");
        String[][] tabla = new String[0][];
        Excel DocDesayuno = new Excel();
        DocDesayuno.setInputFile("src/main/resources/Desayuno.xls");
        String[] AlimentoSeleccionadoTeclado2={"2","1","4","exit"};



        try {
            tabla = DocDesayuno.read();
            int[] expected= new int[tabla.length];
            expected[0]=2;
            expected[1]=1;
            expected[2]=4;
            assertArrayEquals(expected,d.seleccionarAlimentos(tabla,0,AlimentoSeleccionadoTeclado2));
        }catch(IOException e) {
            e.printStackTrace();
        }


    }



}