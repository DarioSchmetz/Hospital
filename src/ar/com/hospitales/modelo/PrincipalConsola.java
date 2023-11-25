package ar.com.hospitales.modelo;

public class PrincipalConsola {

	public static void main(String[] args) {
		
	
		
		// ATENCION PRIMARIA:
		
		String nombreAP = "CEMAFE";
		String domicilioAP = "Mendoza 2419, Santa Fe";
		String directorAP = "Dr. Juan Perez";
		int capacidadAP = 900;
		boolean tieneLaboratorio = true;
		boolean tieneRadiologia = false;
		boolean tieneVacunatorio = true;
		
		
		// ALTA COMPLEJIDAD:
		
		String nombreAC = "Dr. Jose Maria Cullen";
		String domicilioAC = "Av. Gdor. Freyre 2150, Santa Fe";
		String directorAC = "Dra. Maria Arias";
		int capacidadAC = 2700;
		String especialidad = "Traumatologia";
		int cantCamas = 150;
		AtencionPrimaria ap = new AtencionPrimaria("Cemafe", "Mendoza 2419 Santa Fe","Dra. Maria Arias", 900,true, false, true);
		
		
		
		// MINISTERIO DE SALUD:
		
		MinisterioSalud ministerio = new MinisterioSalud();
		
		ministerio.setMinistro("Dra. Andrea Uboldi");
		ministerio.setDomicilio("Juan de Garay 2880");
		ministerio.setProvincia("Santa Fe");
		////////////////////////////////////////////////////////////////
		
		///Atencion Primaria
		///////////////////////////////////////////
//		AtencionPrimaria ap = new  AtencionPrimaria ();
//		ap.setNombre("CEMAFE");
//		ap.setDomicilio("Mendoza 2419, Santa Fe");
//		ap.setDirector ("Dr. Juan Perez");
//		ap.setCapacidad(900);
//		ap.setTieneLaboratorio(true);
//		ap.setTieneVacunatorio(true);
//		ap.setTieneRadiologia(false);
//		System.out.println("El hospital de Atencion Primaria");
//		System.out.println( "Nombre Hospital"   + ap.getNombre());
//		System.out.println("Domicilio Del Hospital" +ap.getDomicilio());
//         System.out.println("Director Hospital" +ap.getDirector());
//         System.out.println("Capacidad del Hospital" +ap.getCapacidad());
//         System.out.println("Tiene un Labotatorio" +ap.getTieneLaboratorio());
//         System.out.println("No tiene Radiologia" +ap.getTieneRadiologia());
//         System.out.println("Tiene vacunatori0"  +ap.getTieneVacunatorio());
//         
//
//		System.out.println("nombre es"+ap.getNombre());

			
		
				
		ministerio.crearHospitalAltaComplejidad(nombreAC, domicilioAC, directorAC, capacidadAC,
				especialidad, cantCamas);
		
		
		ministerio.crearHospitalAtencionPrimaria(nombreAP, domicilioAP, directorAP,
				capacidadAP, tieneLaboratorio, tieneRadiologia, tieneVacunatorio);
		
		ministerio.mostrar();
		
	}
	
}