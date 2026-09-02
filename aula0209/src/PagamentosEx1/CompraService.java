package PagamentosEx1;

public class CompraService{
	
	private Pagamento pagamento;

	public CompraService(Pagamento pagamento) {
		this.pagamento = pagamento;
	}	
	
	public void realizarCompra() {
		pagamento.pagar();
	}
	

	
}
