package ejemploCuenta;

public class Corriente extends Cuenta{
	
	private long sobregiro;

	/**
	 * @param numeroCuenta
	 * @param titular
	 * @param sobregiro
	 */
	public Corriente(int numeroCuenta, String titular, long sobregiro) {
		super(numeroCuenta, titular);
		this.sobregiro = sobregiro;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		this.saldo+=valor;
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor>(this.saldo+sobregiro))
		{
			System.out.println("Llorelo, no tiene lucas");
			
		}
		else if (this.saldo<valor&&valor<=(this.saldo +sobregiro))
			{
				this.saldo=sobregiro-valor;
				sobregiro=sobregiro+this.saldo;
			}
			else 
			{
				this.saldo-=valor;			
			}	
		}

	@Override
	public String toString() {
		return "Corriente: Sobregiro= " + sobregiro + ", numero de cuenta= " + numeroCuenta + ", titular= " + titular
				+ ", saldo= " + saldo;
	}
	
	

}
