
public class Aplicacao {

	public static void main(String[] args) {
		Vetor t; 
		t= new Vetor();

		t.inserefinal(1);

		if(t.isEmpty()){
			System.out.println("Vetor esta vazio! ");
		}else{
			System.out.println("Vetor nao esta vazio!");
		}
	}

}
