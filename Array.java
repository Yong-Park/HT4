import java.util.ArrayList;
public class Array<T> implements MenuGeneral<T> {
    ArrayList<T> datos = new ArrayList<T>();
    
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
    public void addFirst(T e){

    }
    public void appEnd(T e){

    }
    public int Size(){
        int longitud = datos.size();
        return longitud;
    }
    
}
