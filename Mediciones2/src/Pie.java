
public class Pie extends UnidadDeLongitud {

	
	public Pie(double valor) {
		super(valor);
	}
	
	public Pie toPie(){
		return this;
	}
	
	public Metro toMetro(){
		return new Metro(this.valor/3.281);
	}
	
	public Kilometro toKilometro(){
		return new Kilometro(this.valor/3281);
	}
	
	public Milla toMilla(){
		return new Milla(this.valor/5280);
	}
	
	@Override
	public Pie sumar(UnidadDeLongitud  m2) {
		return new Pie(this.valor + m2.toPie().valor);
	}
	
	@Override
	public String toString() {
		return valor + "pies";
	}
	
}
