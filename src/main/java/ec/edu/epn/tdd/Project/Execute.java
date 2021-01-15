package ec.edu.epn.tdd.Project;

public class   Execute {
    public static  void main (String [] args){

        Persona personaM = new Persona(1,"Boris","Caiza",56,161,20,1,"M");
        System.out.println(personaM.toString());
        Calorias calorías0 = new Calorias(personaM);
        System.out.println("El número de calorías que debes de consumir por día es de: "+calorías0.calcularCalorias());
        //Dieta dieta = new Dieta(calorías0, personaM);
        //System.out.println("=====================================================");
       // dieta.RealizarDieta(1);
        System.out.println("Segundo commin and Push.");

    }
}