import java.util.ArrayList;
public class Array<T> implements MenuGeneral<T> {
    ArrayList<T> datos = new ArrayList<T>();
    

    
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
