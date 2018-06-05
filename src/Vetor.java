
public class Vetor implements VetorD {
	
	int valores [];
	int indice; 
	
	public Vetor() {
		valores = new int[10];
		indice = -1;
		
	}
	
	@Override
	public void insereFinal(int valor) {
		criarEspaco();
		valores[indice++] = valor;
		
	}

	@Override
	public void insereInicio(int valor) {
		int ini = 0;
		moveFrente(ini);
		criarEspaco();
		valores[ini] = valor; 
		
	}

	@Override
	public void inserePosicao(int indi, int valor) {
		// TODO Auto-generated method stub
		if(isIndexValid(indi)) {
			criarEspaco();
			moveFrente(indi);
			valores[indi] = valor;
		}
	}

	@Override
	public void get(int ind) {
		
		if(isIndexValid(ind)) {
			System.out.println(valores[ind]);
		}
		
	}

	@Override
	public void set(int ind, int valor) {
		if(isIndexValid(ind)) {
			valores[ind] = valor;
		}
		
	}

	@Override
	public void removeFinal() {
		if ( isIndexValid ( indice ) ) {
	        indice -= indice;
		}
	}

	private void moveTras(int index) {
		
		if ( isIndexValid ( index ) ) {
	        for (int i = index + 1; i < indice; i++) {
	            valores[i - 1] = valores[i];
	        }
		}
	}

	@Override
	public void removeInicio() {
		int ini = 0;
		moveTras(ini);
		
		
	}

	@Override
	public void remove(int indice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		//retorna o número de elementos armazenados no vetor.
		return indice;
		
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
	public void criarEspaco() {
		
		if ( indice == valores.length ) {
	       int  storage [] = new int[ valores.length * 2 ];
	        for (int i = 0; i < indice; i = i++) {
	            storage[i] = valores[i];
	        valores = storage;
	        }
		}
		else {
			return;
		}
	}
	
	public void moveFrente(int index) {
	    if ( isIndexValid ( index ) ) {
	        for (int i = indice; i > index; i = i--) {
	            valores[i] = valores[i - 1];
	        }    		
	    }
	   }
	public boolean isIndexValid ( int index ) {
	    return ( index >= 0  ) && ( index < indice );    		
	}   		
}
