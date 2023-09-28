class InterfaceEoperacoes{
	int num1,num2;
	float Num1,Num2;



   public void escolha_tipo(){
    System.out.println("deseja trabalhar com numeros flutuantes ou inteiros?");
    System.out.println("digite 1 para inteiros e 0 para flutuantes");
   }

   public void menu(){
   	System.out.println("escolha qual calculo vai fazer:");
   	System.out.println("1-soma\n2-subtracao\n3-multiplicacao\n4-divisao\n");
   	System.out.println("digite o numero da sua escolha:");
   }

     

   


	public int soma(){
        return num1 +num2;
      }

    public Float Soma(){
    	return Num1 + Num2;
    }

    public int subt(){
    	return num1 - num2;
    }
    public float subtracao(){
    	return Num1-Num2;
    }
    public int div(){
    	return num1/num2;
    }
    public float divisao(){
    	return Num1/Num2;
    }
    public int mult(){
    	return num1*num2;
    }
    public float multiplicacao(){
    	return Num1*Num2;
    }
}