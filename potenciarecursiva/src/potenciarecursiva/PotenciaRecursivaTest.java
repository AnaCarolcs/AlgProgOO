package potenciarecursiva;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PotenciaRecursivaTest {

	@Test
	void test() {
		PotenciaRecursiva potenciaRecursiva = new PotenciaRecursiva();
		assertEquals(4, potenciaRecursiva.pot(2, 2));
	}

}
