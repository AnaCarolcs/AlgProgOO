import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoSimplesTest {

	@Test
	void testSoma() {
		CalculoSimples calculoSimples = new CalculoSimples();
		assertEquals(4, calculoSimples.soma(2,2));
	}
	
	@Test
	void testNumerosIguais() {
		CalculoSimples calculoSimples = new CalculoSimples();
		assertFalse(calculoSimples.numerosIguais(5,5));
	}
	
	

}
