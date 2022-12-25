package exercicioPolimorfismo;

public class PessoaFisica extends Contribuinte {
	double despesa;

	@Override
	public Double taxas() {
		double imposto = 0;
		if (getRendaAnual() < 20000.00) {
			imposto = (0.15 * getRendaAnual()) - (despesa * 0.50);
		} else if (getRendaAnual() >= 20000.00) {
			imposto = (0.25 * getRendaAnual()) - (despesa * 0.50);
		}
		return imposto;
	}

	public PessoaFisica(String nome, Double rendaAnual, double despesa) {
		super(nome, rendaAnual);
		this.despesa = despesa;
	}

}
