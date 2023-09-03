package entities;

import java.util.Scanner;

public class Alistamento {
	
	private String cadastroAlistamento[] = new String[8];
		
	
	public Alistamento(String dataNasc, String nome, String nomeMae, String nomePai, String email, 
			String altura, String peso, String telefone) {
		this.cadastroAlistamento[0] = dataNasc;
		this.cadastroAlistamento[1] = nome;
		this.cadastroAlistamento[2] = nomeMae;
		this.cadastroAlistamento[3] = nomePai;
		this.cadastroAlistamento[4] = email;
		this.cadastroAlistamento[5] = altura;
		this.cadastroAlistamento[6] = peso;
		this.cadastroAlistamento[7] = telefone;

	}
	
	public String getDataNasc() {
		return cadastroAlistamento[0];
	}
	public String getNome() {
		return cadastroAlistamento[1];
	}
	public String getNomeMae() {
		return cadastroAlistamento[2];
	}
	public String getNomePai() {
		return cadastroAlistamento[3];
	}
	public String getEmail() {
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
	public int calculoNasc() {
		int dataNasc = Integer.parseInt(getDataNasc());
		return 2023 - dataNasc;
	}
	public void multa() {
		double precoMulta = 0;
		if (calculoNasc() >= 20) {
			precoMulta = (calculoNasc() - 19) * 5.0;
		}
		System.out.printf("O valor da multa é de R$%.2f" , precoMulta);
	}
	public void iniciarCadastro(Scanner sc) {
		System.out.println("\nPrograma para Alistamento Militar\n");
		System.out.println("Informe o seu ano de Nascimento: ");
		cadastroAlistamento[0] = sc.next();
		int idade = calculoNasc();
		
		if (idade >= 18 && idade < 45) {
			
			System.out.println("Informe o seu nome completo: ");
			cadastroAlistamento[1] = sc.next();
			
			System.out.println("Informe o nome da sua Mãe: ");
	        cadastroAlistamento[2] = sc.next();
	
	        System.out.println("Informe o nome do seu Pai: ");
	        cadastroAlistamento[3] = sc.next();
	
	        System.out.println("Informe o seu email: ");
	        cadastroAlistamento[4] = sc.next();
	
	        System.out.println("Informe a altura: ");
	        cadastroAlistamento[5] = sc.next();
	
	        System.out.println("Informe o peso: ");
	        cadastroAlistamento[6] = sc.next();
	
	        System.out.println("Informe o telefone: ");
	        cadastroAlistamento[7] = sc.next();	
	        
	        System.out.println(toString());
	        multa();
			
		} else {
			System.out.println("Para se alistar é necessário possuir entre 18 e 45 anos.");
			
		}
		
	}
	
	public String toString() {
		return "Programa de Alistamento Militar 2023 \n" + "\nNome: " + getNome() + "\nNome da Mãe; " +  getNomeMae() 
		+ "\nNome do Pai: " + getNomePai() + "\nE-mail: " + getEmail() + "\nAltura: " + getAltura() 
		+ "\nPeso: " + getPeso() + "\nAno de Nascimento: " + getDataNasc() +
		"\n";
	}


}
