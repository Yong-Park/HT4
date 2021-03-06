/*
Codigo reutilizado del documento que se compartio en el modulo de listas encadenadas
*/
public class SinlgyLinkedList<T> extends List<T>{
    protected int count; 
    protected Node<T> head; 

    public void SinglyLinkedList(){
      head = null;
      count = 0;
    }

    
    /** 
     * @param e
     */
    public void push(T e){
        head = new Node<T>(e, head);
        count++;
    }
    
    /** 
     * @return T
     */
    public T pop(){
        //pop de numeros
        Node<T> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }
    
    
    /** 
     * @return int
     */
    public int Size(){
        return count;
    }
}
