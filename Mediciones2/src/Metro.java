
public class Metro extends UnidadDeLongitud {
	

	public Metro(double valor) {
		super(valor);
	}
	
	public Metro toMetro(){
		return this;
	}
	
	public Kilometro toKilometro(){
		return new Kilometro(this.valor/1000);
	}
	
	public Milla toMilla(){
		return new Milla(this.valor/1609);
	}
	
	public Pie toPie(){
		return new Pie(this.valor*3.281);
	}
	
	@Override
	public Metro sumar(UnidadDeLongitud  m2) {
		return new Metro(this.valor + m2.toMetro().valor);
	}
	
	@Override
	public String toString() {
		return valor + "m";
	}
	
	
	
	

}
