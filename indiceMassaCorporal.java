package índiceDemassaCorporal;
import java.util.Scanner;
public class indiceMassaCorporal {
	public static void main(String[]args) {
		double altura = 0;
		double peso = 0;
		
		Scanner ler1 = new Scanner(System.in);
		
			System.out.print("Olá, por favor digite o seu peso: ");
		 		peso = ler1.nextDouble(); 
		 	System.out.println("Muito obrigado.");
		 	System.out.print("Agora digite sua altura por favor; ");
		 		altura = ler1.nextDouble();
		 	double IMC = peso / (altura * altura);
		 	System.out.println("Seu indice de massa corporal é: "+ IMC);
		 	
		
		 	
		}
	

}
