package concessionaria;

public class DirecaoHidraulica extends Acessorios{
	
	private Veiculo veiculo;

	public DirecaoHidraulica(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public double calcularCusto(){
		return veiculo.calcularCusto() + 1500;
	}

}
