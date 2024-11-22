package ejemploFigura;

public abstract class Figura {
	protected double area;
	protected double perimetro;
	
	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}
	/**
	 * @return the perimetro
	 */
	public double getPerimetro() {
		return perimetro;
	}
	
	public abstract void calcularArea (); //Para cada subclase son diferentes por eso no tiene parametro
	public abstract void calcularPerimetro ();
	
	
}
