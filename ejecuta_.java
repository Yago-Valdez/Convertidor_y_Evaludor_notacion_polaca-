package polca_inver;

import java.util.Scanner;

public class ejecuta_ {

	public static void main(String[] args) {
		System.out.println("- unitario = &, sen(numero),tan(numero),exponencial = base~exponente, los parentesis no indican multiplicacion solo agrupacion");
		
		conversion_ r = new conversion_();
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese la expresion :  ");
		String expresion = leer.nextLine();
		System.out.println(r.geOexpre());
		System.out.println("Separando exprecion");
		r.conversion(expresion);
		r.m_conversion();
		String expresion_[] = r.getExpresion_();
		polaca_inver j = new polaca_inver(expresion_);
		
		//r.m_conversion();
		
		String expresion_1[] = j.com_polaca_inver();
		System.out.print("Expresion polca inversa");
		j.mostrarNPI();
		evaluador_npi s = new evaluador_npi(expresion_1);
		System.out.print("La notacion polaca evaluada = ");
		System.out.println(s.evaluar());
		
	}

}
