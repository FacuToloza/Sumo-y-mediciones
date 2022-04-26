package Cuadrilatero;

import Archivos.EscritorArchivo;
import Archivos.LectorArchivo;
import Luchador.Luchador;

public class Cuadrilatero {
	public static void main(String[] args) {
		LectorArchivo archivoLectura = new LectorArchivo("src/Archivos/sumo.in");
		Luchador[] luchadores = archivoLectura.leerArchivo();
		
		for (int i = 0; i < luchadores.length - 1; i++) {
			for (int j = i + 1; j < luchadores.length; j++) {
				luchadores[i].calcularDominados(luchadores[j]);
			}
		}
		
		for (int i = 0; i < luchadores.length; i++) {
			System.out.println( luchadores[i].getDominados());
		}
		
		EscritorArchivo escritorArchivo = new EscritorArchivo("src/Archivos/sumo.out");
		escritorArchivo.escribirArchivo(luchadores);
	}
}
