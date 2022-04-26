
public class Milla extends UnidadDeLongitud {

	
	public Milla(double valor) {
		super(valor);
	}

	public Milla toMilla(){
		return this;
	}
	
	public Metro toMetro(){
		return new Metro(this.valor*1609);
	}
	
	public Kilometro toKilometro(){
		return new Kilometro(this.valor*1.609);
	}
	
	public Pie toPie(){
		return new Pie(this.valor*5280);
	}
	
	@Override
	public Milla sumar(UnidadDeLongitud  m2) {
		return new Milla(this.valor + m2.toMilla().valor);
	}
	

	@Override
	public String toString() {
		return valor + "milla";
	}
	
}
