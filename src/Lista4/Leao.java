package Lista4;

public class Leao extends AnimalTerrestreAB {

	@Override
	public void comer() {
		comidaIngerida += 7;
		System.out.printf("O Leão comeu %d kg de carne %n", comidaIngerida);
	}

	@Override
	public void moverse() {
		caminhoPercorrido += 12;
		System.out.printf("O Leão se moveu %d km %n", caminhoPercorrido);
	}

	@Override
	public void dormir() {
		horasDormidas += 15;
		System.out.printf("O Leão dormiu %d horas %n", horasDormidas);
	}

	@Override
	public void correr() {
		velocidade += 74;
		System.out.printf("O Leão corre até %d Km/hr%n", velocidade);
	}

	@Override
	public void pular() {

	}
}
