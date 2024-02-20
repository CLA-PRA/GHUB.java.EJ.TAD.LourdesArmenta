package miPrincipal;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	//retorna la fecha expresada en días
	//considerando que todos los años tienen 360 días
	// y todos los meses 30,para hacerlo mas simple
	public int fechaToDias() {
		
		
		
	}
	//asignar la fecha expresada en dias a los atributos
	public Fecha diasToFecha(int i)
	{
		//coloque el código faltante
		
		
	}
	public Fecha addDias(int d) {
		//convertir la fecha a dias,utilizando fechaTodias y le sumamos y después convertimos de nuevo 
		//los dias a fecha utilizando diasToFeche
		
	}
	
	//constructos
	
	public Fecha() {
		
	}
	
	public Fecha(String s) {
		//buscamos la primera ocurrencia de '/'
		int pos1 = s.indexOf('/');
		//buscamos la última ocurrencia de '/'
		int pos2 = s.lastIndexOf('/');
		//procesa el día
		String sDia = s.substring(0,pos1);
		dia = Integer.parseInt(sDia);
		//procesamos el mes
		String sMes = s.substring(pos1+1,pos2);
		mes = Integer.parseInt(sMes);
		//procesamos el año
		String sAnio = s.substring(pos2+1);
		anio = Integer.parseInt(sAnio);
		
		
	}
	public Fecha(int d,int m,int a) {
		dia = d;
		mes = m;
		anio = a;
	}
	/*
	 * 15/06/1973
	 * 
	 */
	//sobre escribimos el método to toString (lo heradamos de Object)
	public String toString() {
		return dia+"/"+mes+"/"+anio;	
	}
	//sobre escribrir el método equals que herados de Object
	public boolean equals(Object o) {
		//coloque el código faltante
		
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	

} 
