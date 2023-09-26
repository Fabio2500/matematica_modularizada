import java.util.Scanner;

class Calculo_geometria{
	public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
      FormulasEinterface geometria = new FormulasEinterface();
      Volumes vol = new Volumes();
      
      int escolha,opc;
      
      System.out.println("\n");
      System.out.println("formas geometricas disponiveis:");
      geometria.mostrar_escolha();
      System.out.println("digite qual forma deseja calcular:");
      escolha = sc.nextInt();
      geometria.forma_escolhida(escolha);
      geometria.calculos_formas(escolha);
      
    if(escolha == 2 || escolha == 4){
        System.out.println("deseja que mostre multiplicando por pi direto?(1 para sim e 0 para nao)");
        opc = sc.nextInt();
        if(opc==0){
            geometria.mostrar_inteiro();
        }else{
            geometria.mostrar();
        }
    }

    if(escolha == 5){
        geometria.mostrar_esfera();
    }
      




    if(escolha!=2 && escolha != 4 && escolha != 5){
        geometria.mostrar();
    }
    
      



    }
}