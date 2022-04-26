package Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import Luchador.Luchador;

public class EscritorArchivo {
private String path;
	
	public EscritorArchivo(String path){
		this.path = path;
	}
	
	public void escribirArchivo(Luchador[] luchadores) {
		FileWriter file = null;
		PrintWriter printerWriter = null;
		try {
			file = new FileWriter(path);
			printerWriter = new PrintWriter(file);
	
			for (Luchador luchador : luchadores) {
				printerWriter.println(luchador.getDominados());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(file != null){
				try{
					file.close();
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
