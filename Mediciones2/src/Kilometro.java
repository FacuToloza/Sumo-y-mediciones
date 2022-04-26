
public class Kilometro extends UnidadDeLongitud {
	
	public Kilometro(double valor) {
		super(valor);
	}
	
	public Kilometro toKilometro(){
		return this;
	}
	
	public Metro toMetro(){
		return new Metro(this.valor*1000);
	}
	
	public Milla toMilla(){
		return new Milla(this.valor/1.609);
	}
	
	public Pie toPie(){
		return new Pie(this.valor*3281);
	}
	
	@Override
	public Kilometro sumar(UnidadDeLongitud  m2) {
		return new Kilometro(this.valor + m2.toKilometro().valor);
	}
	
	
	@Override
	public String toString() {
		return valor + "km";
	}
	

}
