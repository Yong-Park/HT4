/*
Codigo reutilizado del documento que se compartio en el modulo de listas encadenadas
*/
public class DoubleLinkedList<T> extends List<T>{
    protected int count;
    protected DoubleNode<T> head;
    protected DoubleNode<T> tail;

    public DoubleLinkedList(){
        head = null;
        tail = null;
        count = 0;
    }
    
    /** 
     * @param e
     */
    public void push(T e){
        head = new DoubleNode<T>(e, head, null);
        if (tail == null) tail = head;
        count++;
    }
    
    /** 
     * @return T
     */
    public T pop(){
        //pop de numeros
        DoubleNode<T> temp = head;
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
