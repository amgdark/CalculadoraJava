package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import app.Calculadora;

public class CalculadoraTest {
	Calculadora calc;
	@Before
	public void setUp(){
		calc = new Calculadora();
	}

    @Test
    public void pruebaDeSumar() {
    	assertEquals(calc.suma(5,5),10);
    	assertEquals(calc.suma(15,5),20);
    }

    @Test
    public void pruebaDeRestar() {
    	assertEquals(calc.resta(5,5),0);
    	assertEquals(calc.resta(15,5),10);
    }
}