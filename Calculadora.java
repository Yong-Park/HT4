import java.util.ArrayList;
import java.util.Vector;
public class Calculadora {
    //atributos
    Float num1=0f;
    Float num2=0f;
    String operacion;
    Float resultado = 0f;
    
    /** 
     * @param linea
     * @return String
     */
    //realizar la operacion
    public String Calculo(String linea, MenuGeneral<String> operandos, MenuGeneral<Float> datos){
        //defnir clases
        MenuGeneral<Float> numeros= datos;
        MenuGeneral<String> signos = operandos;
        resultado = 0f;

        //guardar segun el tipo de dato que sea
        for(int i=0; i<linea.length();i++){
            //obtener segun la variable
            char result = linea.charAt(i);
            String s =String.valueOf(result);
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                signos.push(s);
                
            }else{
                float f = Float.parseFloat(s);
                numeros.push(f);
            }
            //revisar si ya hay dos datos y en caso que si revisar tambien si ya hay algun operando
            if(numeros.Size()>=2 && signos.Size()>=1){
                //operar
                num1 = numeros.pop();
                num2 = numeros.pop();
                operacion = signos.pop();
                //operar segun el signo
                if(operacion.equals("+")){
                    resultado = num1 + num2;
                }else if(operacion.equals("-")){
                    resultado = num2 - num1; 
                }else if(operacion.equals("/")){
                    resultado = num2 / num1;
                }else if(operacion.equals("*")){
                    resultado = num1 * num2;
                }
                //agregar el resultado al stack
                numeros.push(resultado);
            }
        }
        
        //resultado
        String resultadoTexto = String.valueOf(resultado);
        return resultadoTexto;
    }
}
