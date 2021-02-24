/*
Codigo reutilizado del documento que se compartio en el modulo de listas encadenadas
*/
import java.util.LinkedList;
public class List<T> implements MenuGeneral<T>{
   
    LinkedList<T> datos = new LinkedList<T>();

    
    /** 
     * @param e
     */
    public void push(T e){
        datos.add(e);
    }
    
    /** 
     * @return T
     */
    public T pop(){
        //pop de numeros
        T dato = datos.get(Size()-1);
        datos.remove(dato);
        return dato;
    }
    
    
    /** 
     * @return int
     */
    public int Size(){
        int longitud = datos.size();
        return longitud;
    }
}
