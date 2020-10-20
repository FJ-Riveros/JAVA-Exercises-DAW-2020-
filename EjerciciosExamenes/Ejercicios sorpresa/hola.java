public class EjemploBucles04{
	public static void main( String args[] ){
	
		double n, k, exp;
		k = 1;
		System.WriteLine("\n\tintroduce un numero");
		
		n = double.parseDouble(System.console().readLine());
		System.WriteLine("\n\npotencia \t\televado a la potencia \t\t\tresultado");
		
		while (k <= n)
		{
			exp = Math.Pow(k, k);
			
			System.Write("\n(0) \t\t\t(1) \t\t\t\t(2)", k, k, exp);
			k = k + 1;
			}
	
			System.Readline();
	}	
