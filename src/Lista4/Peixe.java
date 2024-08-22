package Lista4;

import java.util.Locale;

public class Peixe extends AnimalMarinhoAB {
	
	@Override
	public void comer() {
		comidaIngerida += 1; 
		System.out.printf("O Peixe comeu %d minhoca %n", comidaIngerida);
	}

	@Override
	public void moverse() {
		caminhoPercorrido += 5;
		System.out.printf("O Peixe se moveu %d km %n" , caminhoPercorrido);
	}

	@Override
	public void dormir() {
		horasDormidas += 0;
		System.out.printf("O Peixe dormiu %d horas %n" , horasDormidas);
	}
	
	@Override
	public void nadar() {
		Locale.setDefault(Locale.US);
		profundidade += 8.3;
		System.out.printf("No Japão um peixe bateu o recorde de nadar a %.1f mil metros de profundidade %n" , profundidade);
	}

}

