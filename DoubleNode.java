/*
Codigo reutilizado del documento que se compartio en el modulo de listas encadenadas
*/
public class DoubleNode<T> {
    protected T data;
    protected DoubleNode<T> nextElement;
    protected DoubleNode<T> previousElement;

    public DoubleNode(T v, DoubleNode<T> next,DoubleNode<T> previous){
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoubleNode(T v){   
        this(v,null,null);
    }

    
    /** 
     * @return DoubleNode<T>
     */
    public DoubleNode<T> next()
    // post: returns reference to next value in list
    {
       return nextElement;
    }

    
    /** 
     * @param next
     */
    public void setNext(DoubleNode<T> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   
   /** 
    * @return T
    */
   public T value()
   // post: returns value associated with this element
   {
      return data;
   }

   
   /** 
    * @param value
    */
   public void setValue(T value)
   // post: sets value associated with this element
   {
      data = value;
   }


/** 
 * @return DoubleNode<T>
 */
public DoubleNode<T> previous() {
	return null;
}
}
