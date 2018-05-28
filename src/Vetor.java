
public class Vetor implements VetorD {
	
	int valores [];
	int indice; 
	
	public Vetor() {
		valores = new int[10];
		indice = -1;
		
	}
	
	@Override
	public void inserefinal(int valor) {
		indice+=1;
		valores[indice] = valor;
		
	}

	@Override
	public void insereInicio(int valor) {
		
		
	}

	@Override
	public void insere(int indice, int valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(int ind) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(int ind, int valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFinal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeInicio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int indice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		//retorna o número de elementos armazenados no vetor.
		return (indice);
		
	}

	@Override
	public int capacity() {
		// retorna a capacidade de armazenamento do vetor.
		return (valores.length -1);
		
	}

	@Override
	public boolean isEmpty() {
		// retorna "true" se o número de elementos for 0 (zero).
		return (indice == -1 );
	}

	@Override
	public void criarespaco() {
		// TODO Auto-generated method stub
		
	}

}
