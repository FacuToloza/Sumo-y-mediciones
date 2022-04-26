
public abstract class UnidadDeLongitud {

	protected double valor;

	public UnidadDeLongitud(double valor) {
		super();
		this.valor = valor;
	}
	
	public abstract Metro toMetro();
	public abstract Kilometro toKilometro();
	public abstract Pie toPie();
	public abstract Milla toMilla();
	public abstract UnidadDeLongitud sumar(UnidadDeLongitud m2);
	
}
