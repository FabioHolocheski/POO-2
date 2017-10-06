package concessionaria;


public class veiculoBuilder {
	
	private Veiculo veiculo;

	public veiculoBuilder(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public veiculoBuilder marca (String marca) {
		veiculo.setMarca(marca);
		return this;
	}
	public veiculoBuilder modelo (String modelo) {
		veiculo.setModelo(modelo);
		return this;
	}
	public veiculoBuilder cor (String cor) {
		veiculo.setCor(cor);
		return this;
	}
	public veiculoBuilder anoFabricacao (int ano) {
		veiculo.setAnoFabricacao(ano);
		return this;
	}
}
