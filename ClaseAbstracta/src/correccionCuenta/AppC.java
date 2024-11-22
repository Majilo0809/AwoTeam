package correccionCuenta;

public class AppC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AhorroC ahorro= new AhorroC (8723, "Marlon");
		
		ahorro.deposito(10000);
		ahorro.retiro(5000);
		System.out.println(ahorro); 
		
		CorrienteC corriente =new CorrienteC (9868, "Marlon", 5_000);
		
		corriente.deposito(1000);
		corriente.retiro(2000);
		System.out.println(corriente); 
	}

}

