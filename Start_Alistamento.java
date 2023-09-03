package aplication;

import java.util.Scanner;

import entities.Alistamento;

public class Start_Alistamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Alistamento cadastro1 = new Alistamento(null, null, null, null, null, null, null, null);
		Alistamento cadastro2 = new Alistamento(null, null, null, null, null, null, null, null);
		
		cadastro1.iniciarCadastro(sc);
		
		cadastro2.iniciarCadastro(sc);
		
		
		sc.close();

	}

}
