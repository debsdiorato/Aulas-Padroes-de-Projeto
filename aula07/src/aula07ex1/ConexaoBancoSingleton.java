package aula07ex1;

public class ConexaoBancoSingleton {
	
	 private static ConexaoBancoSingleton instance;
	
	private ConexaoBancoSingleton() {}
	
	public static ConexaoBancoSingleton getInstance(){
		if(instance == null) {
			instance = new ConexaoBancoSingleton();
		}
		return instance;
	}
	
	
}
