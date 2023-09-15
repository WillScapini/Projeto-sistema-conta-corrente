package SaldoConta;
import java.util.HashMap;
import java.time.LocalDate;
import java.util.Scanner;



public class contaCorrente {
	
	public void currenteAccount() {
		
		String inputLooping = " ";
		String user = " ";
		int balance = 0;
		LocalDate date = LocalDate.now();
		
		HashMap<String,Integer> currente = new HashMap<String, Integer>();
		
		Scanner scannerOne = new Scanner(System.in);
		Scanner scannerTwo = new Scanner(System.in);
		Scanner scannerTree = new Scanner(System.in);
		
		while(inputLooping == " ") {
			
			System.out.println("==============Bem vindo ao sistema do banco=============================");
			System.out.printf("Digite a opção: \n 1 - Começar Aplicação \n 2 - Aplicar Dinheiro \n 3 - Sacar Dinheiro \n 4 - Consultar saldo  \n 5 - Sair \n");
			System.out.printf("Opção: ");
			int option = scannerOne.nextInt();
			
			if(option == 1) {
				
				System.out.printf("Digite o Usuario da conta corrente: ");
				
				user = scannerTwo.nextLine();
				
				
				currente.put(user,balance);
					
				
				
	
															
			} else if (option == 2) {
					
					System.out.printf("Informe quanto deseja aplicar: ");
					int apllyMoney = scannerTree.nextInt();
					
					balance += apllyMoney;
					
					currente.put(user,balance);
					
					
					
					
					
					
						
					
				} else if (option == 3) {
					
					System.out.printf("Informe quanto deseja sacar : ");
					int apllyMoney = scannerTree.nextInt();
					
					balance -= apllyMoney;
					
					currente.put(user,balance);
					
					if(balance > 0) {
						
						currente.put(user,balance);
						
					} else {
						System.out.printf("O saldo da conta chegou a 0 R$ não foi permitido sacar valores superiores.\n");
						balance = 0;
						currente.put(user,balance);
						
						
						
					}
					
					
					

					
					
				} else if (option == 4) {
					System.out.printf("\n");
					
					System.out.println("=================Saldo Conta Corrente=======================");
					
					
					for(String i : currente.keySet()) {
						
						
						System.out.println(" Data: " + date);
						System.out.println(" Usuario: " + i);
						System.out.println(" Saldo: " + currente.get(i) + " R$"); 
					}
					
					 

					System.out.printf("\n");
					
				
				
			} else if(option == 5) {
				System.out.println("Fim da Aplicação");
				break;
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		scannerOne.close();
		scannerTwo.close();
		scannerTree.close();
		
		
		
	}
	
	

}
