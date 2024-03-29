package miPrincipal;

public class Numerote {
	
	private int numeros[];
	private int tamanio;
    

    public Numerote(){
    	numeros=new int[1];
        tamanio=0;
    }
    
    public Numerote(int[] n) {
        this.numeros=n;
        tamanio=numeros.length;
    }
    
    public Numerote(int n) {
    	String cadenaValor = String.valueOf(n);
    	// Convertir la cadena a un array de dígitos
    	
        numeros = new int[cadenaValor.length()];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = cadenaValor.charAt(i) - '0';
        }
    	
    }
    public Numerote(String n) {
    	// Convertir la cadena a un array de dígitos
        numeros = new int[n.length()];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = n.charAt(i) - '0';
        }
    }
    public int getTamanio() {
    	return tamanio;
    }
    public int[] getNumero() {
    	return numeros;
    }
    
    public Numerote suma(Numerote b) {
    	// Crear un array para almacenar el resultado de la suma
    	//El tamaño dependerá de la cadena mas larga
        

        // Llevar la cuenta del acarreo
        

        // Recorrer los dígitos de ambos números de derecha a izquierda
        
       

        // Si hay acarreo, agregarlo al resultado
        
        

        // Crear un nuevo Numerote con el resultado
        c=eliminarCerosIzquierda(c);
        return new Numerote(c);
    }
    
    public Numerote resta(Numerote b) {
    	
    	 // Crear un array para almacenar el resultado de la resta
    	

    	 // Llevar la cuenta del préstamo
    	 

    	 // Recorrer los dígitos de ambos números de derecha a izquierda
    	 

    	 // Eliminar los ceros a la izquierda
    	 
    	r= eliminarCerosIzquierda(r);

    	 // Crear un nuevo Numerote con el resultado
    	 return new Numerote(r);
    	

    }
    private int[] eliminarCerosIzquierda(int[] r ) {
    	 
   	     
   	    StringBuilder nuevaCadena = new StringBuilder();
   

        int j=0;
   	    while(r[j]==0)
   		    j++;
    	  
   	    for (int i=j;i<=r.length-1;i++) 
             nuevaCadena.append(r[i]);
                
        
    	String nCadena = nuevaCadena.toString();
    	
    	char[] caracteres = nCadena.toCharArray();
    	
    	
    	int[] numerosInt = new int[caracteres.length];

    	for (int i = 0; i < caracteres.length; i++) {
    	    numerosInt[i] = caracteres[i] - '0';
    	}
    	
    	return numerosInt;
    	
    }
   
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();

		for (int numero : numeros) {
		    builder.append(numero);
		}

		String cadena = builder.toString();
		return cadena;
	}
    
    
	

}

