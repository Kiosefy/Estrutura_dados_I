public class Vetor_Double
{
	public static void main(String[] args) {
	    
		int [] notas = new int[5];
		
		//85, 92, 78, 95, 88
		notas[0]=85;
		notas[1]=92;
		notas[2]=78;
		notas[3]=95;
		notas[4]=88;
		
		for(int i =0; i <= notas.length; i++){
		    
	        System.out.println("Nota " + (i+1) +" : " + notas[i]);
		    
		}
	}
}
