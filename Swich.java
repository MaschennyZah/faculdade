import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número do mês (1 a 12): ");
		int trimestre = input.nextInt();
		
		switch(trimestre) {
		case 1:
			System.out.println("Primeiro trimestre");
			break;
		case 2:
			System.out.println("Primeiro trimestre");
			break;
		case 3:
			System.out.println("Primeiro trimestre");
			break;
		case 4:
			System.out.println("Segundo trimestre");
			break;
		case 5:
			System.out.println("Segundo trimestre");
			break;
		case 6:
			System.out.println("Segundo trimestre");
			break;
		case 7:
			System.out.println("Terceiro trimestre");
			break;
		case 8:
			System.out.println("Terceiro trimestre");
			break;
		case 9:
			System.out.println("Terceiro trimestre");
			break;
		case 10:
			System.out.println("Quarto trimestre");
			break;
		case 11:
			System.out.println("Quarto trimestre");
			break;
		case 12:
			System.out.println("Quarto trimestre");
			break;
		}
		
		
		input.close();
	}
}



