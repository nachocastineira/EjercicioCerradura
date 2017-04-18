package ar.edu.unlam.programacionbasica2;

import org.junit.Assert;
import org.junit.Test;

public class TestCerradura {

	@Test
	public void queUnaCerraduraNuevaEstaCerrada()
	{
//1. Preparación
		Cerradura miCerradura = new Cerradura(1234, 3);

//2. Ejecución
		Boolean estadoCerradura = miCerradura.estaAbierta();

//3. Contrastación
		Assert.assertFalse("cerradura cerrada", estadoCerradura);
	}

	
	@Test
	public void queCuandoIngresoClaveCorrectaSeAbra(){   //TEST ANDA BIEN

			Cerradura miCerradura = new Cerradura (4321, 2);

				miCerradura.abrir(4321);

			Boolean estadoCerradura = miCerradura.estaAbierta();

			Assert.assertTrue("clave correcta", estadoCerradura);

}

	@Test
	public void queCuandoIngresoClaveIncorrectaNoSeAbra(){   //TEST ANDA BIEN

		Cerradura miCerradura = new Cerradura (4321 ,2);

		miCerradura.abrir(1234);

		Boolean estadoCerradura = miCerradura.estaAbierta();

		Assert.assertFalse("clave incorrecta", estadoCerradura);

}
//	@Test
//	public void aLos2IntentosFallidosSeBloqueaLaCerradura()
//	{
//		Cerradura miCerradura = new Cerradura (4321, 2);
//		Cerradura miCerradura = new contarAperturasFallidas(2);
//		
//		miCerradura.contarAperturasFallidas(2);
//		
//		Assert.assertFalse("La cerradura fue bloqueda",fueBloqueada);
//		
//	
//		
//		
//	}

}