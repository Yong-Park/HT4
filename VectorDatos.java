import java.util.Vector;
public class VectorDatos<T> implements MenuGeneral<T>{
    Vector<T> datos = new Vector<T>();
    
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
