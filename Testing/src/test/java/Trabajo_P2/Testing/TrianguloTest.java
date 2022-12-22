package Trabajo_P2.Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TrianguloTest {

	//Casos de prueba Each Use
	
	@Test(expected=numNegativoException.class)
	public void eu1() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, -30, 30, 30);
	}
	
	@Test(expected=numNegativoException.class)
	public void eu2() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 0, 30, 30);
	}
	
	@Test
	public void eu3() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 60, 60, 60);
		String actual = t1.getTipoSegunLado() + " " + t1.getTipoSegunAngulo();
		String expected = "Equilatero Acutangulo";
		assertEquals(expected, actual);
	}
	
	@Test
	public void eu4() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 90, 45, 45);
		String actual = t1.getTipoSegunLado() + " " + t1.getTipoSegunAngulo();
		String expected = "Equilatero Rectangulo";
		assertEquals(expected, actual);
	}
	
	@Test
	public void eu5() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 110, 35, 35);
		String actual = t1.getTipoSegunLado() + " " + t1.getTipoSegunAngulo();
		String expected = "Equilatero Obtusangulo";
		assertEquals(expected, actual);
	}
	
	@Test
	public void eu6() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 178, 2, 2);
		String actual = t1.getTipoSegunLado() + " " + t1.getTipoSegunAngulo();
		String expected = "Equilatero Obtusangulo";
		assertEquals(expected, actual);
	}
	
	@Test(expected=anguloException.class)
	public void eu7() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 190, 30, 30);
	}
	
	//Casos de prueba PairWise
	
	@Test(expected=numNegativoException.class)
	public void pw1() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(-10, -10, -10, -30, 30, 30);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw2() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(-10, -10, -10, 0, 30, 30);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw3() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(-10, -10, -10, 60, 60, 60);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw4() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(-10, -10, -10, 90, 45, 45);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw5() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(-10, -10, -10, 110, 35, 35);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw6() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(-10, -10, -10, 178, 2, 2);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw7() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(-10, -10, -10, 190, 30, 30);
	}
	
	
	@Test(expected=numNegativoException.class)
	public void pw8() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(0, 0, 0, -30, 30, 30);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw9() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(0, 0, 0, 0, 30, 30);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw10() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(0, 0, 0, 60, 60, 60);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw11() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(0, 0, 0, 90, 45, 45);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw12() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(0, 0, 0, 110, 35, 35);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw13() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(0, 0, 0, 178, 2, 2);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw14() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(0, 0, 0, 190, 30, 30);
	}
	
	
	@Test(expected=numNegativoException.class)
	public void pw15() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, -30, 30, 30);
	}
	
	@Test(expected=numNegativoException.class)
	public void pw16() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 0, 30, 30);
	}
	
	@Test
	public void pw17() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 60, 60, 60);
		String actual = t1.getTipoSegunLado() + " " + t1.getTipoSegunAngulo();
		String expected = "Equilatero Acutangulo";
		assertEquals(expected, actual);
	}
	
	public void pw18() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 90, 45, 45);
		String actual = t1.getTipoSegunLado() + " " + t1.getTipoSegunAngulo();
		String expected = "Equilatero Rectangulo";
		assertEquals(expected, actual);
	}
	
	@Test
	public void pw19() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 110, 35, 35);
		String actual = t1.getTipoSegunLado() + " " + t1.getTipoSegunAngulo();
		String expected = "Equilatero Obtusangulo";
		assertEquals(expected, actual);
	}
	
	@Test
	public void pw20() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 178, 2, 2);
		String actual = t1.getTipoSegunLado() + " " + t1.getTipoSegunAngulo();
		String expected = "Equilatero Obtusangulo";
		assertEquals(expected, actual);
	}
	
	@Test(expected=anguloException.class)
	public void pw21() throws anguloException, numNegativoException {
		Triangulo t1 = new Triangulo(10, 10, 10, 190, 30, 30);
	}
	
	//Casos de prueba Cobertura Decisiones
	
	@Test
	public void decisiones1() throws anguloException, numNegativoException {
		
		//False
		Triangulo t1 = new Triangulo(10, 5, 15, 90, 45, 45);
		String actual = t1.getTipoSegunLado();
		String expected = "Equilatero";
		assertNotEquals(expected, actual);
		
		//True
		Triangulo t2 = new Triangulo(10, 10, 10, 90, 45, 45);
		String actual2 = t2.getTipoSegunLado();
		String expected2 = "Equilatero";
		assertEquals(expected2, actual2);
	}
	
	@Test
	public void decisiones2() throws anguloException, numNegativoException {
		
		//False
		Triangulo t1 = new Triangulo(10, 5, 15, 90, 45, 45);
		String actual = t1.getTipoSegunLado();
		String expected = "Isosceles";
		assertNotEquals(expected, actual);
		
		//True
		Triangulo t2 = new Triangulo(10, 10, 20, 90, 45, 45);
		String actual2 = t2.getTipoSegunLado();
		String expected2 = "Isosceles";
		assertEquals(expected2, actual2);
	}
	
	@Test
	public void decisiones3() throws anguloException, numNegativoException {
		
		//False
		Triangulo t1 = new Triangulo(10, 10, 20, 90, 45, 45);
		String actual = t1.getTipoSegunLado();
		String expected = "Escaleno";
		assertNotEquals(expected, actual);
		
		//True
		Triangulo t2 = new Triangulo(10, 15, 20, 90, 45, 45);
		String actual2 = t2.getTipoSegunLado();
		String expected2 = "Escaleno";
		assertEquals(expected2, actual2);
	}
	
	@Test
	public void decisiones4() throws anguloException, numNegativoException {
		
		//False
		Triangulo t1 = new Triangulo(10, 5, 15, 60, 60, 60);
		String actual = t1.getTipoSegunAngulo();
		String expected = "Rectangulo";
		assertNotEquals(expected, actual);
		
		//True
		Triangulo t2 = new Triangulo(10, 10, 10, 90, 45, 45);
		String actual2 = t2.getTipoSegunAngulo();
		String expected2 = "Rectangulo";
		assertEquals(expected2, actual2);
	}
	
	@Test
	public void decisiones5() throws anguloException, numNegativoException {
		
		//False
		Triangulo t1 = new Triangulo(10, 5, 15, 90, 45, 45);
		String actual = t1.getTipoSegunAngulo();
		String expected = "Acutangulo";
		assertNotEquals(expected, actual);
		
		//True
		Triangulo t2 = new Triangulo(10, 10, 10, 60, 60, 60);
		String actual2 = t2.getTipoSegunAngulo();
		String expected2 = "Acutangulo";
		assertEquals(expected2, actual2);
	}
	
	@Test
	public void decisiones6() throws anguloException, numNegativoException {
		
		//False
		Triangulo t1 = new Triangulo(10, 10, 10, 60, 60, 60);
		String actual = t1.getTipoSegunAngulo();
		String expected = "Obstusangulo";
		assertNotEquals(expected, actual);
		
		//True
		Triangulo t2 = new Triangulo(10, 10, 10, 100, 40, 40);
		String actual2 = t2.getTipoSegunAngulo();
		String expected2 = "Obtusangulo";
		assertEquals(expected2, actual2);
	}
	
	//Casos de prueba Cobertura MC/DC
	
	@Test
	public void mc_dc1() throws anguloException, numNegativoException {
		
		//False y Condicion Dominante A
		Triangulo t1 = new Triangulo(10, 5, 5, 90, 45, 45);
		String actual = t1.getTipoSegunLado();
		String expected = "Equilatero";
		assertNotEquals(expected, actual);
		
		//False y Condicion Dominante B
		Triangulo t2 = new Triangulo(10, 10, 20, 90, 45, 45);
		String actual2 = t2.getTipoSegunLado();
		String expected2 = "Equilatero";
		assertNotEquals(expected2, actual2);
		
		//True y Condicion Dominante A,B
		Triangulo t3 = new Triangulo(10, 10, 10, 90, 45, 45);
		String actual3 = t3.getTipoSegunLado();
		String expected3 = "Equilatero";
		assertEquals(expected3, actual3);
	}
	
	@Test
	public void mc_dc2() throws anguloException, numNegativoException {
		
		//True y Condicion Dominante A
		Triangulo t1 = new Triangulo(10, 10, 15, 90, 45, 45);
		String actual = t1.getTipoSegunLado();
		String expected = "Isosceles";
		assertEquals(expected, actual);
		
		//True y Condicion Dominante B
		Triangulo t2 = new Triangulo(10, 15, 10, 90, 45, 45);
		String actual2 = t2.getTipoSegunLado();
		String expected2 = "Isosceles";
		assertEquals(expected2, actual2);
		
		//True y Condicion Dominante C
		Triangulo t3 = new Triangulo(15, 10, 10, 90, 45, 45);
		String actual3 = t3.getTipoSegunLado();
		String expected3 = "Isosceles";
		assertEquals(expected3, actual3);
		
		//False y Condicion Dominante A,B,C
		Triangulo t4 = new Triangulo(5, 10, 15, 90, 45, 45);
		String actual4 = t4.getTipoSegunLado();
		String expected4 = "Isosceles";
		assertNotEquals(expected4, actual4);
	}
	
	@Test
	public void mc_dc3() throws anguloException, numNegativoException {
		
		//False y Condicion Dominante A
		Triangulo t1 = new Triangulo(10, 10, 15, 90, 45, 45);
		String actual = t1.getTipoSegunLado();
		String expected = "Escaleno";
		assertNotEquals(expected, actual);
		
		//False y Condicion Dominante B
		Triangulo t2 = new Triangulo(10, 15, 10, 90, 45, 45);
		String actual2 = t2.getTipoSegunLado();
		String expected2 = "Escaleno";
		assertNotEquals(expected2, actual2);
		
		//False y Condicion Dominante C
		Triangulo t3 = new Triangulo(15, 10, 10, 90, 45, 45);
		String actual3 = t3.getTipoSegunLado();
		String expected3 = "Escaleno";
		assertNotEquals(expected3, actual3);
		
		//True y Condicion Dominante A,B,C
		Triangulo t4 = new Triangulo(5, 10, 15, 90, 45, 45);
		String actual4 = t4.getTipoSegunLado();
		String expected4 = "Escaleno";
		assertEquals(expected4, actual4);
	}
	
	@Test
	public void mc_dc4() throws anguloException, numNegativoException {
		
		//True y Condicion Dominante A
		Triangulo t1 = new Triangulo(10, 5, 5, 90, 45, 45);
		String actual = t1.getTipoSegunAngulo();
		String expected = "Rectangulo";
		assertEquals(expected, actual);
		
		//True y Condicion Dominante B
		Triangulo t2 = new Triangulo(10, 10, 20, 45, 90, 45);
		String actual2 = t2.getTipoSegunAngulo();
		String expected2 = "Rectangulo";
		assertEquals(expected2, actual2);
		
		//True y Condicion Dominante C
		Triangulo t3 = new Triangulo(10, 10, 20, 45, 45, 90);
		String actual3 = t3.getTipoSegunAngulo();
		String expected3 = "Rectangulo";
		assertEquals(expected3, actual3);
		
		//False y Condicion Dominante A,B,C
		Triangulo t4 = new Triangulo(10, 10, 20, 60, 60, 60);
		String actual4 = t4.getTipoSegunAngulo();
		String expected4 = "Rectangulo";
		assertNotEquals(expected4, actual4);
	}
	
	@Test
	public void mc_dc5() throws anguloException, numNegativoException {
		
		//False y Condicion Dominante A
		Triangulo t1 = new Triangulo(10, 5, 5, 100, 40, 40);
		String actual = t1.getTipoSegunAngulo();
		String expected = "Acutangulo";
		assertNotEquals(expected, actual);
		
		//False y Condicion Dominante B
		Triangulo t2 = new Triangulo(10, 10, 20, 40, 100, 40);
		String actual2 = t2.getTipoSegunAngulo();
		String expected2 = "Acutangulo";
		assertNotEquals(expected2, actual2);
		
		//False y Condicion Dominante C
		Triangulo t3 = new Triangulo(10, 10, 20, 40, 40, 100);
		String actual3 = t3.getTipoSegunAngulo();
		String expected3 = "Acutangulo";
		assertNotEquals(expected3, actual3);
		
		//True y Condicion Dominante A,B,C
		Triangulo t4 = new Triangulo(10, 10, 10, 60, 60, 60);
		String actual4 = t4.getTipoSegunAngulo();
		String expected4 = "Acutangulo";
		assertEquals(expected4, actual4);
	}
	
	@Test
	public void mc_dc6() throws anguloException, numNegativoException {
		
		//True y Condicion Dominante A
		Triangulo t1 = new Triangulo(10, 5, 5, 100, 40, 40);
		String actual = t1.getTipoSegunAngulo();
		String expected = "Obtusangulo";
		assertEquals(expected, actual);
		
		//True y Condicion Dominante B
		Triangulo t2 = new Triangulo(10, 10, 20, 40, 100, 40);
		String actual2 = t2.getTipoSegunAngulo();
		String expected2 = "Obtusangulo";
		assertEquals(expected2, actual2);
		
		//True y Condicion Dominante C
		Triangulo t3 = new Triangulo(10, 10, 20, 40, 40, 100);
		String actual3 = t3.getTipoSegunAngulo();
		String expected3 = "Obtusangulo";
		assertEquals(expected3, actual3);
		
		//False y Condicion Dominante A,B,C
		Triangulo t4 = new Triangulo(10, 10, 20, 60, 60, 60);
		String actual4 = t4.getTipoSegunAngulo();
		String expected4 = "Obtusangulo";
		assertNotEquals(expected4, actual4);
	}
	
}
