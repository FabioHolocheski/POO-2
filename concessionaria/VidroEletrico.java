package concessionaria;

public class VidroEletrico extends Acessorios{
	
	private Veiculo veiculo;

	public VidroEletrico(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
	@Override
	public double calcularCusto(){
		return veiculo.calcularCusto() + 900;
	}

}
