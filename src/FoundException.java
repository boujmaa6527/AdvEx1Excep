import java.util.Date;



public class FoundException {

	public static void main(String[] args) {
		
		//Exercice 1.1
		Date date = null; 
		Date today = new Date();
		
		try
		{
			System.out.println(date.getClass().getName());
			// getclass() est une fonction native de l'objet mère Objet.
			System.out.println(today.getClass().getName());
		}catch(Exception e ) {
			
			System.out.println("Erreur date ");
		}
		

	}
	
	
}

