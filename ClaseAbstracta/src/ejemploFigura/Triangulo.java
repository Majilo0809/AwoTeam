package ejemploFigura;

public class Triangulo extends Figura {
	private double lado1;
	private double lado2;
	private double lado3;
	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1= lado1;
		this.lado2= lado2;
		this.lado3= lado3;
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area = (this.lado1 * this.lado2) / this.lado3 ;
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro = this.lado1 + this.lado2 + this.lado3;
	}
	
	
	
	
	
	
}
