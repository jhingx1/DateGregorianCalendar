package calEdad_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Para calcular la edad exacta de una persona.

public class CalEdad_1 {

	public static void main(String[] args) throws ParseException{

		Date d = new Date(2011,4,5);  //0,1,
		CalEdad_1 v1 = new CalEdad_1();
		System.out.println("dasds" + d);
				
		System.out.println(v1.calculaEdad(v1.dateToCalendar(d)));
		

	}

	public int calculaEdad(Calendar fechaNac) {

		Calendar today = Calendar.getInstance();

		int diff_year = today.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
		int diff_month = today.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
		int diff_day = today.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
		
		
		if(diff_month < 0) {
			diff_year = diff_year - 1;
		}else if (diff_month == 0) {
			if(diff_day > 0) {
				diff_year = diff_year - 1;
			}
		}
		
		
		return diff_year + 1900;
	}

	// Para convertir de Date a Calendar
	public Calendar dateToCalendar(Date fechaNac) {

		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.setTime(fechaNac);
		return fechaNacimiento;

	}

}
