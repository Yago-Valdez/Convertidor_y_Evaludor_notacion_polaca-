package polca_inver;


public class conversion_ {
	private String expresion_1;
	private String []expresion_ ;
	private int tam;
	
	public conversion_() {
		expresion_1 = "";
		tam = 0;
	}
	public void setTamEx_(int tam) {
		tam++;
		expresion_ = new String[tam];
	}
	public void conversion(String expresion) {
		expresion_1 = expresion;
		expresion= expresion + ")";
		tam = expresion.length()-1;
		setTamEx_(tam);
		int x = 0;
		int incremento = 0;
		char caracter;
		String aux = "";
		while(x != tam+1) {
			caracter = expresion.charAt(x);
			if(caracter != '-' && caracter != '+' && caracter != '/' && caracter != '*' && caracter != '(' && caracter != ')' && caracter != ',' && caracter != '&' && caracter != '~'  ) {
				aux = aux + caracter;
				x++;
			}else {
				if(aux!= "") {
					expresion_[incremento] = aux;
					incremento++;
					aux = "";
				}
				expresion_[incremento] = caracter +"";
				incremento++;
				x++;
			}
		}
		expresion_[incremento-1] = null;
	}
	public String geOexpre() {
		return expresion_1;
	}
	public String  [] getExpresion_() {
		int z;
		for(z = 0; expresion_[z] != null;z++){}
		String aux[] = new String[z];
		for(int x = 0; x<z;x++){
				aux[x] = expresion_[x];
		}
		return aux;
	}
	public void m_conversion() {
		for(int z = 0; expresion_[z] != null;z++) {
			System.out.print(expresion_[z] + ",");
		}
		System.out.println("");
	}
}
