package ejemploFigura;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo figura1 = new Circulo(2.56);
	
		figura1.calcularArea();
		figura1.calcularPerimetro();
		System.out.println("Area del Circulo: "+ figura1.getArea());
		System.out.println("Perimetro del Circulo: "+ figura1.getPerimetro());
		
		
		Triangulo figura2 = new Triangulo(2.5,2.5,4.5);
		
		figura2.calcularArea();
		figura2.calcularPerimetro();
		System.out.println("Area del Triangulo: "+ figura2.getArea());
		System.out.println("Perimetro del triangulo: "+ figura2.getPerimetro());
				 
		
		Rectangulo figura3 = new Rectangulo(10.8,15);
		
		figura3.calcularArea();
		figura3.calcularPerimetro();
		System.out.println("Area del Rectangulo: "+ figura3.getArea());
		System.out.println("Perimetro del Rectangulo: "+ figura3.getPerimetro());
		
		
		
		
	}

}
