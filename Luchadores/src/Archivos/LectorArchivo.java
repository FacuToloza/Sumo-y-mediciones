package Archivos;

import java.io.File;
import java.util.Scanner;
import Luchador.Luchador;

public class LectorArchivo {
	
	private String path;
	
	public LectorArchivo(String path){
		this.path = path;
	}
	
	public Luchador[] leerArchivo() {
		Scanner scanner = null;
		File file = null;
		Luchador[] luchadores = null;
		try {
			
			file = new File(this.path);
			scanner = new Scanner(file);

			int cantLuchadores = scanner.nextInt();
			luchadores = new Luchador[cantLuchadores];
			
			for (int i = 0; i < luchadores.length; i++) {
				luchadores[i] = new Luchador(scanner.nextInt(), scanner.nextInt());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		return luchadores;
	}
}
