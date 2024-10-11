
public class ExcArray {

	
		
		//Exercise 1.2
		public static void MaxNote(int[] array) {
			// taille du tableau
			//int[] tab =  new int[array.length];
			
			int max = 0; 
			for(int val: array) {
				if(val > max) {
					max = val; 
				}
				
			}
			System.out.println("Note max: "+max);
			
		}
		public static void MinNote(int[] array) {
			
			
			int min = 20; 
			for(int val: array) {
				if(val < min) {
					min = val; 
				}
				
			}
			System.out.println("Note min: "+ min);
			
		}
		public static void Averrage(int[] array) {
		
		
		
			int average= 0; 
			for(int val: array) {
				
				average += val;
			
			
			}
			average /= array.length; 
			System.out.println("Moyenne des notes: "+ average);
		
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				int[] tab = {7, 8, 15, 18, 19};  
				
				try {
					System.out.println(tab[5]);
					MaxNote(tab);
					MinNote(tab);
					Averrage(tab);
					
				}catch(ArrayIndexOutOfBoundsException e ) {
					System.out.println("Erreur dans les formules");
				}
				
				System.out.println("test");
		}

	}

