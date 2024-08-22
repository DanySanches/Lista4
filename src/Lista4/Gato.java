package Lista4;

public class Gato extends AnimalTerrestreAB{
	
		@Override
		public void comer() {
			comidaIngerida += 300; 
			System.out.printf("O gato comeu %d gramas de ração %n", comidaIngerida);
		}

		@Override
		public void moverse() {
			caminhoPercorrido += 0;
			System.out.printf("O gato se moveu %d km %n" , caminhoPercorrido);
		}

		@Override
		public void dormir() {
			horasDormidas += 18;
			System.out.printf("O gato dormiu %d horas %n" , horasDormidas);
		}
		
		
		 @Override
		    public void correr() {
		    
		    }

		    @Override
		    public void pular() {
		        metros += 2;
		        System.out.printf("O gato pula até %d metros%n", metros);
		    }
	
	

}
