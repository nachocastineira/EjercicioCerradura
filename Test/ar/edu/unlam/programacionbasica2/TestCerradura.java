package ar.edu.unlam.programacionbasica2;

import org.junit.Assert;
import org.junit.Test;

public class TestCerradura {

	@Test
	public void queUnaCerraduraNuevaEstaCerrada()
	{
//1. Preparación
		Cerradura miCerradura = new Cerradura (1234, 3);

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
	@Test
	public void aLos2IntentosFallidosSeBloqueaLaCerradura()
	{
		// creo un intento de apertura de cerradura
		Cerradura miCerradura = new Cerradura (4567, 1);
	
		// fallo el intento la apertura de la cerradura 
		miCerradura.abrir(1234);

		Boolean bloqueada = true;
		bloqueada = miCerradura.fueBloqueada();
		
		Assert.assertTrue(bloqueada);			
	}

	
	@Test
	public void TestParaSaberSiLaCerraduraEstaAbierta()   //TEST ANDA BIEN
	{
		Cerradura miCerradura = new Cerradura (4321, 2);

		miCerradura.abrir(4321);
		
		Boolean estadoCerradura = miCerradura.estaAbierta();
		
		Assert.assertTrue(estadoCerradura);

	}
	
	@Test
	public void TestParaSaberSiLaCerraduraEstaCerrada()   //TEST ANDA BIEN
	{
		Cerradura miCerradura = new Cerradura (4321, 2);

		miCerradura.abrir(5321);
		
		Boolean estadoCerradura = miCerradura.estaCerrada();
		
		Assert.assertTrue(estadoCerradura);

	}
	
	@Test
	public void TestParaContarAperturasExitosas()  //TEST ANDA BIEN
	{
		// creo dos intentos de cerraduras 
		Cerradura miCerradura = new Cerradura (4567, 2);
		Cerradura miCerradura2 = new Cerradura (1234, 2);
		
		// abro dos veces la cerradura 
		miCerradura.abrir(4567);
		miCerradura2.abrir(1234);

		// Cuenta las 2 aperturas exitosas
		Integer aperturasExitosas;
		aperturasExitosas = miCerradura.contarAperturasExitosas()+miCerradura2.contarAperturasExitosas();
		
		// compruebo ambos valores
		Assert.assertEquals(2, aperturasExitosas, 0.0);			
	}
	
	
	@Test
	public void TestParaContarAperturasFallidas()  //TEST ANDA BIEN
	{
		// creo dos intentos de cerraduras 
		Cerradura miCerradura = new Cerradura (4567, 3);
		Cerradura miCerradura2 = new Cerradura (1234, 3);
		
		// fallo dos veces la apertura de la cerradura 
		miCerradura.abrir(1234);
		miCerradura2.abrir(6234);

		// Cuenta las 2 aperturas fallidas
		Integer aperturasFallidas;
		aperturasFallidas = miCerradura.contarAperturasFallidas()+miCerradura2.contarAperturasFallidas();
		
		// compruebo ambos valores
		Assert.assertEquals(2, aperturasFallidas, 0.0);
			
	}
	
	
	
	
	
	
	
	
	
	
	
}