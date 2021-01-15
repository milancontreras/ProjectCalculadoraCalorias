package ec.edu.epn.tdd.Project;

public class Persona //Nombre de la clase
{
    private int id_Persona;
    private String nombre;
    private String apellidos;
    private double peso;
    private double altura;
    private int edad;
    private int ejercicio;
    private String sexo;

    public Persona(int id_Persona, String nombre, String apellidos, double peso, double altura, int edad, int ejercicio,
                   String sexo) {
        this.id_Persona = id_Persona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.ejercicio = ejercicio;
        this.sexo = sexo;
    }

    public double calcularIMC()
    {

        double altura  = getAltura()/100;
        double peso = getPeso();
        double imc = peso/(altura*altura);
        return imc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }

    public int getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id_Persona=" + id_Persona +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", edad=" + edad +
                ", ejercicio='" + ejercicio + '\'' +
                '}';
    }


}


