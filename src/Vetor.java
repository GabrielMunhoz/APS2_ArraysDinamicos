
public class Vetor implements VetorD {
	
	int valores [];
	int indice; 
	int contador;
	
	public Vetor() {
		valores = new int[1];
		contador = 0;
	}
	@Override
	public void insereFinal(int valor) {
		criarEspaco();
		valores[this.contador] = valor;
		contador++;
	}

	@Override
	public void insereInicio(int valor) {
		
		inserePosicao(0,valor); 
	}

	@Override
	public void inserePosicao(int indi, int valor) {
		if(isIndexValid(indi)) {
			criarEspaco();
			moveFrente(indi);
			valores[indi] = valor;
			contador++;
		}
		else {
			System.out.println("Indice invalido.");
		}
	}

	@Override
	public void get(int ind) {
		
		if(isIndexValid(ind)) {
			System.out.println("int: "+valores[ind]);
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
		
		
	}

	@Override
	public int size() {
		return valores.length;
		
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
		
		if(contador == valores.length -1) {
			int aux[] = new int[valores.length*2];
			for(int i =0 ; i< valores.length; i++) {
				aux[i]=valores[i];
			}
			valores = aux;
			
		}
		
	}
	
	public void moveFrente(int index) {
	    if ( isIndexValid ( index ) ) {
	    	System.out.println("entrei");
	        for (int i = contador; i > index; i = i- 1) {
	            valores[i] = valores[i - 1];
	        }    		
	    }
	   }
	public boolean isIndexValid ( int index ) {
	    return ( index >= 0  ) && ( index < contador );    		
	}   		
}
