package concessionaria;

public abstract class Veiculo {

	protected String marca;
	protected String modelo;
	protected String cor;
	protected int anoFabricacao;

	public abstract double calcularCusto();
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	



}
