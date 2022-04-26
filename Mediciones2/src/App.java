
public class App {
	
	public static void main(String[] args) {
		
		Metro m1 = new Metro(10);
		Kilometro k = new Kilometro(100);
		Milla m = new Milla(100);
		Pie p = new Pie(100);
		
//		UnidadDeLongitud[] medidas= {m1, k , m , p};
//		
//		for (UnidadDeLongitud medida : medidas) {
//			System.out.println(medida);
//		}
				
		
		System.out.println(k.sumar(k));
		System.out.println(m1.sumar(m1));
		System.out.println(m.sumar(m));
		System.out.println(p.sumar(p));
		
		
	}
}
