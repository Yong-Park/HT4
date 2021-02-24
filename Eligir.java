public class Eligir {
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
                return new Array<String>();
            }else{
                return new Array<Float>();
            }
        }else if(dato==5){

        }
        return null;
    }
}