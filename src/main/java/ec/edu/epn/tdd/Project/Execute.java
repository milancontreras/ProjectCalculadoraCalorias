package ec.edu.epn.tdd.Project;

public class   Execute {
    public static  void main (String [] args){

        System.out.println("Commit and push #9");

        Persona personaM = new Persona(1,"Boris","Caiza",56,161,20,1,"M");
        Calorias calorías0 = new Calorias(personaM);
        Dieta dieta = new Dieta(calorías0, personaM);
        System.out.println("\n=====================================================");

        //Imprimir datos de la persona
        System.out.println(personaM.personaGrafico());
        System.out.println("\nLa cantidad calorica que se debe consumir por dia es de: "+calorías0.calcularCalorias()+" Kcal");
        System.out.println("\n=====================================================");

        //Imprimir las calorias que se pueden consumir por comida
        dieta.imprimirCaloriasDietaPorComida();
        System.out.println("\n=====================================================");

        //Seleccion automatizada de Alimentos
        System.out.println("++++++Seleccion de alimentos para el desayuno++++++\n");
        String[] AlimentoSeleccionadoTeclado2={"0","14","26","exit"};
        dieta.RealizarDieta(0,AlimentoSeleccionadoTeclado2);
    }
}