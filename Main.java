/*
Main.java
La parte de la lectura de archivos se copio del codigo de la hoja de tranajo 2 que se realizo
La parte de la conversion se tomo de geeks for geeks https://www.geeksgorgeeks.org/stack-set-2-infix-to-postfix/
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Stack;
class Main {
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    //singleton
    Singleton calcu =Singleton.getInstance();

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
      System.out.println("Los datos en infix: "+lineas);
    }
    //mostrar lo de posfix
    for(String lineas: postfix){
      System.out.println("Los datos en postfix: "+lineas);
    }
    //trabajar segun lo que deseo el usuario
    int elegido =menu();
    Eligir eligir = new Eligir();
    System.out.println("____________________");
    MenuGeneral<String> operando = eligir.opcionMenu(elegido);
    MenuGeneral<Float> datos = eligir.opcionMenu(elegido);

    
    //para realizar los calculos en la calculadora
    for(String lineas: postfix){
      String dato = calcu.caclular(lineas, operando, datos);
      System.out.println(dato);
       
    }  

    System.out.println("___________________________________");

  }
  
  /** 
   * @param ch
   * @return int
   */
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

  
  /** 
   * @param dato
   * @return String
   */
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

  
  /** 
   * @return int
   */
  //MENU
  public static int menu(){
    boolean ciclo=true;
    Scanner scanner = new Scanner(System.in);
    int elegido=0;
    do{
      System.out.println("___________________________________");
      System.out.println("Operar");
      System.out.println("1. ArrayList");
      System.out.println("2. Vector");
      System.out.println("3. Lista");
      //escoger
      elegido = opcion();
      //pedir si quiere single o double linked list
      if(elegido==3){
        System.out.println("4. SingleLinkedList");
        System.out.println("5. DoubleLinkedList");
        elegido=opcionLista();
      }
      ciclo=false;
    }while(ciclo);
    return elegido;
  }

  
  /** 
   * @return int
   */
  //verificar que sea un  numero el dato ingresado
  public static int opcion(){
    Scanner scanner = new Scanner(System.in);
    int opcion_numero=0;
    boolean ciclo_numero=true;
            do{
                try{
                    String opcion = scanner.next();
                    //verificar que sea una opcion adecuada
                    opcion_numero = Integer.parseInt(opcion);
                    if(opcion_numero>=1 && opcion_numero<=3){
                        ciclo_numero=false;
                    }else{
                        System.out.println("Porfavor escoja una de las opcioens que se presentan en el menu");
                    }
                }catch(Exception e){
                    System.out.println("Ingersa solo datos numericos");
                }
            }while(ciclo_numero);

    return opcion_numero;
  }
  
  /** 
   * @return int
   */
  //menu para escoger la lista
  public static int opcionLista(){
    Scanner scanner = new Scanner(System.in);
    int opcion_numero=0;
    boolean ciclo_numero=true;
            do{
                try{
                    String opcion = scanner.next();
                    //verificar que sea una opcion adecuada
                    opcion_numero = Integer.parseInt(opcion);
                    if(opcion_numero>=4 && opcion_numero<=5){
                        ciclo_numero=false;
                    }else{
                        System.out.println("Porfavor escoja una de las opcioens que se presentan en el menu");
                    }
                }catch(Exception e){
                    System.out.println("Ingersa solo datos numericos");
                }
            }while(ciclo_numero);

    return opcion_numero;
  }
}