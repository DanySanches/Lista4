package Lista4;

public class Cachorro extends AnimalTerrestreAB {

	@Override
	public void comer() {
		comidaIngerida += 100; 
		System.out.printf("O cachorro comeu %d grãos de ração %n", comidaIngerida);
	}

	@Override
	public void moverse() {
		caminhoPercorrido += 10;
		System.out.printf("O cachorro se moveu %d km %n" , caminhoPercorrido);
	}

	@Override
	public void dormir() {
		horasDormidas += 10;
		System.out.printf("O cachorro dormiu %d horas %n" , horasDormidas);
	}
	 @Override
	    public void correr() {
	       
	    }

	    @Override
	    public void pular() {
	        
	    }

}
