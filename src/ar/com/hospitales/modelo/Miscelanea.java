package ar.com.hospitales.modelo;

import java.util.Calendar;

public class Miscelanea {
	
	public String getNombreAlumno() {
		return "Nombre alumno:" + "      " + "Darío Schmetz";
	}
	
	public String getFecha() {

		Calendar fecha = Calendar.getInstance();
		String dia = Integer.toString(fecha.get(Calendar.DATE));
		
		/* Al mes se le suma 1 ya que en Java los meses empiezan desde 0.
		 * 0: Enero, 1: Febrero, 2: Marzo, etc... */
		String mes = Integer.toString(fecha.get(Calendar.MONTH) + 1); 
	
		String anio = Integer.toString(fecha.get(Calendar.YEAR));

		String retornoFecha = dia + " / " + mes + " / " + anio;

		return "Fecha actual:" + "      " + retornoFecha;
	}
	
}