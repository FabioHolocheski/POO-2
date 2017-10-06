package concessionaria;

public class ArCondicionado extends Acessorios{
	
	private Veiculo veiculo;

	public ArCondicionado(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public double calcularCusto(){
		return veiculo.calcularCusto() + 3000;
	}

}
