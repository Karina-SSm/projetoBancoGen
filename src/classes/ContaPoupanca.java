package classes;

public class ContaPoupanca extends Conta {
	//atributo
	private int diaAniversarioConta;

	//constructor
	public ContaPoupanca(int numero, String cpf, boolean ativa, int diaAniversarioConta) {
		super(numero, cpf, ativa);
		this.diaAniversarioConta = diaAniversarioConta;
	}

	//encapsulamento - getters and setters
	public int getDiaAniversarioConta() {
		return diaAniversarioConta;
	}

	public void setDiaAniversarioConta(int diaAniversarioConta) {
		this.diaAniversarioConta = diaAniversarioConta;
	}
	

	//metodo
	public void correcao(int diaDigitado) {
		if(diaAniversarioConta == diaDigitado) {
			this.saldo = this.saldo + (this.saldo * 0.05);
		}
	}
}
