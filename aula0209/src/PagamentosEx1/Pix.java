package PagamentosEx1;

public class Pix implements Pagamento{

	@Override //'menção' de um metodo de outra classe
	public void pagar() {
		System.out.println("Pagamento realizado com pix."); 
	}
	
}
