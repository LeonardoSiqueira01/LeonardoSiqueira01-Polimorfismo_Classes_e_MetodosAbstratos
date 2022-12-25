package exercicioPolimorfismo;

public abstract class Contribuinte {
	private String nome;
	private Double RendaAnual;

	public abstract Double taxas();

	public Contribuinte(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		RendaAnual = rendaAnual;
	}

	public Contribuinte() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return RendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		RendaAnual = rendaAnual;
	}

}
