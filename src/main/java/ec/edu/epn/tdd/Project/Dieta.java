package ec.edu.epn.tdd.Project;

import java.io.IOException;
import java.util.Scanner;


public class Dieta {

    private Calorias calorías;
    private Persona persona;


    public Dieta(Calorias calorías, Persona persona) {
        this.calorías = calorías;
        this.persona = persona;
    }


    public double[] caloriasPorComida() {
        double a[] = new double[5];
        a[0] = getCaloriasDieta(calorías.calcularCalorias()) * 0.15;
        a[1] = getCaloriasDieta(calorías.calcularCalorias()) * 0.10;
        a[2] = getCaloriasDieta(calorías.calcularCalorias()) * 0.4;
        a[3] = getCaloriasDieta(calorías.calcularCalorias()) * 0.10;
        a[4] = getCaloriasDieta(calorías.calcularCalorias()) * 0.25;
        return a;
    }

    private double getCaloriasDieta(double cal) {
        if (persona.calcularIMC() > 25) {
            cal = cal - 500;
        }
        return cal;
    }

    public void imprimirCaloriasDieta() {
        System.out.println("Calorias para la dieta: " + getCaloriasDieta(calorías.calcularCalorias()) + " Kcal");
    }

    public void imprimirCaloriasDietaPorComida() {

        String comidas[] = new String[5];
        comidas[0] = "Desayuno: ";
        comidas[1] = "Media mañana: ";
        comidas[2] = "Almuerzo: ";
        comidas[3] = "Media tarde: ";
        comidas[4] = "Merienda: ";
        double caloriasComida[] = caloriasPorComida();


        System.out.println("Calorias por comida: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(comidas[i] + caloriasComida[i] + " Kcal");
        }

    }

    public boolean comprobarCaloriasConsumidas(double caloriasPorComida_x, double CaloriasConsumidas) {
        if (CaloriasConsumidas > caloriasPorComida_x) {
            return false;
        } else {
            return true;
        }
    }

    public void RealizarDieta(int HoraComida,String AlimentoSeleccionadoTeclado[]) {

        String[][] tabla;
        Excel DocDesayuno = new Excel();

        switch(HoraComida)
        {

            case 0 :
                int ComidaDesayuno=0;

                DocDesayuno.setInputFile("src/main/resources/Desayuno.xls");
                try{
                    tabla=DocDesayuno.read();
                    seleccionarAlimentos(tabla,ComidaDesayuno,AlimentoSeleccionadoTeclado);

                }catch (IOException e) {
                    e.printStackTrace();
                }

                break;

            case 1 :
                int ComidaMediaMañana=0;

                DocDesayuno.setInputFile("src/main/resources/Desayuno.xls");
                try{
                    tabla=DocDesayuno.read();
                    seleccionarAlimentos(tabla,ComidaMediaMañana,AlimentoSeleccionadoTeclado);

                }catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case 2 :
                int ComidaAlmuerzo=0;

                DocDesayuno.setInputFile("src/main/resources/Desayuno.xls");
                try{
                    tabla=DocDesayuno.read();
                    seleccionarAlimentos(tabla,ComidaAlmuerzo,AlimentoSeleccionadoTeclado);

                }catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case 3 :
                int ComidaMediaTarde=0;

                DocDesayuno.setInputFile("src/main/resources/Desayuno.xls");
                try{
                    tabla=DocDesayuno.read();
                    seleccionarAlimentos(tabla,ComidaMediaTarde,AlimentoSeleccionadoTeclado);

                }catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case 4 :
                int ComidaMerienda=0;

                DocDesayuno.setInputFile("src/main/resources/Desayuno.xls");
                try{
                    tabla=DocDesayuno.read();
                    seleccionarAlimentos(tabla,ComidaMerienda,AlimentoSeleccionadoTeclado);

                }catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            default :
                //   System.out.println("Ayuda");
        }

    }


    public int[] seleccionarAlimentos(String tabla[][], int Comida,String AlimentoSeleccionadoTeclado2[]) {
        String[] identificadorComida = {"Desayuno", "Media mañana", "Almuerzo", "Media tarde", "Merienda"};
        int filasTabla = tabla.length;
        int numFilaDelatablaSeleccionado;
        int sumaDecalorias = 0;
        double caloriasComida = caloriasPorComida()[Comida];
        int[] seleccion = new int[filasTabla];
        int contador = 0;
        String AlimentoSeleccionadoTeclado;

        if (AlimentoSeleccionadoTeclado2.length == 0) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("++++++++ Seleccione su dieta ++++++++");
            System.out.println("Nota: Para ya no seleccionar mas puede digitar cualquier valor no numerico");

            while (true) {
                System.out.println("Seleccione un alimento para su dieta: ");

                AlimentoSeleccionadoTeclado = teclado.nextLine();


                if (!AlimentoSeleccionadoTeclado.matches("[0-9]+")) {
                    break;
                } else {
                    numFilaDelatablaSeleccionado = Integer.parseInt(AlimentoSeleccionadoTeclado);
                    if ((numFilaDelatablaSeleccionado < 0 || numFilaDelatablaSeleccionado > filasTabla) || !comprobarCaloriasConsumidas(caloriasComida, sumaDecalorias)) {
                        break;
                    }
                }

                sumaDecalorias += Double.parseDouble(tabla[numFilaDelatablaSeleccionado][2]);
                System.out.println(sumaDecalorias + " calorias de " + caloriasComida);

                seleccion[contador] = numFilaDelatablaSeleccionado;
                contador++;
            }
        } else {
            for (int i = 0; i < AlimentoSeleccionadoTeclado2.length; i++) {

                AlimentoSeleccionadoTeclado = AlimentoSeleccionadoTeclado2[contador];

                if (!AlimentoSeleccionadoTeclado.matches("[0-9]+")) {
                    break;
                } else {
                    numFilaDelatablaSeleccionado = Integer.parseInt(AlimentoSeleccionadoTeclado);
                    if ((numFilaDelatablaSeleccionado < 0 || numFilaDelatablaSeleccionado > filasTabla) || !comprobarCaloriasConsumidas(caloriasComida, sumaDecalorias)) {
                        break;
                    }
                }

                sumaDecalorias += Double.parseDouble(tabla[numFilaDelatablaSeleccionado][2]);
                System.out.println(sumaDecalorias + " calorias de " + caloriasComida);

                seleccion[contador] = numFilaDelatablaSeleccionado;
                contador++;


            }
        }


        System.out.println("Su total de consumo calorico para su " + identificadorComida[Comida] + " desayuno es de: " + sumaDecalorias);
        System.out.println("Alimentos de su " + identificadorComida[Comida] + ":");
        for (int i = 0; i < contador; i++) {
            System.out.print(seleccion[i] + ", ");
        }
        System.out.println();

        return seleccion;
    }
}






