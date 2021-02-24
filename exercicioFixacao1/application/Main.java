package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		BankAccount a1;
		
		//Obtendo dados para criação da conta
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine(); // Para consumir a quebra de linha do nextInt
		String accountHolder = sc.nextLine();
		System.out.print("Is there a inital deposit (y/n)? ");
		String answer = sc.nextLine();
		
		//Criando conta
		
		// Caso não haja um depósito inicial
		a1 = new BankAccount(accountNumber, accountHolder);
		
		if (answer.toLowerCase().equals("y")) {  // Caso haja um depósito inicial
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			a1 = new BankAccount(accountNumber, accountHolder, initialDeposit);
		} 
			
		//Exibindo dados da conta
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(a1);
		
		//Recebendo dados para realizar depósito
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		//Realizando depósito
		a1.deposit(value);
		
		//Exibindo dados da conta alterados
		System.out.println("");
		System.out.println("Account updated:");
		System.out.println(a1);
		
		//Recebendo dados para sacar
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		//Realizando depósito
		a1.withdraw(value);
		
		//Exibindo dados da conta alterados
		System.out.println("");
		System.out.println("Account updated:");
		System.out.println(a1);
		
	}

}
