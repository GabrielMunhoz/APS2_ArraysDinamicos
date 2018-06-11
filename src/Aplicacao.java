
public class Aplicacao {

	public static void main(String[] args) {
		Vetor t; 
		t= new Vetor();
		t.insereFinal(2);
		t.insereFinal(3);
		t.insereFinal(5);
		t.insereFinal(7);
		t.insereInicio(1);
		t.insereInicio(2);
		t.inserePosicao(3, 7);
		t.removeInicio();
		t.removeInicio();
		t.removeFinal();
		t.removeFinal();
		t.removeFinal();
		t.remove(1);
		t.set(3, 6);
		t.get(0);
		t.get(1);
		t.get(2);
		t.get(3);
		t.get(4);
		t.get(5);
		
		System.out.println(t.capacity());
		System.out.println("fim");
	}

}
