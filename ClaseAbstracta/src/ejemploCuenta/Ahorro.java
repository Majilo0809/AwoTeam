package ejemploCuenta;

public class Ahorro extends Cuenta{
	
	private long interes=0;

	/**
	 * @param numeroCuenta
	 * @param titular
	 */
	public Ahorro(int numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}

	@Override
	public void deposito(long valor) {
		interes+=valor*0.03;
		this.saldo=valor-interes;
		System.out.println("Saldo despues de depositar: " +this.saldo );
		
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor>this.saldo) {
			System.out.println("Saldo insuficiente.");
		}
		else {
			this.saldo-=valor;
			System.out.println("Le queda saldo de: " +this.saldo);
		}
	}

	@Override
	public String toString() {
		return "Ahorro: Intereses=" + interes + ", numero de cuenta= " + numeroCuenta + ", titular= " + titular + ", saldo= "
				+ saldo;
	}


	
	
	

}
