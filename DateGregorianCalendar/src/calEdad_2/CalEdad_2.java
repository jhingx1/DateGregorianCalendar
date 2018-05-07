package calEdad_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Para extraer de una cadena una fecha

public class CalEdad_2 {
	public static void main(String[] args) throws IOException {
		String fecha;
		String dia,mes,anio;
		int posicion;
		
		//------
		
		int datoDia,datoMes,datoAnio;
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca una fecha dd/mm/aa");
		fecha = teclado.readLine();
		
		posicion = fecha.indexOf("/");
		dia = fecha.substring(0, posicion); //desde el inicio hasta el primer /		
		fecha = fecha.substring(posicion +1); //guarda una subcadenas hasta el final apartir del /
		
		posicion = fecha.indexOf("/");
		mes = fecha.substring(0, posicion); //desde el inicio hasta el primer /		
		fecha = fecha.substring(posicion +1); //guarda una subcadenas hasta el final apartir del /
		
		anio = fecha;
		
		System.out.println(dia);
		System.out.println(mes);
		System.out.println(anio);
		
		
		datoDia = Integer.parseInt(dia);
		datoMes = Integer.parseInt(mes);
		datoAnio = Integer.parseInt(anio);
		
		if(1>datoDia || datoDia > 31 || 1 > datoMes || datoMes > 12 || 1900 > datoAnio || datoAnio > 2018)
		{
			System.out.println("FECHA INCORRECTA");
		}else {
			System.out.println("FECHA CORRRECTA");
		}
		
	}
}
