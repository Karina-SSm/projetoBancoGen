package classes;

public class Conta {

	private int numero;
	private String cpf;
	protected double saldo;
	private boolean ativa;
	
	public Conta (int numero, String cpf, boolean ativa) {
		this.numero = numero;   //construtor
		this.cpf = cpf;
		this.ativa = ativa;
	}

	public int getNumero() {  //getters and setter = encapsulamento
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void credito(double valor) {   //métodos
		this.saldo = this.saldo + valor;
	}
	
	public void debito(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
		} else {
			
		}
	}
}
