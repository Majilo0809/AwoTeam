package ejemploCuenta;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ahorro ahorro= new Ahorro (8723, "Marlon");
		
		ahorro.deposito(5000);
		ahorro.retiro(2000);
		System.out.println(ahorro); 
		
		Corriente corriente =new Corriente (9868, "Marlon", 5000 );
		
		corriente.deposito(1000);
		corriente.retiro(6000);
		System.out.println(corriente); 
	}

}

