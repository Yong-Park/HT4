public class Singleton {
    private static Singleton single_instance = null; 
  
    // variable of type String 
    Calculadora calculadora;
  
    // private constructor restricted to this class itself 
    private Singleton() 
    { 
        calculadora = new Calculadora();
    } 

    public String caclular(String linea, MenuGeneral<String> operandos, MenuGeneral<Float> datos){

        return calculadora.Calculo(linea, operandos, datos);
    }
  
    // static method to create instance of Singleton class 
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    } 
}
