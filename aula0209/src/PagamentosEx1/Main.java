package PagamentosEx1;

public class Main {

	public static void main(String[] args) {
		
		Pagamento pagamento = new Cartao();
		
		CompraService compra = new CompraService(pagamento);
		
		compra.realizarCompra();

	}

}
