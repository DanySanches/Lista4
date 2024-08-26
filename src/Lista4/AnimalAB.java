package Lista4;

public abstract class AnimalAB implements AnimalIF {
	
	protected String nome;
	protected String tipo; // "mamifero", "réptil, "ovíparos", "aves" etc
	protected int idade;
	protected String habitat; //"aquatico", terreste , "terreste e ar", "terreste e água"
	protected int qtdPatas;
	protected int qtdAsas;
	protected double envergaduraAsa;
	protected double altura;
	protected double peso;
	
	
    protected int comidaIngerida;
    protected int caminhoPercorrido;
    protected int horasDormidas;

	@Override
	public abstract void comer();
	
	@Override
	public abstract void moverse();
	
	@Override
	public abstract void dormir();

}
