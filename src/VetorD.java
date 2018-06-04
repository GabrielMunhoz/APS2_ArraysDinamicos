
public interface VetorD {
	
	public void insereFinal(int valor);
	public void insereInicio(int valor);
	public void inserePosicao(int indice, int valor);
	public void get(int indice); //-> valor
	public void set(int indice, int valor);
	public void removeFinal();
	public void removeInicio();
	public void remove(int indice);
	public int size();
	public int capacity();
	public boolean isEmpty();
	public void criarEspaco();
}
