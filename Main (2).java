/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
//Depois vai ser preciso perguntar quantas linguagens de programação a pessoa domina e depois quais são essas linguagens.
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de pessoas entrevistadas: ");
		int Entrevistados = input.nextInt();

		String domina [][] = new String[Entrevistados][];
		
		
		for (int i = 0; i < domina.length; i++) {
		    
		    System.out.println("Quantas linguagens de programação domina a pessoa "+ (i+1) +" ?");
		    int linguagem = input.nextInt();
		    
		    domina[i] = new String[linguagem];
		    
		    for (int j = 0; j < domina[i].length; j++) {
		        System.out.println("Digite a linguagem " + (j+1));
		        
		        domina[i][j] = input.next();
		    }
        }
        
        for (int i = 0; i < domina.length; i++) {
            
            System.out.println("Pessoa " + i + " conhece " + domina[i].length + " linguagens");
            
            for (int j = 0; j < domina[i].length; j++) {
            
                System.out.println(domina[i][j]);
            
                
            }
        }
        
		input.close();
	}
}




