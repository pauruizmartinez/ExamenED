package tests;

import static org.junit.Assert.*;  
import org.junit.BeforeClass; 
import org.junit.Test; 
import java.util.NoSuchElementException; 

public class TestPrograma { 

    private static int[] elements;  

    @BeforeClass 
    public static void BeforeClass(){ 
        elements = new int[] {1, 2, 3, 4, 5}; 
    } 

    @Test 
    public void testSumaTaula() {
        TaulaEnters taula = new TaulaEnters(elements); 
        assertEquals(15, taula.sumaTaula()); 
    } 

    @Test
    public void testMajorTaula() { 
        TaulaEnters taula = new TaulaEnters(elements); 
        assertEquals(5, taula.majorTaula());  
    }

    @Test(expected = NoSuchElementException.class)
    public void testPosicioTaulaNotFound() {
        TaulaEnters taula = new TaulaEnters(elements);
       
        taula.posicioTaula(10); 
    }

    @Test
    public void testPosicioTaulaFound() {
        TaulaEnters taula = new TaulaEnters(elements);
        assertEquals(2, taula.posicioTaula(3)); 
    }
}