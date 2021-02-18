/*
Main.java
La parte de la lectura de archivos se copio del codigo de la hoja de tranajo 2 que se realizo
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
class Main {
  public static void main(String[] args) {
    ArrayList<String> stack = new ArrayList<String>();
    //guardar los datos
        try{
            File datos = new File("Datos.txt");
            Scanner lectura = new Scanner(datos);

            while(lectura.hasNextLine()){
                String expresion = lectura.nextLine();
                stack.add(expresion);
            }
            lectura.close();
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
            e.printStackTrace();
        }
    for(String lineas: stack){
      System.out.println(lineas);
    }
  }
}