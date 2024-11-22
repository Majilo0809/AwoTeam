package correccionCuenta;

public class AhorroC extends CuentaC{
	
	private long interes=0;

	/**
	 * @param numeroCuenta
	 * @param titular
	 */
	public AhorroC(int numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}

	@Override
	public void deposito(long valor) {
		this.saldo=valor;	
		this.interes+= this.saldo *3/100;
			
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor > this.saldo) {
			System.out.println("Saldo insuficiente.");
		}
		else {
			this.saldo-=valor;
			System.out.println("Le queda saldo de: " + this.saldo);
		}
	}

	@Override
	public String toString() {
		return "Ahorro: Intereses=" + interes + ", numero de cuenta= " + numeroCuenta + ", titular= " + titular + ", saldo= "
				+ saldo;
	}


	
	
	

}
