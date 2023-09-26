import java.util.Scanner;

class FormulasEinterface{
     Scanner sc = new Scanner(System.in);
     Volumes vol = new Volumes();
     double area_total,area_lateral,area_base,geratriz,geratriz_real,area_base_lateral,i,area_base2;
     float raio,altura,b ;
     int bl,escolha_base,option;
        
     public void mostrar_escolha(){
     	System.out.println("1-cubo");
     	System.out.println("2-cone");
     	System.out.println("3-piramide");
     	System.out.println("4-cilindro");
     	System.out.println("5-esfera");
     }
      public void mostrar_esfera(){
       System.out.println("area da esfera:" + this.area_total/Math.PI);
       System.out.println("area se multiplicar por pi direto:" + this.area_total);
      }
      
      public void mostrar_inteiro(){
     System.out.println("area total:" + this.area_total/Math.PI);
     System.out.println("area lateral:" + this.area_lateral/Math.PI);
     System.out.println("area_base:" + this.area_base/Math.PI);

      }


     public void mostrar(){
     System.out.println("area total:" + this.area_total);
     System.out.println("area lateral:" + this.area_lateral);
     System.out.println("area_base:" + this.area_base);
     }

     public void forma_escolhida(int escolha){
     	if(escolha == 1){
     		System.out.println("forma escolhida:cubo");
     	}
     	if(escolha == 2){
     		System.out.println("forma escolhida:cone");
     	}
     	if(escolha == 3){
     		System.out.println("forma escolhida:piramide");
     	}
     	if(escolha == 4){
     		System.out.println("forma escolhida:cilindro");
     	}
     	if(escolha == 5){
     		System.out.println("forma escolhida:esfera");
     	}
     }

     public double calculos_formas(int escolha){
     	float aresta;
     	if(escolha == 1){
     	     System.out.println("digite o valor da aresta:");
            aresta = sc.nextFloat();
            area_total = 6 * Math.pow(aresta,2);
            area_lateral = 4 * Math.pow(aresta,2);
            area_base = Math.pow(aresta,2);
            vol.volume_cubo(aresta);
           }
       if(escolha == 2){
              System.out.println("digite o valor do raio:");
              raio = sc.nextFloat();
              System.out.println("digite o valor da altura:");
              altura = sc.nextFloat();
              geratriz = Math.pow(raio,2) + Math.pow(altura,2);
              geratriz_real = Math.sqrt(geratriz);
              System.out.println("geratriz:" + geratriz_real);
              area_base = Math.PI * Math.pow(raio,2);
              area_lateral = Math.PI * raio * geratriz_real;
              area_total = Math.PI * raio *(geratriz_real + raio);
              vol.volume_cone(raio,altura);

       }
       if(escolha == 3){
              System.out.println("digite o valor da altura:");
              altura = sc.nextFloat();
              System.out.println("digite o valor do lado da base:");
              b = sc.nextFloat();
              System.out.println("digite o numero de lados da base:");
              bl = sc.nextInt();
              area_base_lateral = (b*altura)/2;
              area_lateral = area_base_lateral*bl;
              System.out.println("qual tipo de base?");
              System.out.println("1-triangular\n2-quadrada\n3-retangular\n");
              System.out.println("digite o numero do tipo:");
              escolha_base = sc.nextInt();
              switch(escolha_base){
              case 1:
                     System.out.println("eh um triangulo equilatero?(1 para sim 0 para nao):");
                     escolha_base = sc.nextInt();
                     if(escolha_base == 1){
                            i = Math.pow(b,2) * Math.sqrt(bl);
                            area_base = i/4;
                            area_total = area_base + area_lateral;
                            vol.volume_piramide(area_base,altura);

                     }else{
                     area_base = b*altura/2;
                     area_total = area_base + area_lateral;
              }
                     break;
              case 2:
                     area_base = Math.pow(bl,2);
                     area_total = area_base + area_lateral;
                       System.out.println("a area da base pra calcular o volume eh esta mesmo?(1 para sim e 0 para nao)");
                     option =sc.nextInt();
                     if(option == 1){
                     vol.volume_piramide(area_base,altura);
               }else{
                     System.out.println("digite o valor que vai usar para calcular o volume");
                     area_base2 = sc.nextDouble();
                     vol.volume_piramide(area_base2,altura);
               }
                     break;
              case 3:
                     area_base = b*altura;
                     area_total = area_base + area_lateral;
                     vol.volume_piramide(area_base,altura);
                     break;
              }
              
       }
              
              if(escolha == 4){
                     System.out.println("digite o valor do raio:");
                     raio = sc.nextFloat();
                     System.out.println("digite o valor da altura:");
                     altura = sc.nextFloat();
                     area_base = Math.PI * Math.pow(raio,2);
                     area_lateral = 2 * Math.PI * raio * altura;
                     area_total = 2*area_base + area_lateral;
                     vol.volume_cilindro(raio,altura);

              }
              if(escolha == 5){
                     System.out.println("digite o valor do raio:");
                     raio = sc.nextFloat();
                     area_total = 4 * Math.pow(raio,2) * Math.PI; 
                     vol.volume_esfera(raio);
              }
            
              

       

       return area_total;
     }




}