package aplicacao;

import java.util.Scanner;
import classes.Conta;
import classes.ContaCorrente;
import classes.ContaEspecial;
import classes.ContaEstudantil;

public class Banco {

	public static void main(String[] args) {
		int numero = 0;
		String cpf = null;
		int tipoConta = 0;
		boolean ativa = false;
		Scanner ler = new Scanner(System.in);
		ContaEspecial contaMagica = null;
		ContaEstudantil contaEstudante = null;
		ContaCorrente contaCorrente = null;
		int contadorTalao = 0;
		String continuar = null;
		int opera�oes = 0;
		String[] movimentos = new String[10];
		String movimento = null;
		double valor = 0.00;
		// chamar a minha conta
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t\t\t\t KIGBJ-G1 BANK ");
		System.out.println();
		System.out.println("\t*~*~*~*~*~*~ [D� um Xeque-Mate na sua dor de cabe�a] ~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t\t\t [1] Conta Poupan�a");
		System.out.println("\t\t\t [2] Conta Corrente");
		System.out.println("\t\t\t [3] Conta Especial");
		System.out.println("\t\t\t [4] Conta Empresarial");
		System.out.println("\t\t\t [5] Conta Estudantil");
		System.out.println("\t\t\t [6] Sair");
		System.out.println();
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");

		tipoConta = ler.nextInt();
		if (tipoConta == 1) {
		} 
		// Karina //
		else if (tipoConta == 2) {
			System.out.println("\t\t Tipo de conta selecionada: Corrente");
			System.out.println();
			System.out.print("\t\t Digite o n�mero da sua conta: ");
			numero = ler.nextInt();
			System.out.print("\t\t Digite o n�mero do seu CPF: ");
			cpf = ler.next();
			double talaoCheque = 0;
			contaCorrente = new ContaCorrente(numero, cpf, false, talaoCheque);
		}
		// Giulliana Munhoz //
		else if (tipoConta == 3) {
			System.out.println("\t\t Tipo de conta selecionada: Especial");
			System.out.println("\t\t Digite o n�mero da sua conta:");
			numero = ler.nextInt();
			System.out.println("\t\t Digite o n�mero do seu CPf:");
			cpf = ler.next();
			contaMagica = new ContaEspecial(numero, cpf, true, 1000.00); 
		} 
		else if (tipoConta == 4) {
		}
		// Igor Pereira //
		else if (tipoConta == 5) {
			System.out.println("\t\t Tipo de conta selecionada: Estudante");
			System.out.println();
			System.out.print("\t\t Digite o n�mero da sua conta: ");
			numero = ler.nextInt();
			System.out.print("\t\t Digite o n�mero do seu CPF: ");
			cpf = ler.next();
			contaEstudante = new ContaEstudantil(numero, cpf, true);
		
		} else if (tipoConta == 6) {
			System.out.println("\t\t Opera��o encerrada.");
			return;
		}
		do {
			System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
			System.out.println();
			System.out.println("\t\t\t\tKIGBJ-G1 BANK ");
			System.out.println();
			System.out.println("\t*~*~*~*~*~*~ [D� um Xeque-Mate na sua dor de cabe�a] ~*~*~*~*~*~*");
			System.out.println();
			System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
			System.out.println();
			
			if (tipoConta == 2) {
				System.out.println("\t\t\t\tConta Corrente");
				System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
				System.out.println("\t\t\tSaldo " + contaCorrente.getSaldo());
				System.out.println("\t\t\tTal�es de cheque " + contadorTalao);
				System.out.print("\t\t\tMOVIMENTO [D] D�bito ou [C] Cr�dito: ");
				movimento = ler.next();
				System.out.print("\t\t\tValor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					contaCorrente.credito(valor);
					movimentos[opera�oes] = "\t\t\tCr�dito " + valor;
				} else {
					contaCorrente.debito(valor);
					movimentos[opera�oes] = "\t\t\tD�bito " + valor;
				}
				opera�oes = opera�oes + 1;
					char opcao;
					do {
						System.out.print("\t\tDeseja solicitar um tal�o de cheques? [S] Sim | [N] N�o");
						opcao = ler.next().toUpperCase().charAt(0);
						System.out.println();
	                    
						if(opcao == 'S' && contadorTalao < 3) {
	                    	contaCorrente.getContadorTalao();
	                    	System.out.println("\t\t\tTal�o solicitado");
	                    	contadorTalao ++;
	                    	if (contadorTalao > 3) {
	                    		System.out.println("\t\tVoc� j� solicitou seus 3 tal�es dispon�veis no m�s.");
	                    	}
	                    } 
						System.out.print("\n\t\t\tContinuar S/N: ");
						continuar = ler.next();
				 } while (opera�oes == 10);
			}
				
			if (tipoConta == 3) {
				System.out.println("Conta Especial");
				System.out.println("Saldo " + contaMagica.getSaldo());
				System.out.println("MOVIMENTO [D] D�bito ou [C] Cr�dito: ");
				movimento = ler.next();
				System.out.println("Valor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					contaMagica.credito(valor);
					movimentos[opera�oes] = "Cr�dito " + valor;
				} else {
					contaMagica.debito(valor);
					movimentos[opera�oes] = "D�bito " + valor;
				}
				opera�oes = opera�oes + 1;
			}
				System.out.print("\t\t\tContinuar S/N: ");
				continuar = ler.next();
			
			if (tipoConta == 5) {
				System.out.println("\t\t\t\tConta Estudante");
				System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
				System.out.println("\t\t\tSaldo " + contaEstudante.getSaldo());
				System.out.print("\t\t\tMOVIMENTO [D] D�bito ou [C] Cr�dito: ");
				movimento = ler.next();
				System.out.print("\t\t\tValor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					contaEstudante.credito(valor);
					movimentos[opera�oes] = "\t\t\tCr�dito " + valor;
				} else {
					contaEstudante.debito(valor);
					movimentos[opera�oes] = "\t\t\tD�bito " + valor;
				}
				opera�oes = opera�oes + 1;
				}
				System.out.print("\n\t\t\tContinuar S/N: \n");
				continuar = ler.next();

		} while (continuar.equalsIgnoreCase("S") && opera�oes < 10);
		System.out.println(movimentos);
	}

}