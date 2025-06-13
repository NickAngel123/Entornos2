class TestCuentaBancaria
{
	public static void main(String args[i] )
	{
		CuentaBancaria cuenta = new CuentaBancaria("1234521","Director Banco",100,0);
		CuentaBancaria cuentaNueva= new CuentaBancaria("0123456789","Nicolas Obama Obiang",1000,5);
		System.out.println("Saldo = " + cuenta.getSaldo());
		cuenta.reintegro(50);
		cuenta.ingreso(100);
		System.out.println("Saldo: " + cuenta.getSaldo());
	}
}
