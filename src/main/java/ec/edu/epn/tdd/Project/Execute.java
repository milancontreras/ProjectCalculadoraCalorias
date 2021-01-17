package ec.edu.epn.tdd.Project;

public class   Execute {
    public static  void main (String [] args){

        System.out.println("Cambio #11");
        Persona personaM = new Persona(1,"Boris","Caiza",56,161,20,1,"M");
        Calorias calorías0 = new Calorias(personaM);
        System.out.println("Calorias: "+calorías0.calcularCalorias());

    }
}