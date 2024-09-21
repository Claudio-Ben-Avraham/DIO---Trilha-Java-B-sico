package claro;

import java.util.Scanner;

	public class ContaTerminal {

	    public static void main(String[] args) {
	        
	        // Criar um objeto Scanner para ler a entrada do usuário
	        Scanner scanner = new Scanner(System.in);
	        
	        // Solicitar e capturar o número da conta
	        System.out.println("Por favor, digite o número da Conta:");
	        int numero = scanner.nextInt();
	        
	        // Consumir a nova linha deixada pelo nextInt
	        scanner.nextLine();

	        // Solicitar e capturar a agência
	        System.out.println("Por favor, digite o número da Agência:");
	        String agencia = scanner.nextLine();

	        // Solicitar e capturar o nome do cliente
	        System.out.println("Por favor, digite o seu Nome:");
	        String nomeCliente = scanner.nextLine();

	        // Solicitar e capturar o saldo
	        System.out.println("Por favor, digite o saldo da Conta:");
	        double saldo = scanner.nextDouble();

	        // Exibir a mensagem de saída com as informações inseridas
	        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
	                            + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
	        
	        // Fechar o Scanner
	        scanner.close();
	    }


}
