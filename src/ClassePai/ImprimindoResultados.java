package ClassePai;
import ClassePai.Animal;
import ClassesFilhas.Cachorro;
import ClassesFilhas.Cavalo;
import ClassesFilhas.Preguica;
import TestandoAnimal.Teste;

public class ImprimindoResultados {

	public static void main(String[] args) {
		
		//////////////////// Cavalo ///////////////////////////////////////////
		
		Teste teste1 = new Teste();
		Animal teste2 = new Animal();
		
		teste2.setNome("Nome do cavalo: Jeremias");
		teste2.setIdade(10);
		teste1.somAnimal(new Cavalo());
		teste1.correr(new Cavalo());
		
		
		System.out.println(teste2.getNome() + "\nIdade em anos: " + teste2.getIdade());
		
		System.out.println();
		System.out.println();
		
		////////////////////// Cachorro //////////////////////////////////////////
	    
		Teste cachorro1 = new Teste();
		
	    
	    teste2.setNome("Nome do Cachorro: Madonna");
	    teste2.setIdade(1);
	    teste1.somAnimal(new Cachorro());
	    teste1.correr(new Cachorro());
	    
	    
	    System.out.println(teste2.getNome() + "\nIdade em anos: " + teste2.getIdade());
	    
	    System.out.println();
		System.out.println();
		
		/////////////////Preguiça/////////////////////////////////
		
		Teste preguica1 = new Teste();
		
		teste2.setNome("Nome da preguiça: Cornélia");
		teste2.setIdade(100);
        teste1.somAnimal(new Preguica());
        teste1.subir(new Preguica());
		
        System.out.println(teste2.getNome() + "\nIdade em anos: " + teste2.getIdade());
	}

}
