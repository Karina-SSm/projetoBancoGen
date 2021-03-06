package classes;

import classes.Conta;
import java.util.Scanner;

public class ContaEmpresa extends Conta{

    Scanner ler = new Scanner (System.in);

    int numero = 0;
    private double emprestimoEmpresa;

    public ContaEmpresa(int numero, String cpf, boolean ativa, double emprestimoEmpresa) {
    super(numero, cpf, ativa);
    this.emprestimoEmpresa = emprestimoEmpresa;

    }

    public double getEmprestimoEmpresa() {
        return emprestimoEmpresa;
    }

    public void setEmprestimoEmpresa(double emprestimoEmpresa) {
        this.emprestimoEmpresa = emprestimoEmpresa;
    }

    @Override
    public void debito(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        
        }else if(valor > saldo) {
            System.out.println("\t  Você não possui saldo suficiente, deseja fazer o emprestimo Empresarial de 10.000,00: ");
            System.out.println("1 para Sim e 2 para Não");
            numero = ler.nextInt();

            //int contadoremprestimo = 0;
	        if(numero == 1 && valor < this.getEmprestimoEmpresa()) {
	              //this.credito(getSaldo());
	              //contadoremprestimo++;
	        	
	        	this.saldo = this.saldo - valor;
	
	            //System.out.print("Valor emprestimo R$ ");
	            this.pedirEmprestimo(this.saldo);
	            
	          }else {
	            System.out.println("Você ja solicitou seu emprestimo");
	            
	        }
        }
    }

    public double pedirEmprestimo(double valor) 
    {
    	System.out.println("Voce acabou de solicitar um emprestimo de R$"+ this.getEmprestimoEmpresa());
        this.emprestimoEmpresa = this.getEmprestimoEmpresa() + valor;
        
        System.out.println("O valor de seu emprestimo atual R$ "+ this.getEmprestimoEmpresa());
        
        this.saldo = 0;
        System.out.println("Saldo atual R$ "+ this.getSaldo());
        
        return this.emprestimoEmpresa;
        
    }

}