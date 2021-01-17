package ec.edu.epn.tdd.Project;

public class   Execute {
    public static  void main (String [] args){

        System.out.println("Cambio #13");

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
    }
}