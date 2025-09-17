public class Soma_Decimais
{
	public static void main(String[] args) {
	    
		double [] decimais = new double[4];
		double soma =0d;
		//1.50, 2.75, 5.00, 3.25
		decimais[0]=1.50;
		decimais[1]=2.75;
		decimais[2]=5.00;
		decimais[3]=3.25;
	
		
		for(int i =0; i <= 3; i++){
		   soma+=decimais[i];
		}
		
		System.out.println("A soma dos valores é " + soma);
	}
}
