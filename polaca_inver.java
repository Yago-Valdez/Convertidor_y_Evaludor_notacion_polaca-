package polca_inver;

public class polaca_inver {
		private int  n_elem; //elementos de la expresion 
		private String s_elem[];
		private pila_string pil;
		private String []NPI;
		public polaca_inver(String []es) {
			s_elem = es;
			n_elem = es.length;
			pil = new pila_string(n_elem);
			NPI = new String[n_elem];
		}
		public String []com_polaca_inver() {
			int x = 0;
			int r = 0;
			int par = 0;
			String []ex_polaca;
			String aux,aux2;
			while(x != n_elem) {
				switch(s_elem[x]) {
					case "+":
					case "-":
						
						if(!pil.empty()) {
							aux = pil.pop();
							System.out.println(aux);
							if(aux.equals("*") || aux == "/" || aux == "sen" || aux =="tan" || aux == "&" || aux == "~") {
								System.out.println(aux);
								NPI[r] = aux;
								r++;
								pil.push(s_elem[x]);
							}else {
								pil.push(aux);
								pil.push(s_elem[x]);
							}
						}else {
							pil.push(s_elem[x]);
						}
						break;
					case "*":
					case "/":
						if(!pil.empty()) {
							aux = pil.pop();
							if(aux == "+"|| aux == "-") {
								NPI[r] = aux;
								r++;
								pil.push(s_elem[x]);
							}else {
								pil.push(aux);
								pil.push(s_elem[x]);
							}
						}else {
							pil.push(s_elem[x]);
						}
						break;
					case "sqrt":
					case "~":
						if(!pil.empty()) {
							aux = pil.pop();
							if(aux == "+"|| aux == "-") {
								NPI[r] = aux;
								r++;
								pil.push(s_elem[x]);
							}else {
								pil.push(aux);
								pil.push(s_elem[x]);
							}
						}else {
							pil.push(s_elem[x]);
						}
						break;
					case "sen":
					case "&":
					case "tan":
						if(!pil.empty()) {
							aux = pil.pop();
							if(aux == "+"|| aux == "-" || aux == "/" ||aux == "*" ){
								pil.push(s_elem[x]);
							}else {
								pil.push(aux);
								pil.push(s_elem[x]);
							}
						}else {
							pil.push(s_elem[x]);
						}
						break;
					case "(":
						par ++;
						pil.push("(");
						break;
					case ")":
						if(!pil.empty()) {
							aux = pil.pop();
							if(aux != "(") {
								NPI[r] = aux;
								r++;
							}else {
								
							}
						}
						par++;
						break;
					default:
						NPI[r] = s_elem[x];
						r++;
						break;
				}
				x++;
			}
			
			aux ="";
			while(!pil.empty()) {
				aux  =  pil.pop();
				if(aux != "(") {
					NPI[r] = aux;
					r++;
				}
			}
			
			n_elem = n_elem -par;
			ex_polaca = new String[n_elem];
			for(int z = 0; z < n_elem;z++) {
				ex_polaca[z] = NPI[z];
			}
			return(ex_polaca);
		}
		public void mostrarNPI() {
			System.out.println("");
			for(int z = 0; z < n_elem;z++) {
				System.out.print(NPI[z]);
				if(z!=(n_elem-1)) {
					System.out.print(",");
				}
			}
			System.out.println("");
		}
}
