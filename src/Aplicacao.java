
public class Aplicacao {

	public static void main(String[] args) {
		Vetor t; 
		t= new Vetor();
		
		t.inserePosicao(-1, 2);
		t.inserePosicao(0, 2);
		
		for(int i = 0; i<t.size();i++) {
			t.get(i);
		}
		System.out.println(t.capacity());
		System.out.println("fim");
		
	}

}
