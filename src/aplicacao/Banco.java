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
		int operaçoes = 0;
		String[] movimentos = new String[10];
		String movimento = null;
		double valor = 0.00;
		// chamar a minha conta
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t\t\t\t KIGBJ-G1 BANK ");
		System.out.println();
		System.out.println("\t*~*~*~*~*~*~ [Dê um Xeque-Mate na sua dor de cabeça] ~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t\t\t [1] Conta Poupança");
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
			System.out.print("\t\t Digite o número da sua conta: ");
			numero = ler.nextInt();
			System.out.print("\t\t Digite o número do seu CPF: ");
			cpf = ler.next();
			double talaoCheque = 0;
			contaCorrente = new ContaCorrente(numero, cpf, false, talaoCheque);
		}
		// Giulliana Munhoz //
		else if (tipoConta == 3) {
			System.out.println("\t\t Tipo de conta selecionada: Especial");
			System.out.println("\t\t Digite o número da sua conta:");
			numero = ler.nextInt();
			System.out.println("\t\t Digite o número do seu CPf:");
			cpf = ler.next();
			contaMagica = new ContaEspecial(numero, cpf, true, 1000.00); 
		} 
		else if (tipoConta == 4) {
		}
		// Igor Pereira //
		else if (tipoConta == 5) {
			System.out.println("\t\t Tipo de conta selecionada: Estudante");
			System.out.println();
			System.out.print("\t\t Digite o número da sua conta: ");
			numero = ler.nextInt();
			System.out.print("\t\t Digite o número do seu CPF: ");
			cpf = ler.next();
			contaEstudante = new ContaEstudantil(numero, cpf, true);
		
		} else if (tipoConta == 6) {
			System.out.println("\t\t Operação encerrada.");
			return;
		}
		do {
			System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
			System.out.println();
			System.out.println("\t\t\t\tKIGBJ-G1 BANK ");
			System.out.println();
			System.out.println("\t*~*~*~*~*~*~ [Dê um Xeque-Mate na sua dor de cabeça] ~*~*~*~*~*~*");
			System.out.println();
			System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
			System.out.println();
			
			if (tipoConta == 2) {
				System.out.println("\t\t\t\tConta Corrente");
				System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
				System.out.println("\t\t\tSaldo " + contaCorrente.getSaldo());
				System.out.println("\t\t\tTalões de cheque " + contadorTalao);
				System.out.print("\t\t\tMOVIMENTO [D] Débito ou [C] Crédito: ");
				movimento = ler.next();
				System.out.print("\t\t\tValor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					contaCorrente.credito(valor);
					movimentos[operaçoes] = "\t\t\tCrédito " + valor;
				} else {
					contaCorrente.debito(valor);
					movimentos[operaçoes] = "\t\t\tDébito " + valor;
				}
				operaçoes = operaçoes + 1;
					char opcao;
					do {
						System.out.print("\t\tDeseja solicitar um talão de cheques? [S] Sim | [N] Não");
						opcao = ler.next().toUpperCase().charAt(0);
						System.out.println();
	                    
						if(opcao == 'S' && contadorTalao < 3) {
	                    	contaCorrente.getContadorTalao();
	                    	System.out.println("\t\t\tTalão solicitado");
	                    	contadorTalao ++;
	                    	if (contadorTalao > 3) {
	                    		System.out.println("\t\tVocê já solicitou seus 3 talões disponíveis no mês.");
	                    	}
	                    } 
						System.out.print("\n\t\t\tContinuar S/N: ");
						continuar = ler.next();
				 } while (operaçoes == 10);
			}
				
			if (tipoConta == 3) {
				System.out.println("Conta Especial");
				System.out.println("Saldo " + contaMagica.getSaldo());
				System.out.println("MOVIMENTO [D] Débito ou [C] Crédito: ");
				movimento = ler.next();
				System.out.println("Valor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					contaMagica.credito(valor);
					movimentos[operaçoes] = "Crédito " + valor;
				} else {
					contaMagica.debito(valor);
					movimentos[operaçoes] = "Débito " + valor;
				}
				operaçoes = operaçoes + 1;
			}
				System.out.print("\t\t\tContinuar S/N: ");
				continuar = ler.next();
			
			if (tipoConta == 5) {
				System.out.println("\t\t\t\tConta Estudante");
				System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
				System.out.println("\t\t\tSaldo " + contaEstudante.getSaldo());
				System.out.print("\t\t\tMOVIMENTO [D] Débito ou [C] Crédito: ");
				movimento = ler.next();
				System.out.print("\t\t\tValor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					contaEstudante.credito(valor);
					movimentos[operaçoes] = "\t\t\tCrédito " + valor;
				} else {
					contaEstudante.debito(valor);
					movimentos[operaçoes] = "\t\t\tDébito " + valor;
				}
				operaçoes = operaçoes + 1;
				}
				System.out.print("\n\t\t\tContinuar S/N: \n");
				continuar = ler.next();

		} while (continuar.equalsIgnoreCase("S") && operaçoes < 10);
		System.out.println(movimentos);
	}

}