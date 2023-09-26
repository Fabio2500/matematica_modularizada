class Volumes{
	double volume;


    public double volume_cubo(float aresta){
    		volume = Math.pow(aresta,3);
    		System.out.println("volume do cubo:" + this.volume);
        return volume;
    }
    public double volume_cone(float raio,float altura){
       volume =  (Math.PI * Math.pow(raio,2) * altura)/3;
        System.out.println("volume do cone:" + this.volume/Math.PI);
        System.out.println("volume se multiplicar direto por pi:" + this.volume);
        return volume;
      }
      public double volume_piramide(double area_base,float altura){
        volume = (area_base * altura)/3;
        System.out.println("volume da piramide:" + volume);
        return volume;
      }
      public double volume_cilindro(float raio,float altura){
        volume = Math.PI * Math.pow(raio,2) * altura;
        System.out.println("volume do cilindro:" + this.volume/Math.PI);
        System.out.println("volume se  multiplicar direto por pi:" + this.volume);
        return volume;
      }
      public double volume_esfera(float raio){
        volume = 4 * Math.PI * Math.pow(raio,3)/3;
        System.out.println("volume da esfera:" + this.volume/Math.PI);
        System.out.println("volume se multiplicar direto por pi:"+ this.volume);
        return volume;
      }
  
}