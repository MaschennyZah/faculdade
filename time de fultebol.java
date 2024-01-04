/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("digite o nome do time: ");
		String nome_Time_Futebol = input.next();
		
		System.out.println("Digite a data da fundação: ");
		String data_Fund = input.next();
		
		System.out.println("Digite o nome do mascote: ");
		String nome_Mascote = input.next();
		
		System.out.println("Digite a quantidade de jogadores: ");
		int n_Jogadores = input.nextInt();
		
		System.out.println("Digite o nome do estadio: ");
		String nome_Estadio = input.next();
		
		System.out.println("Seu time é " + nome_Time_Futebol);
		System.out.println("foi fundado em " + data_Fund);
		System.out.println("O mascote é " + nome_Mascote);
		System.out.println("Possui " + n_Jogadores + " Jogadores");
		System.out.println("Joga no estadio " + nome_Estadio);
		input.close();
	}
}


