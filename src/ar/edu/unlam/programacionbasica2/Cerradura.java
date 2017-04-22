package ar.edu.unlam.programacionbasica2;

public class Cerradura 

{

	private Integer claveDeApertura;
//	private Integer clave;
	private Boolean estadoCerradura = false;  // la cerradura nueva estará cerrada por defecto
	private Integer aperturasExitosas;
	private Integer aperturasFallidas;
	private Integer cantidadDeFallosConsecutivosQueLaBloquean;
	
	
	public Cerradura (Integer claveDeApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean)
	{

		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;				
	}

	
	public Boolean abrir(Integer clave)  // se abre la cerradura cuando coincidan las claves, de ser asi, su estado cambiará a true;
	{
			
		if (this.claveDeApertura.equals(clave))
		{
			estadoCerradura = true;
			return true;
		}
		else
		{
			estadoCerradura = false;
			return false;
		}	
	}
	
	public void cerrar() // se cierra la cerradura cuando su estadoCerradura sea false
	{
		estadoCerradura = false;
	}
	
	public Boolean estaAbierta ()  //La cerradura esta abierta
	{
		if (this.estadoCerradura.equals(true))
		{
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Boolean estaCerrada () // La cerradura esta cerrada
	{
		if (this.estadoCerradura.equals(false))
		{
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Boolean fueBloqueada()
	{
		if(this.cantidadDeFallosConsecutivosQueLaBloquean.equals(this.contarAperturasFallidas()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

	public Integer contarAperturasExitosas()
	{
	
		aperturasExitosas = 0;
		
		if (this.estadoCerradura.equals(true))
		{
			aperturasExitosas++;
			return aperturasExitosas;
		}
		else
		{
			aperturasExitosas=0;
			return aperturasExitosas;
		}		
	}

	public Integer contarAperturasFallidas()
	{
		aperturasFallidas = 0;
		
		if (this.estadoCerradura.equals(false))
		{
			aperturasFallidas++;
			return aperturasFallidas;
		}
		else
		{
			aperturasFallidas=0;
			return aperturasFallidas;
		}	
	}
	
}
