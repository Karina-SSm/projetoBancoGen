package aplicacao;

import java.util.Scanner;
import classes.Conta;
import classes.ContaCorrente;
import classes.ContaEmpresa;
import classes.ContaEspecial;
import classes.ContaEstudantil;
import classes.ContaPoupanca;

public class Banco {

	public static void main(String[] args) {
		int numero = 0;
		String cpf = null;
		int tipoConta = 0;
		boolean ativa = false;
		Scanner ler = new Scanner(System.in);
		ContaEspecial contaMagica = null;
		ContaEstudantil contaEstudante = null;
		ContaCorrente contaC = null;
		ContaEmpresa contaEmpresa = null;
		ContaPoupanca contaPoupanca = null;
		int diaDigitado = 0;
		int contadorTalao = 0;
		String continuar = null;
		int operaçoes = 0;
		String[] movimentos = new String[10];
		String movimento = null;
		double valor = 0.00;
		double emprestimoEmpresa = 10000;
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
		//Bruno Mota - Conta Poupança//
		if (tipoConta == 1) {
			System.out.println("\t\t Tipo de conta selecionada: Poupanca");
			System.out.println();
			System.out.println("\t\t Digite o dia de hoje ");
			diaDigitado = ler.nextInt();
			System.out.print("\t\t Digite o número da sua conta: ");
			numero = ler.nextInt();
			System.out.print("\t\t Digite o número do seu CPF: ");
			cpf = ler.next();
			
			contaPoupanca = new ContaPoupanca(numero, cpf, true, 1);
		} 
		// Karina //
		else if (tipoConta == 2) {
			System.out.println("\t\t Tipo de conta selecionada: Corrente");
			System.out.println();
			System.out.print("\t\t Digite o número da sua conta: ");
			numero = ler.nextInt();
			System.out.print("\t\t Digite o número do seu CPF: ");
			cpf = ler.next();
			contaC = new ContaCorrente(numero, cpf, false, 3);
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
		//Johnny//
		else if (tipoConta == 4) {
			System.out.println("\t\t Tipo de conta selecionada: Conta Empresa");
			System.out.println();
			System.out.print("\t\t Digite o número da sua conta: ");
			numero = ler.nextInt();
			System.out.print("\t\t Digite o número do seu CPF: ");
			cpf = ler.next();
			contaEmpresa = new ContaEmpresa(numero, cpf, true, emprestimoEmpresa);
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
			
			if (tipoConta == 1) {
				System.out.println("\t\t\t\tConta Poupança");
				System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
				System.out.println("\t\t\tSaldo " + contaPoupanca.getSaldo());
				
				System.out.print("\t\t\tMOVIMENTO [D] Débito ou [C] Crédito: ");
				movimento = ler.next();
				System.out.print("\t\t\tValor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					contaPoupanca.credito(valor);
					movimentos[operaçoes] = "\t\t\tCrédito " + valor;
				} else {
					contaPoupanca.debito(valor);
					movimentos[operaçoes] = "\t\t\tDébito " + valor;
				}
				if(contaPoupanca.getSaldo() > 0) {
					contaPoupanca.correcao(diaDigitado);
					System.out.println("Saldo com Correção: "+ contaPoupanca.getSaldo());
				}
				operaçoes = operaçoes + 1;
				}
				System.out.print("\n\t\t\tContinuar S/N: \n");
				continuar = ler.next();
			
				if(tipoConta == 2) {
					 do {
						 System.out.println("\t\t\t\tConta Corrente");
							System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
							System.out.println("\t\t Saldo " +contaC.getSaldo());
							System.out.println("Taloes de chuque " + contaC.getContadorTalao());
							System.out.print("\t\t\tMOVIMENTO [D] Débito ou [C] Crédito: ");
							movimento = ler.next();
							
							System.out.print("\t\t\t Valor movimento: R$  ");
							valor = ler.nextDouble();
							
							if (movimento.equalsIgnoreCase("C")) {
								
								contaC.credito(valor);
								movimentos[operaçoes] = "\t\t\tCrédito " + valor;
								
							}else {
								contaC.debito(valor);
								movimentos[operaçoes] = "\t\t\tDébito " + valor;
								
							}
							
							operaçoes = operaçoes + 1;
							
							int opcao;
							do {
								System.out.println("vc deseja solicitar Talao de Cheque?  1 - Sim ou 2- Não:");
								opcao = ler.nextInt();
								
								if (opcao == 1) {
									if(contadorTalao == 3) {
										System.out.println("Limite de talao do mês atingindo ");
										
									}else if(contadorTalao < 3) {
										contaC.getContadorTalao();
										
										System.out.println("Talao solicitado ");
										contaC.setContadorTalao(contaC.getContadorTalao() + 1);
										
										if(contadorTalao == 3) {
											System.out.println("Limite de talao do mês atingindo ");
											
										}

									}

								}else if (opcao == 2) {
									System.out.println("Taloes disponiveis:  "+ contaC.getContadorTalao());
																
								}
								
							} while (contadorTalao < 3 && opcao != 2);
							
							System.out.println("limite de Tala de cheque atingiido " +contadorTalao);
							
							System.out.print("\t\t\tContinuar S/N: ");
							continuar = ler.next();
							 
						 }while(continuar.equalsIgnoreCase("S") && operaçoes < 10);
						 
					 }
				
			if (tipoConta == 3) {
				System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
				System.out.println();
				System.out.println("\t\t\t     KIGBJ-G1 BANK ");
				System.out.println();
				System.out.println(
						"\t*~*~*~*~*~*~*~*~*~*~*~* [Dê um Xeque-Mate na sua dor de cabeça] *~*~*~*~*~*~*~*~*~*~*~*");
				System.out.println();
				System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
				System.out.println();
				System.out.println("Conta Especial");
				System.out.println("Você possui um limite de Cheque Especial  " + contaMagica.getLimite());
				System.out.println("Saldo " + contaMagica.getSaldo());
				System.out.println("MOVIMENTO - D-debito ou C-Crédito: ");
				movimento = ler.next();
				System.out.println("Valor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					contaMagica.credito(valor);
					movimentos[operaçoes] = "Crédito " + valor;
					
				} else  {
					contaMagica.debito(valor);
					movimentos[operaçoes] = "Débito " + valor;
				}
				
				operaçoes = operaçoes + 1;
				System.out.println("Continuar S/N:");
				continuar = ler.next();
			}
				
			if (tipoConta == 4) {
				System.out.println("\t\t\t\tConta Empresa");
				System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
				System.out.println("\t\t\tSaldo " + contaEmpresa.getSaldo());
				System.out.print("\t\t\tMOVIMENTO [D] Débito ou [C] Crédito: ");
				movimento = ler.next();
				System.out.print("\t\t\tValor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					contaEmpresa.credito(valor);
					movimentos[operaçoes] = "\t\t\tCrédito " + valor;
				} else {
					contaEmpresa.debito(valor);
					movimentos[operaçoes] = "\t\t\tDébito " + valor;
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
				
				System.out.print("\n\t\t\tContinuar S/N: \n");
				continuar = ler.next();
			}

		} while (continuar.equalsIgnoreCase("S") && operaçoes < 10);
		System.out.println(movimentos);
	}

}