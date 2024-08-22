package Lista4;

public class Elefante extends AnimalTerrestreAB {

	@Override
	public void comer() {
		comidaIngerida += 150; 
		System.out.printf("O elefante comeu %d kilos de comida %n", comidaIngerida);
	}

	@Override
	public void moverse() {
		caminhoPercorrido += 30;
		System.out.printf("O elefante se moveu %d km %n" , caminhoPercorrido);
	}

	@Override
	public void dormir() {
		horasDormidas += 2;
		System.out.printf("O elefante dormiu %d horas %n" , horasDormidas);
	}

	 @Override
	    public void correr() {
	      
	    }

	    @Override
	    public void pular() {
	        metros += 2;
	       
	    }
}