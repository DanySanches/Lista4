package Lista4;

public class Pombo extends AnimalVoadorAB{
	
	@Override
	public void comer() {
		comidaIngerida += 30; 
		System.out.printf("O Pombo comeu %d migalhas de pão %n", comidaIngerida);
	}

	@Override
	public void moverse() {
		caminhoPercorrido += 3;
		System.out.printf("O Pombo se moveu %d km %n" , caminhoPercorrido);
	}

	@Override
	public void dormir() {
		horasDormidas += 2;
		System.out.printf("O Pombo dormiu %d horas %n" , horasDormidas);
	}
	
	@Override
	public void voar() {
		velocidade += 100;
		System.out.printf("O vôo do Pombo pode atingir %d Km/hr %n" , velocidade);
	}

}
