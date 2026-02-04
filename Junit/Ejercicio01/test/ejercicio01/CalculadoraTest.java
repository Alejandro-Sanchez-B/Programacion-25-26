/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicio01;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSomeMethod() {
    }
     @Test
    public void testSumar() {
        float resultado = Calculadora.sumar(5, 3);
        assertEquals(8, resultado, 0.001);
    }
    @Test
    public void testRestar(){
        float resultado = Calculadora.restar(6, 3);
        assertEquals(3, resultado, 0.001);
    
    }
    @Test
    public void testMultiplicar(){
        float resultado = Calculadora.multiplicar(8, 2);
        assertEquals(16, resultado, 0.001);
    
    }
    @Test
    public void testDividir(){
        float resultado = Calculadora.dividir(8, 2);
        assertEquals(4, resultado, 0.001);    
    }
       
    @Test
    public void testDivision0(){
        try{
            Calculadora.dividir(9, 0);
            fail("Se esperaba una excepcion");
        }catch(ArithmeticException e){
            //Es correcto
        
        }
    
    }
    
}
