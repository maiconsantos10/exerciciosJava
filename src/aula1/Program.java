package aula1;
import java.util.Scanner;

import entities.Funcionario;



public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Entre com o nome do funcion�rio: ");
		funcionario.nome = sc.nextLine();
		
		System.out.println("Entre com o sal�rio do funcion�rio: ");
		funcionario.salario = sc.nextDouble();
		
		System.out.println("Entre com o imposto do funcion�rio: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Entre com o CPF do funcion�rio");
		funcionario.CPF = sc.nextDouble();
		
		double salarioLiquido = funcionario.salario - funcionario.imposto;
		System.out.println("Segue abaixo o relat�rio geral");
		
		
		System.out.println("O funcion�rio " + funcionario.nome + " teve um desconto de " + funcionario.imposto + " reais");
		System.out.println("O sal�rio restante do funcion�rio � de " + salarioLiquido);
		
		
		if (salarioLiquido > 3000) {
			System.out.print("Este funcion�rio paga imposto");
		} else {
			System.out.print("Este funcion�rio n�o paga imposto");
		}
		
		sc.close();
	}

}
