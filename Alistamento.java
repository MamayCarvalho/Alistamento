package entities;

import java.util.Scanner;

public class Alistamento {
	
	private String cadastroAlistamento[] = new String[8];
	private int dataNasc;
	
	
	
	public Alistamento(String nome, String nomeMae, String nomePai, String email, 
			String dataNasc, String altura, String peso, String telefone) {
		this.cadastroAlistamento[0] = nome;
		this.cadastroAlistamento[1] = nomeMae;
		this.cadastroAlistamento[2] = nomePai;
		this.cadastroAlistamento[3] = email;
		this.cadastroAlistamento[4] = dataNasc;
		this.cadastroAlistamento[5] = altura;
		this.cadastroAlistamento[6] = peso;
		this.cadastroAlistamento[7] = telefone;

	}
	
	public String[] getcadastroAlistamento() {
		return cadastroAlistamento;
	}
	public String getNome() {
		return cadastroAlistamento[0];
	}
	public String getNomeMae() {
		return cadastroAlistamento[1];
	}
	public String getNomePai() {
		return cadastroAlistamento[2];
	}
	public String getEmail() {
		return cadastroAlistamento[3];
	}
	public String getDataNasc() {
		return cadastroAlistamento[4];
	}
	public String getAltura() {
		return cadastroAlistamento[5];
	}
	public String getPeso() {
		return cadastroAlistamento[6];
	}
	public String getTelefone() {
		return cadastroAlistamento[7];
	}
	
	public void setTelefone(String novoTelefone) {
		this.cadastroAlistamento[7] = novoTelefone;
	}

	//Métodos
	public int calculoNasc(int dataNasc) {
		int idade = dataNasc - 2023;
		return idade;
	}
	public String multa(int idade) {
		if (calculoNasc(dataNasc) >= 20) {
			double precoMulta = (calculoNasc(dataNasc) - 19) * 5.0;
			System.out.println("O valor da multa é de R$" + precoMulta);
		}
		return "Preço Multa é R$00,00";
	}
	public void iniciarCadastro(Scanner sc) {
		System.out.println("Programa para Alistamento Militar\n");
		System.out.println("Informe o seu ano de Nascimento: ");
		cadastroAlistamento[4] = sc.next();
		calculoNasc(dataNasc);
		
		if (calculoNasc(dataNasc) < 18 && calculoNasc(dataNasc) > 45) {
			System.out.println("Para se alistar é necessário possuir 18 anos ou menos de 45 anos.");
		} else {
			
			System.out.println("Informe o seu nome completo: ");
			cadastroAlistamento[0] = sc.next();
			
			System.out.println("Informe o nome da sua Mãe: ");
	        cadastroAlistamento[1] = sc.next();
	
	        System.out.println("Informe o nome do seu Pai: ");
	        cadastroAlistamento[2] = sc.next();
	
	        System.out.println("Informe o seu email: ");
	        cadastroAlistamento[3] = sc.next();
	
	        System.out.println("Informe a altura: ");
	        cadastroAlistamento[5] = sc.next();
	
	        System.out.println("Informe o peso: ");
	        cadastroAlistamento[6] = sc.next();
	
	        System.out.println("Informe o telefone: ");
	        cadastroAlistamento[7] = sc.next();	
	        
	        System.out.println(toString()); 
		}
		
	}
	
	public String toString() {
		return "Programa de Alistamento Militar 2023 \n" + "\nNome: " + getNome() + "\nNome da Mãe; " +  getNomeMae() 
		+ "\nNome do Pai: " + getNomePai() + "\nE-mail: " + getEmail() + "\nAltura: " + getAltura() 
		+ "\nPeso: " + getPeso() + "\nAno de Nascimento: " + getDataNasc() +
		"\n" + multa(dataNasc);
	}


}