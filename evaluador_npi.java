package polca_inver;

public class evaluador_npi {
	private pila pil;
	private String []NPI;
	private int tam;
	
	public evaluador_npi(String []npi) {
		NPI = npi;
		tam = NPI.length;
		pil = new pila(tam);
	}
	public double evaluar() {
		int x = 0 ;
		double a,b;
		while(x!= tam) {
			switch(NPI[x]) {
			case "+":
				if(!pil.empty()) {
					a = pil.pop();
					if(!pil.empty()) {
						b = pil.pop();
						pil.push(a+b);
					}else {
						pil.push(1*a);
					}
				}
				break;
			case "-":
				if(!pil.empty()) {
					a = pil.pop();
					if(!pil.empty()) {
						b = pil.pop();
						pil.push(b-a);
					}else {
						pil.push(-1*a);
					}
				}
				break;
			case "*":
				if(!pil.empty()) {
					a = pil.pop();
					if(!pil.empty()) {
						b = pil.pop();
						pil.push(a*b);
					}
				}
				break;
			case "/":
				if(!pil.empty()) {
					a = pil.pop();
					if(!pil.empty()) {
						b = pil.pop();
						pil.push(b/a);
					}
				}
				break;
			case "~":
				if(!pil.empty()) {
					a = pil.pop();
					if(!pil.empty()) {
						b = pil.pop();
						pil.push(Math.pow(b,a));
					}
				}
				break;
			case "&":
				if(!pil.empty()) {
					a = pil.pop();
					pil.push(-1*a);
				}
				break;
			case "tan":
				if(!pil.empty()) {
					a = pil.pop();
					pil.push(Math.tan(a));
				}
				break;
			case "sen":
				if(!pil.empty()) {
					a = pil.pop();
					pil.push(Math.sin(a));
				}
				break;
			case "sqrt":
				if(!pil.empty()) {
					a = pil.pop();
					pil.push(Math.sqrt(a));
				}
				break;
			default:
				a = Double.parseDouble(NPI[x]);
				pil.push(a);
				break;
			}
			x++;
		}
		return pil.pop();
	}
}
