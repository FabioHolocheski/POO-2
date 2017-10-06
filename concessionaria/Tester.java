package concessionaria;

public class Tester {

	public static void main(String[] args) {
		

		
		
		Veiculo v1 = new Fusion();
		
		v1 = new VidroEletrico(v1);
		
		v1 = new ArCondicionado(v1);
		
		v1 = new DirecaoHidraulica(v1);
		
		System.out.println(v1.calcularCusto());
	}

}
