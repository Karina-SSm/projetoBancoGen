package classes;

import java.util.Scanner;

import classes.Conta;

public class ContaEstudantil extends Conta {

	Scanner leia = new Scanner(System.in);
	
	double limiteEstudantil = 5000;
	int opcao = 0;
	int operacoes= 0;
	int contadorEmprestimos = 0;
	
	public ContaEstudantil(int numero, String cpf, boolean ativa) {
		super(numero, cpf, ativa);
		this.setLimiteEstudantil(5000);
	}
	
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	

	@Override
	public void debito(double valor) {
		if(this.getSaldo() >= valor) {
			this.saldo = this.getSaldo() - valor;
		}
		else if(valor > saldo) {
			System.out.println("\n\t   Você não possui saldo o suficiente. Deseja solicitar um");	
			System.out.println("          empréstimo estudantil no valor de R$5000? [1] Sim | [0] Não");
			opcao = leia.nextInt();
			
			if (opcao == 1 && contadorEmprestimos == 0) {
				this.credito(getLimiteEstudantil());
				contadorEmprestimos ++;
			}
			else {
				System.out.println("\n\t\tVocê já solicitou o seu empréstimo estudantil.\n\t\t\t Disponível apenas um por conta.");
			}
		}
	}
}