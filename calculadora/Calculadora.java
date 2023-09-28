import java.util.Scanner;

class Calculadora{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		InterfaceEoperacoes calc = new InterfaceEoperacoes();
        int escolha,escolha2,opc_cont;
        opc_cont = 1;
        while(opc_cont !=0){
        calc.menu();
        escolha = sc.nextInt();
        calc.escolha_tipo();
        escolha2 = sc.nextInt();
        if(escolha2==1){

        switch(escolha){
        case 1:
        	System.out.println("digite o primeiro valor:");
        	calc.num1 = sc.nextInt();
        	System.out.println("digite o segundo valor:");
        	calc.num2 = sc.nextInt();
        	calc.soma();
        	System.out.println("soma:" + calc.soma());
        	break;
        case 2:
        	System.out.println("digite o primeiro valor:");
        	calc.num1 = sc.nextInt();
        	System.out.println("digite o segundo valor:");
        	calc.num2 = sc.nextInt();
        	calc.subt();
        	System.out.println("subtracao:" + calc.subt());
        	break;
        case 3:
        	System.out.println("digite o primeiro valor:");
        	calc.num1 = sc.nextInt();
        	System.out.println("digite o segundo valor:");
        	calc.num2 = sc.nextInt();
        	calc.mult();
        	System.out.println("multiplicacao:" + calc.mult());
        	break;
        case 4:
        	System.out.println("digite o primeiro valor:");
        	calc.num1 = sc.nextInt();
        	System.out.println("digite o segundo valor:");
        	calc.num2 = sc.nextInt();
        	calc.div();
        	System.out.println("divisao:"+ calc.div());
        	break;

        }
    }else{
    	switch(escolha){
    	case 1:
    		System.out.println("digite o primeiro valor(flutuante)");
    		calc.Num1 = sc.nextFloat();
    		System.out.println("digite o segundo valor(flutuante)");
    		calc.Num2 = sc.nextFloat();
    		calc.Soma();
    		System.out.println("Soma de flutuantes:"+ calc.Soma());
    		break;
    	case 2:
    		System.out.println("digite o primeiro valor(flutuante)");
    		calc.Num1 = sc.nextFloat();
    		System.out.println("digite o segundo valor(flutuante)");
    		calc.Num2 = sc.nextFloat();
    		calc.subtracao();
    		System.out.println("subtracao de flutuantes:" + calc.subtracao());
    		break;
    	case 3:
    		System.out.println("digite o primeiro valor(flutuante)");
    		calc.Num1 = sc.nextFloat();
    		System.out.println("digite o segundo valor(flutuante)");
    		calc.Num2 = sc.nextFloat();
    		calc.multiplicacao();
    		System.out.println("multiplicacao de flutuantes:"+calc.multiplicacao());
    		break;
    	case 4:
    		System.out.println("digite o primeiro valor(flutuante)");
    		calc.Num1 = sc.nextFloat();
    		System.out.println("digite o segundo valor(flutuante)");
    		calc.Num2 = sc.nextFloat();
    		calc.divisao();
    		System.out.println("divisao de flutuantes:" + calc.divisao());

    	}
    }
    System.out.println("deseja continuar? 1 para sim e 0 para nao");
    opc_cont = sc.nextInt();

}

	}
}