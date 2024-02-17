package miPrincipal;
import java.util.Scanner;
public class Poligono {
	private int N;
	private Punto arreglo[];
	
	public Poligono(int N) {
		//Colocar aquí el código faltante
	}
	public void LeerDatos() {
		Scanner entrada = new Scanner(System.in);
		for (int i=0;i<this.arreglo.length-1;i++) {
			System.out.print("Dame coordenada(x) de vertice"+(i+1)+":");
			int valorX=entrada.nextInt();
			System.out.print("Dame coordenada(y) de vertice"+(i+1)+":");
			int valorY=entrada.nextInt();
			Punto punto = new Punto(valorX,valorY);
			this.arreglo[i]=punto;
		}
		this.arreglo[N]=this.arreglo[0];	
	}
	public void DesplegarArreglo() {
		for (int i=0;i<this.arreglo.length-1;i++) {
			System.out.print("Vertice"+(i+1)+" x ="+
		            this.arreglo[i].getX()+"   ");
			System.out.println(" y ="+
		            this.arreglo[i].getY());
			
		}
	}
	public double calcularPerimetro() {
		//colocar aquí el código faltante
	}
	

}
