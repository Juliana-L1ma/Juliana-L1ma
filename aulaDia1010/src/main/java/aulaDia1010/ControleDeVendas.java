package aulaDia1010;

import java.util.Scanner;

public class ControleDeVendas {
	public static void main(String[]args) {
		
		Scanner in = new Scanner (System.in);
		//criar objeto cliente
		Clientes clientey02 = new Clientes();
		//loop de repeticao para carregar o cadastro de clientes 
		for (int x=0; x < clientey02.getCadastro().length; x++) {
			//solicita ao usuario o nome do cliente 
			System.out.println("Cadastre o nome do cliente");
			clientey02.getCadastro() [x][0] = in.nextLine();
			//solicita ao usuario o cpf do cliente 
			System.out.println("Cadastre o CPF do cliente");
			clientey02.getCadastro()[x][1] = in.nextLine();
			//solicita ao usuario o telefone do cliente 
			System.out.println("Cadastre o telefone do cliente");
			clientey02.getCadastro()[x][2] = in.nextLine();
		}
		
		//criar objeto carros
		Carros carrosy02 = new Carros();
		//loop de repeticao para carregar o cadastro de clientes
		for (int x=0; x < carrosy02.getCarro().length; x++) {
			//solicita ao usuario o fabricante do veículo
			System.out.println("Cadastre o fabricante do veículo");
			carrosy02.getCarro() [x][0] = in.nextLine();
			//solicita ao usuario o modelo do veículo
			System.out.println("Cadastre o modelo do veículo");
			carrosy02.getCarro()[x][1] = in.nextLine();
			//solicita ao usuario o valor do veículo
			System.out.println("Cadastre o valor do veículo");
			carrosy02.getCarro()[x][2] = in.nextLine();
		}
		
		Concessionaria y02 = new Concessionaria();
		y02.setNome("Y 02");
		y02.carros = carrosy02;
		y02.clientes = clientey02;
		
		for (int x=0; x < y02.clientes.getCadastro().length; x++) {
			for(int y = 0; y < 3; y++ ) {
				System.out.println( y02.clientes.getCadastro() [x][y]);
			}
			System.out.println(" ");
		}
		
		for (int x=0; x < y02.carros.getCarro().length; x++) {
			for(int y = 0; y < 3; y++ ) {
				System.out.println( y02.carros.getCarro() [x][y]);
			}
			System.out.println(" ");
		}
		
		String cpfCliente = in.nextLine();
		for(int x = 0; x < y02.clientes.getCadastro().length; x++) {
				if (y02.clientes.getCadastro()[x][1].equals(cpfCliente)) {
					System.out.println("O cliente: " + y02.clientes.getCadastro()[x][0] );
					System.out.println("O cpf: " + y02.clientes.getCadastro()[x][1] );
					System.out.println("O telefone: " + y02.clientes.getCadastro()[x][2] );
				}
		
	   }
		String modeloCarro = in.nextLine();
		for(int x = 0; x < 3; x++) {
			if (y02.carros.getCarro()[x][1].equals(modeloCarro)) {
				System.out.println("O fabricante: " + y02.carros.getCarro()[x][0] );
				
			}
	
   }

	}
}
