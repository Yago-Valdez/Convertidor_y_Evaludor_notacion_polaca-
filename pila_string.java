package polca_inver;
public class pila_string {
	private String []pila;
	private int top;
	private int tam;
	public pila_string(int tam) {
		this.tam = tam;
		pila = new String[tam];
		top = -1;
	}
	public int getTop() {
		return top;
	}
	public void push(String dato) {
		top++;
		pila[top] = dato;
	}
	public String pop() {
		top--;
		
		return(pila[top+1]);
	}
	public boolean empty() {
		return (top == -1);
	}
	public boolean full() {
		return (top == tam-1);
	}
	public String []getPila(){
		return pila;
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
