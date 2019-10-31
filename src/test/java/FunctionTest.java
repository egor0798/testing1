import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import function.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 3/20/17.
 */
public class FunctionTest {
    private static final double DELTA = 0.01;

    @Test
    public void testFunctionMinusPiDiv2() {
        double x = -Math.PI / 2;
        assertEquals(Math.sin(x), Function.sin(x), DELTA);
    }
    @Test
    public void testFunctionMinusPiDiv2G() {
        double x = -Math.PI / 2 + 0.01;;
        assertEquals(Math.sin(x), Function.sin(x), DELTA);
    }


    @Test
    public void testFunctionPiDiv2L() {
        double x = Math.PI / 2 - 0.01;
        assertEquals(Math.sin(x), Function.sin(x), DELTA);
    }
    @Test
    public void testFunctionPiDiv2() {
        double x = Math.PI / 2;
        assertEquals(Math.sin(x), Function.sin(x), DELTA);
    }
    @Test
    public void testFunctionPiDiv2G() { // x = -1 + 0.01
        double x = Math.PI / 2 + 0.01;;
        assertEquals(Math.sin(x), Function.sin(x), DELTA);
    }

    @Test
    public void testFunction3PiDiv2L() {
        double x = 3 * Math.PI / 2 - 0.01;
        assertEquals(Math.sin(x), Function.sin(x), DELTA);
    }
    @Test
    public void testFunction3PiDiv2() {
        double x = 3 * Math.PI / 2;
        assertEquals(Math.sin(x), Function.sin(x), DELTA);
    }

    @Test
    public void testFunctionInf() {
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.sin(x), Function.sin(x), DELTA);
    }

    @Test
    public void testFunctionMinusInf() {
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.sin(x), Function.sin(x), DELTA);
    }


    @Test
    public void testFunctionNaN() {
        double x = Double.NaN;
        assertEquals(Math.sin(x), Function.sin(x), DELTA);
    }
}
