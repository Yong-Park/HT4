/*
Main.java
La parte de la lectura de archivos se copio del codigo de la hoja de tranajo 2 que se realizo
La parte de la conversion se tomo de geeks for geeks https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Stack;
class Main {
  public static void main(String[] args) {
    ArrayList<String> infix = new ArrayList<String>();
    ArrayList<String> postfix = new ArrayList<String>();
    //guardar los datos
        try{
            File datos = new File("Datos.txt");
            Scanner lectura = new Scanner(datos);

            while(lectura.hasNextLine()){
                String expresion = lectura.nextLine();
                infix.add(expresion);
            }
            lectura.close();
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
            e.printStackTrace();
        }
        //convertir de infix a postfix
    for(String lineas: infix){
      postfix.add(infixToPostfix(lineas));
    }
    //mostrar lo de infix
    for(String lineas: infix){
      System.out.println(lineas);
    }
    //mostrar lo de posfix
    for(String lineas: postfix){
      System.out.println(lineas);
    }
  }
  //para retornar segun el tipo de signo que tenga
  public static int Prec(char ch){ 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 

  //para convertir de infix a postfix
  public static String infixToPostfix(String dato){
    // crear un string vacio
    String result = new String(""); 
          
    // crear un stack vacio
    Stack<Character> stack = new Stack<>(); 
      
    for (int i = 0; i<dato.length(); ++i) 
    { 
        char c = dato.charAt(i); 
          
        // Revisar si es un operando como un + - * /
        if (Character.isLetterOrDigit(c)) 
            result += c; 
           
        // Revisar si es un (
        else if (c == '(') 
            stack.push(c); 
          
        // Revisar si es un ) 
        else if (c == ')') 
        { 
            while (!stack.isEmpty() &&  
                    stack.peek() != '(') 
                result += stack.pop(); 
              
                stack.pop(); 
        } 
        else 
        { 
            while (!stack.isEmpty() && Prec(c)<= Prec(stack.peek())){ 
                
                result += stack.pop(); 
         } 
            stack.push(c); 
        } 
   
    } 
   
    // pop los operandos del stack
    while (!stack.isEmpty()){ 
        if(stack.peek() == '(') 
            return "Invalid Expression"; 
        result += stack.pop(); 
     } 
    return result; 
  }
}