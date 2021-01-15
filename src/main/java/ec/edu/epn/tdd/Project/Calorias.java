package ec.edu.epn.tdd.Project;

public class Calorias {

    private Persona persona;

    public Calorias(Persona persona) {
        this.persona = persona;
    }

    public double calcularCalorias() {
        double calorias;
        double caloriasejercicio;


        if(persona.getSexo().equals("M")) {
            calorias = getCaloriasHombre();
            caloriasejercicio = getCaloriasporEjercicio(calorias);

        }else{

            calorias = getCaloriasMujer();
            caloriasejercicio = getCaloriasporEjercicio(calorias);
        }
        return caloriasejercicio;

    }

    public double getCaloriasMujer() {
        double calorias;
        calorias = (10 * persona.getPeso()) + (6.25 * persona.getAltura()) - (5 * persona.getEdad()) - 161;
        return calorias;
    }

    public double getCaloriasHombre() {
        double calorias;
        calorias = (10 * persona.getPeso()) + (6.25 * persona.getAltura()) - (5 * persona.getEdad()) + 5;
        return calorias;
    }

    public double getCaloriasporEjercicio(double calorias) {
        if (persona.getEjercicio() == 1) return calorias * 1.2;
        else if (persona.getEjercicio() == 2) return calorias * 1.375;
        else if (persona.getEjercicio() == 3) return calorias * 1.55;
        else if (persona.getEjercicio() == 3) return calorias * 1.725;
        else if (persona.getEjercicio() == 4) return calorias * 1.9;
        return calorias;
    }





    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}


