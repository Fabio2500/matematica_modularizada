class JurosSimplesEcomposto{
	float taxa;
	float capital_inicial;
	int tempo;

    public void mostrar_simples(){
    	System.out.println("o montande com base no juros simples:" + juros_simples());
    }
    public void mostrar_composto(){
    	System.out.println("o montante com base no juros composto:"+ juros_compostos());
    }

	public float juros_simples(){
		return this.capital_inicial * this.taxa/100 * this.tempo;
	}
	public double juros_compostos(){
		return this.capital_inicial * Math.pow((1+this.taxa/100),this.tempo);
	}
	
}
