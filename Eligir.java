//Este es el factory;
public class Eligir {
    
    /** 
     * @param dato
     * @return MenuGeneral
     */
    public MenuGeneral opcionMenu(int dato){
        int counter=0;
        if(dato == 1){
            if(counter==0){
                return new Array<String>();
            }else{
                return new Array<Float>();            
            }
        }else if(dato==2){
            if(counter==0){
                return new VectorDatos<String>();
            }else{
                return new VectorDatos<Float>();
            }
        }else if(dato==4){
            if(counter==0){
                return new SinlgyLinkedList<String>();
            }else{
                return new SinlgyLinkedList<Float>();
            }
        }else if(dato==5){
            if(counter==0){
                return new DoubleLinkedList<String>();
            }else{
                return new DoubleLinkedList<Float>();
            }
        }
        return null;
    }
}