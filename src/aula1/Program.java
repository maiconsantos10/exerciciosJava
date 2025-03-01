package aula1;
import java.util.Scanner;

import entities.Funcionario;



public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Entre com o nome do funcionário: ");
		funcionario.nome = sc.nextLine();
		
		System.out.println("Entre com o salário do funcionário: ");
		funcionario.salario = sc.nextDouble();
		
		System.out.println("Entre com o imposto do funcionário: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Entre com o CPF do funcionário");
		funcionario.CPF = sc.nextDouble();
		
		double salarioLiquido = funcionario.salario - funcionario.imposto;
		System.out.println("Segue abaixo o relatório geral");
		
		
		System.out.println("O funcionário " + funcionario.nome + " teve um desconto de " + funcionario.imposto + " reais");
		System.out.println("O salário restante do funcionário é de " + salarioLiquido);
		
		
		if (salarioLiquido > 3000) {
			System.out.print("Este funcionário paga imposto");
		} else {
			System.out.print("Este funcionário não paga imposto");
		}
		
		sc.close();
	}

}
