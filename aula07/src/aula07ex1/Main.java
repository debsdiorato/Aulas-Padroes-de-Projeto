package aula07ex1;

public class Main {

	public static void main(String[] args) {
		
		ConexaoBanco c1 =  new ConexaoBanco();
		ConexaoBanco c2 =  new ConexaoBanco();
		ConexaoBanco c3 =  new ConexaoBanco();
		
		if (c1 == c2) {
			System.out.println("Objetos iguais");
		} else {
			System.out.println("Objetos diferentes");
			}
		
		ConexaoBancoSingleton c4 =
				ConexaoBancoSingleton.getInstance();
		ConexaoBancoSingleton c5 =
				ConexaoBancoSingleton.getInstance();
;
	}

}
