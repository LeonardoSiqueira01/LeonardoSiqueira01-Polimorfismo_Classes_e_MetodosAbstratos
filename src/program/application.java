package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicioPolimorfismo.Contribuinte;
import exercicioPolimorfismo.PessoaFisica;
import exercicioPolimorfismo.PessoaJuridica;

public class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> contribuentes = new ArrayList<>();
		System.out.println("Numero de contribuentes?");
		int numContribuentes = sc.nextInt();
		for (int i = 1; i <= numContribuentes; i++) {
			System.out.print("Dados do #" + i + " Contribuente:");
			System.out.println("Pessoa fisica ou Juridica(f/j):");
			char opc = sc.next().charAt(0);
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.println("Renda anual:");
			Double rendaAnual = sc.nextDouble();
			if (opc == 'f') {
				System.out.println("Despesas com saude:");
				Double despesasSaude = sc.nextDouble();
				contribuentes.add(new PessoaFisica(nome, rendaAnual, despesasSaude));

			} else if (opc == 'j') {
				System.out.println("Quantidade de funcionarios:");
				int qtdFuncionarios = sc.nextInt();
				contribuentes.add(new PessoaJuridica(nome, rendaAnual, qtdFuncionarios));
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		System.out.println("-------------------------------------------------------");
		double taxaTotal = 0.0;
		for (Contribuinte contribuinte : contribuentes) {
			System.out.println(contribuinte.getNome() + ": $" + String.format("%.2f", contribuinte.taxas()));
			taxaTotal = taxaTotal + contribuinte.taxas();
		} 
		System.out.println("-------------------------------------------------------");

		System.out.println("TAXAS TOTAIS: " + taxaTotal);
		sc.close();
	}
}
