package PagamentosEx1;

public class Boleto implements Pagamento{

	@Override
	public void pagar() {
		System.out.println("Pagamento realizadocom boleto.");
	}
	
}
