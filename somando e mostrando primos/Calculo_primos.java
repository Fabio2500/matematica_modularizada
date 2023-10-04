class Calculo_primos{
	int numero;
    int primos;


     public void mostrar(){
     System.out.println(primo());
     }
     public boolean primo(){
       for(int j = 2; j < numero ; j++){
       	 if(numero % j == 0){
            return false;
       	   }
       	} 	
      return true;       	 	
     }
}