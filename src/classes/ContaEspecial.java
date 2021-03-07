package classes;


public class ContaEspecial extends Conta {
	

	private double limite;
	
	public ContaEspecial(int numero, String cpf, boolean ativa, double limite) {
		super(numero, cpf, ativa);
		this.limite = limite;

	}

	public double getLimite() {
		return limite;
	}

	private void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public double getSaldo() {
		return super.getSaldo()+this.limite;
	}

}
