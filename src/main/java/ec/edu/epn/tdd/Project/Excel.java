package ec.edu.epn.tdd.Project;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class Excel {
    private String inputFile;
    String[][] data = null;
    public void setInputFile(String inputFile)
    {
        this.inputFile = inputFile;
    }

    public String[][] read() throws IOException
    {
        File inputWorkbook = new File(inputFile);
        Workbook w;

        try
        {
            w = Workbook.getWorkbook(inputWorkbook);
            // Get the first sheet


            Sheet sheet = w.getSheet(0);
            data = new String[sheet.getRows()][sheet.getColumns()];
            // Loop over first 10 column and lines
            //     System.out.println(sheet.getColumns() +  " " +sheet.getRows());
            for (int i = 0; i < sheet.getRows(); i++)
            {
                for (int j = 0; j <sheet.getColumns(); j++){
                    Cell cell = sheet.getCell(j, i);
                    data[i][j] = cell.getContents();
                    //  System.out.println(cell.getContents());
                }
            }

            imprimirTabla(data);

        }
        catch (BiffException e)
        {
            e.printStackTrace();

        }
        if(data.length ==0 ) return null;
        return data;
    }

    public static String agregar_espacios(String Cadena, int tamanoCadena){
        String CadenaConEspacios =Cadena;
        for(int i=CadenaConEspacios.length();i<tamanoCadena;i++){
            CadenaConEspacios=CadenaConEspacios + " ";
        }
        return CadenaConEspacios;
    }

    public void imprimirTabla(String Tabla[][]){
        System.out.println("\tAlimento\t\t\t\t\t\t\t\t| Cantidad\t\t\t\t\t\t| Calorias");
        for (int j = 0; j < Tabla.length; j++)
        {
            System.out.print(j+"\t");
            for (int i = 0; i <Tabla[j].length; i++)
            {
                if(i==0) {
                    System.out.print(agregar_espacios(Tabla[j][i],38) + "\t");
                }else if(i==1){
                    System.out.print("| "+agregar_espacios(Tabla[j][i],26) + "\t");
                }else{
                    System.out.print("| "+Tabla[j][i] + "\t\t");
                }
            }
            System.out.println();
        }
    }


}
