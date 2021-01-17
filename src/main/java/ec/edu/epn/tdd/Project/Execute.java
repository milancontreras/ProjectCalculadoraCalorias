package ec.edu.epn.tdd.Project;

public class   Execute {
    public static  void main (String [] args){

        System.out.println("Commit and push #8");

        Persona personaM = new Persona(1,"Boris","Caiza",56,161,20,1,"M");
        Calorias calorías0 = new Calorias(personaM);


        System.out.println(personaM.personaGrafico());
        System.out.println("\nLa cantidad calorica que se debe consumir por dia es de: "+calorías0.calcularCalorias()+" Kcal");


    }
}