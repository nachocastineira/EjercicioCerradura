package ar.edu.unlam.programacionbasica2;

public class Cerradura 

{

	private Integer claveDeApertura;
	private Integer clave;
	private Boolean estadoCerradura;
	private Integer aperturasExitosas;
	private Integer aperturasFallidas;
	private Integer cantidadDeFallosConsecutivosQueLaBloquean;
	
	
	public Cerradura (Integer claveDeApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean)
	{
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
				
	}

	public Boolean abrir(Integer clave)  // metodo para abrir la cerradura 
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
	
	public void cerrar() // cerrar cerradura
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
	


	public Integer contarAperturasExitosas()
	{
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
	
	public Boolean fueBloqueada()
	{
		if(this.cantidadDeFallosConsecutivosQueLaBloquean.equals(aperturasFallidas))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
