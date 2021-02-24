import java.util.Vector;
public class VectorDatos<T> implements MenuGeneral<T>{
    Vector<T> datos = new Vector<T>();
    
    public void ordenar(T e){
        datos.add(e);
        System.out.println(datos);
        
    }
    public void push(T e){
        datos.add(e);
    }
    public T pop(){
        //pop de numeros
        T dato = datos.get(Size()-1);
        datos.remove(dato);
        return dato;
    }
    
    public int Size(){
        int longitud = datos.size();
        return longitud;
    }
}
