package Luchador;

public class Luchador {
	private int peso;
	private int altura;
	private int dominados;
	
	public Luchador(int peso, int altura){
		this.peso = peso;
		this.altura = altura;
		this.dominados = 0;
	}
	
	public void calcularDominados(Luchador otro){
		if(this.peso >= otro.peso && this.altura >= otro.altura){
			this.dominados++;
		} else if(this.peso <= otro.peso && this.altura <= otro.altura){
			otro.dominados++;
		}

	}
	
	public int getDominados(){
		return this.dominados;
	}
}
