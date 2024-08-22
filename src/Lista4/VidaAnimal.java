package Lista4;



public class VidaAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		Elefante elefante = new Elefante();
		Leao leao = new Leao();
		Peixe peixe = new Peixe();
		Pombo pombo = new Pombo();
		
		cachorro.comer();
		cachorro.moverse();
		cachorro.dormir();
		
		gato.comer();
		gato.moverse();
		gato.dormir();
		gato.pular();
		
		elefante.comer();
		elefante.moverse();
		elefante.dormir();
		
		leao.comer();
		leao.moverse();
		leao.dormir();
		leao.correr();
		
		peixe.comer();
		peixe.moverse();
		peixe.dormir();
		peixe.nadar();
		
		pombo.comer();
		pombo.moverse();
		pombo.dormir();
		pombo.voar();
		
		
	}

}
