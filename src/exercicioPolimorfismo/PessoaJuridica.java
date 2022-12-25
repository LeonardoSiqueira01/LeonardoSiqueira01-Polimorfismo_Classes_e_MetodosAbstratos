package exercicioPolimorfismo;

public class PessoaJuridica extends Contribuinte {
	int numeroFuncionarios;

	@Override
	public Double taxas() {
		double imposto = 0.0;
		if (numeroFuncionarios <= 10) {
			imposto = getRendaAnual() * 0.16;
		} else if (numeroFuncionarios > 10) {
			imposto = getRendaAnual() * 0.14;
		}
		return imposto;
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

}
