/*
Codigo reutilizado del documento que se compartio en el modulo de listas encadenadas
*/
public class Node <T>{
    protected T data; // value stored in this element
    protected Node<T> nextElement; // ref to next

   public Node(T v, Node<T> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   public Node(T v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   
   /** 
    * @return Node<T>
    */
   public Node<T> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

   
   /** 
    * @param next
    */
   public void setNext(Node<T> next)
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
}
