package cal_Edad_3;

import java.util.Calendar;
import java.util.GregorianCalendar;

//Manejor de el tipo de dato calendar.

public class CalEdad_3 {
	
	public static void main(String[] args) {
		Calendar calendario = new GregorianCalendar(2015,Calendar.DECEMBER,25);
		int anio = calendario.get(Calendar.YEAR);
		int mes = calendario.get(Calendar.MONTH);
		System.out.println(anio);
		
		/*
		 
		Calendar calendario = Calendar.getInstance(); //fecha actual
		int anio = calendario.get(Calendar.YEAR);
		
		System.out.println(anio);
		  
		*/
		
	}
}
