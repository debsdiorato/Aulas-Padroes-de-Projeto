package PagamentosEx1;

public class Cartao implements Pagamento{

	@Override
	public void pagar() {
		System.out.println("Pagamento realizado com cartão.");
	}

}
