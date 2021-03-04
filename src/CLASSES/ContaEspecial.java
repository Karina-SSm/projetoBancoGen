package CLASSES;



public class ContaEspecial  extends Conta{
	private double limite;

	public ContaEspecial(int numero, String cpf, boolean ativa, double limite) {
		super(numero, cpf, ativa);
		this.limite = limite;
	
	}

	private double getLimite() {
		return limite;
	}

	private void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
