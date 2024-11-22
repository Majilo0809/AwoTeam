package correccionCuenta;

public abstract class CuentaC {

	protected int numeroCuenta;
	protected String titular;
	protected long saldo;
	
	public CuentaC (int numeroCuenta, String titular) {
		this.numeroCuenta=numeroCuenta;
		this.titular=titular;
	}
	
	public abstract void deposito (long valor);
	public abstract void retiro (long valor);
	

	@Override
	public String toString() {
		return "Cuenta: NumeroCuenta=" + this.numeroCuenta + ", titular=" + this.titular + ", saldo=" + this.saldo + ". ";
	}

	
	
}