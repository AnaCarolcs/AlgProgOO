package contabancaria;

import java.util.Scanner;

public abstract class ContaBancaria {
	
	Scanner scan = new Scanner(System.in);
	
	private String numero;
	private double saldo;
	private String senha;
	
	public ContaBancaria(String senha) {
		this.senha = senha;
	}
	
	void alteraSenha(String nSenha) {
		System.out.println("digite senha antiga");
		String validaSenha = scan.nextLine();
		
		if(validaSenha.equals(getSenha())){
            this.setSenha(nSenha);
		} else {
			System.out.println("Senha inválida");
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	abstract void saca(double valor);
	abstract void deposita(double valor);
	abstract void tiraExtrato();
	
	
}
