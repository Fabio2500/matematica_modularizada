import java.util.Scanner;

class Primos{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Calculo_primos p = new Calculo_primos();
		Calculo_primos primo[];
		int soma=0;
		System.out.println("digite a quantidade de numeros que deseja trabalhar");
		 primo = new Calculo_primos[sc.nextInt()];
        
        for(int i = 0; i < primo.length;i++){
        	primo[i] = new Calculo_primos();
        	System.out.println("digite o item "+ (i+1));
        	primo[i].numero = sc.nextInt();
        	if(primo[i].primo() == true){
        		soma+=primo[i].numero;
        		primo[i].primos = primo[i].numero;
        	}
        }
        
        System.out.println("\n");
        for(int i = 0; i < primo.length;i++){
        	if(primo[i].primo() == true){
        	System.out.println(primo[i].primos + " é primo");
           }        	
        	
        }
        System.out.println("soma dos primos: "+ soma);
       

	}
}