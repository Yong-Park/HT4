import org.junit.Test;
import static org.junit.Assert.*;

public class JavaTest {
    @Test
    public void arrayTest() {
        Calculadora calculadora = new Calculadora();
        Array<String> operandos = new Array<String>();
        Array<Float> datos = new Array<Float>();
        String res=calculadora.Calculo("129*+", operandos, datos);

        assertEquals(res,"19.0");
    }

    @Test
    public void singleTest() {
        Calculadora calculadora = new Calculadora();
        SinlgyLinkedList<String> operandos = new SinlgyLinkedList<String>();
        SinlgyLinkedList<Float> datos = new SinlgyLinkedList<Float>();
        String res=calculadora.Calculo("129*+", operandos, datos);

        assertEquals(res,"19.0");
    }

    @Test
    public void doubleTest() {
        Calculadora calculadora = new Calculadora();
        DoubleLinkedList<String> operandos = new DoubleLinkedList<String>();
        DoubleLinkedList<Float> datos = new DoubleLinkedList<Float>();
        String res=calculadora.Calculo("129*+", operandos, datos);

        assertEquals(res,"19.0");
    }

    @Test
    public void vectorTest() {
        Calculadora calculadora = new Calculadora();
        VectorDatos<String> operandos = new VectorDatos<String>();
        VectorDatos<Float> datos = new VectorDatos<Float>();
        String res=calculadora.Calculo("129*+", operandos, datos);

        assertEquals(res,"19.0");
    }


}
