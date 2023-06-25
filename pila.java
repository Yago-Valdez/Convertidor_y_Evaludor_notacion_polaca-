package polca_inver;

public class pila {
	private double []pila;
	private int top;
	private int tam;
	
	public pila(int tam) {
		this.tam = tam;
		pila = new double[tam];
		top = -1;
	}
	public int getTop() {
		return top;
	}
	public void push(double numero) {
		top++;
		pila[top] = numero;
	}
	public double pop() {
		top--;
		return(pila[top+1]);
	}
	public boolean empty() {
		return (top == -1);
	}
	public boolean full() {
		return (top == tam-1);
	}
	public void muestrapila() {
		int aux = top;
		while(!empty()){
			System.out.print(" || ");
			System.out.print(pila[top]);
			System.out.println(" || ");
			top--;
		}
		System.out.println("___________");
		top = aux;
	}
}
