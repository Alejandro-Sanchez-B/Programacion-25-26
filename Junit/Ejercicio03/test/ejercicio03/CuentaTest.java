package ejercicio03;

import java.io.ByteArrayInputStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaTest {

    @Test
    public void testConstructorVacio() {
        Cuenta cuenta = new Cuenta();
        assertEquals("", cuenta.getTitular());
        assertEquals(0.0, cuenta.getDinero(), 0.001);
    }

    @Test
    public void testConstructorConParametros() {
        Cuenta cuenta = new Cuenta("Alex", 100.0);
        assertEquals("Alex", cuenta.getTitular());
        assertEquals(100.0, cuenta.getDinero(), 0.001);
    }

    @Test
    public void testIngresarDineroPositivo() {
        // Simulamos que el usuario escribe: 50
        String entrada = "50";
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));

        Cuenta cuenta = new Cuenta("Alex", 100.0);
        cuenta.ingresarDinero();

        assertEquals(150.0, cuenta.getDinero(), 0.001);
    }

    @Test
    public void testIngresarDineroNegativo() {
        // Simulamos que el usuario escribe: -20
        String entrada = "-20";
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));

        Cuenta cuenta = new Cuenta("Alex", 100.0);
        cuenta.ingresarDinero();

        // No debe cambiar el dinero
        assertEquals(100.0, cuenta.getDinero(), 0.001);
    }

    @Test
    public void testRetirarDineroCantidadMenor() {
        // Simulamos que el usuario escribe: 30
        String entrada = "30";
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));

        Cuenta cuenta = new Cuenta("Alex", 100.0);
        cuenta.retirarDinero();

        assertEquals(70.0, cuenta.getDinero(), 0.001);
    }

    @Test
    public void testRetirarDineroCantidadMayor() {
        // Simulamos que el usuario escribe: 200
        String entrada = "200";
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));

        Cuenta cuenta = new Cuenta("Alex", 100.0);
        cuenta.retirarDinero();

        // El dinero debe quedar a 0
        assertEquals(0.0, cuenta.getDinero(), 0.001);
    }
}
