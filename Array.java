import java.util.ArrayList;
public class Array<T> implements MenuGeneral<T> {
    ArrayList<T> datos = new ArrayList<T>();
    ArrayList<Float> numeros  = new ArrayList<Float>();
    ArrayList<String> operando = new ArrayList<String>();
    
    public void ordenar(T e){
        datos.add(e);
        System.out.println(datos);
        
    }
    public void push(T e){

    }
    public T pop(){
        return null;
    }
    public void addFirst(T e){

    }
    public void appEnd(T e){

    }
    public int Size(){

        return 0;
    }
}
