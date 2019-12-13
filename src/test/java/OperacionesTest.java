import org.junit.Test;

import static org.junit.Assert.*;

public class OperacionesTest extends Operaciones {

    @Test
    public void suma() {
        System.out.println("Suma");
        int num1 = 5;
        int num2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 10;
        int result = instance.Suma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void resta() {
        System.out.println("Resta");
        int num1 = 6;
        int num2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 1;
        int result = instance.Resta(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void multiplicacion() {
        System.out.println("Multiplicacion");
        int num1 = 5;
        int num2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 25;
        int result = instance.Multiplicacion(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void división() {
        System.out.println("Division");
        int num1 = 20;
        int num2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 4;
        int result = instance.División(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}