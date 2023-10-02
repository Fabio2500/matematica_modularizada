import java.util.Scanner;
class Juros{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		JurosSimplesEcomposto j = new JurosSimplesEcomposto();
		int opc;

		System.out.println("digite o valor do capital inicial:");
		j.capital_inicial = sc.nextFloat();
		System.out.println("digite o valor da taxa:");
		j.taxa = sc.nextFloat();
		System.out.println("digite o periodo de tempo:");
		j.tempo = sc.nextInt();

		System.out.println("juros simples ou composto?");
		System.out.println("digite 1 para simples");
		System.out.println("digite 2 para composto");
		opc = sc.nextInt();

		if(opc == 1){
			j.mostrar_simples();
		}
		if(opc==2){
			j.mostrar_composto();
		}

	}

}
