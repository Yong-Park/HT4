import java.util.LinkedList;

public class SinlgyLinkedList<T> implements MenuGeneral<T>{
    LinkedList<T> datos = new LinkedList<T>();
    static class Node {
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

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
