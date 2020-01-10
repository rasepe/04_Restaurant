import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args) {
		/*
		 * L’exercici consisteix a mostrar per consola una carta d’un restaurant on
		 * afegirem diferents plats i després escollirem que volem per menjar. Un cop
		 * fet això s’haurà de calcular el preu del menjar el programa ens dirà amb
		 * quins bitllets hem de pagar.
		 */

		/*
		 * FASE 1 (2 punts)
● Creeu una variable int per cada un dels bitllets que existeixen des de 5€ a 500€, haureu de crear un altre
variable per guardar el preu total del menjar. (1 punt)
● Creeu dos arrays, un on guardarem el menú (5 plats) i un altre on guardarem el preu de cada
plat. (1 punt)
		 */
		int bitllet5 = 5;
		int bitllet10 = 10;
		int bitllet20 = 20;
		int bitllet50 = 50;
		int bitllet100 = 100;
		int bitllet200 = 200;
		int bitllet500 = 500;

		int preu = 0;

		String[] menu = new String[5];

		int[] preus = new int[5];

		/*
		 * FASE 2 (3 punts) ● Amb un bucle for haurem d’omplir els dos arrays
		 * anteriorment creats. Afegirem el nom del plat i després el preu. (1 punt) ●
		 * Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per
		 * menjar, guardarem la informació en una List fent servir un bucle while. (1
		 * punt) ● Haurem de preguntar si es vol seguir demanant menjar. Podeu fer
		 * servir el sistema (1:Si / 0:No), per tant haureu de crear un altre variable
		 * int per guardar la informació. (1 punt)
		 */
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<menu.length; i++) {

			System.out.println("Introdueix nom plat " + (i+1) +":");
			menu[i] = sc.next();
			
			System.out.println("Introdueix preu plat " + (i+1) +" (núm. enter):");
			preus[i] = sc.nextInt();
		
		}


		for (int i=0; i<menu.length; i++) {
			
			System.out.println("Plat " + (i+1) + ": " + menu[i] + ". Preu: " + preus[i]);

		}
        boolean seguirdemanant = true;
        String platdemanat = "";
        List<String> comanda = new ArrayList<String>(); 
        String resposta = "";
		while (seguirdemanant == true) {
			System.out.println("Quin plat vols?:");
			platdemanat = sc.next();
			comanda.add(platdemanat);
			System.out.println("Vols seguir demanant (S/N) ?:");
			resposta = sc.next();
			if (resposta.equals("N")) {
				seguirdemanant = false;
			}
			
		}
		
		/*
		 * FASE 3 (5 punts) ● Un cop hem acabat de demanar el menjar, haurem de comparar
		 * la llista amb l’array que hem fet al principi. En el cas que la informació
		 * que hem introduït a la List coincideixi amb la del array, haurem de sumar el
		 * preu del producte demanat; en el cas contrari haurem de mostrar un missatge
		 * que digui que el producte que hem demanat no existeix.
		 */
		
		//recorrem arraylist
		
		Iterator<String> it = comanda.iterator();
		boolean coincidencia = false;
		//llegir plat:
		while(it.hasNext()){
		    String platcomparar = it.next();
		    //si està al menú, anem sumant el preu:
		    for (int i=0; i<menu.length; i++) {
		    	if (platcomparar.equals(menu[i])) {
		    		preu += preus[i];
		    		coincidencia = true;
		    	}
		    }
		    //si no està al menú, avisem:
		if (coincidencia == false) {
			System.out.println("No existeix el plat " + platcomparar);
		}
		}
		System.out.println("El preu total dels plats demanats és: " + preu);
		int quantitatBitllet500 = 0;
		int quantitatBitllet200 = 0;
		int quantitatBitllet100 = 0;
		int quantitatBitllet50 = 0;
		int quantitatBitllet20 = 0;
		int quantitatBitllet10 = 0;
		int quantitatBitllet5 = 0;
		int canvi = 0;
		
		if (preu >= bitllet500) {
			quantitatBitllet500 = preu / bitllet500;
			//System.out.println("Hem d'utilitzar " + quantitatBitllet500 + " bitllets de 500");
			preu = preu - (quantitatBitllet500 * bitllet500);
			//System.out.println("Resten per pagar " + preu + " euros");
		}
		if (preu >= bitllet200) {
			quantitatBitllet200 = preu / bitllet200;
			//System.out.println("Hem d'utilitzar " + quantitatBitllet200 + " bitllets de 200");
			preu = preu - (quantitatBitllet200 * bitllet200);
			//System.out.println("Resten per pagar " + preu + " euros");
		}
		if (preu >= bitllet100) {
			quantitatBitllet100 = preu / bitllet100;
			//System.out.println("Hem d'utilitzar " + quantitatBitllet100 + " bitllets de 100");
			preu = preu - (quantitatBitllet100 * bitllet100);
			//System.out.println("Resten per pagar " + preu + " euros");
		}
		if (preu >= bitllet50) {
			quantitatBitllet50 = preu / bitllet50;
			//System.out.println("Hem d'utilitzar " + quantitatBitllet50 + " bitllets de 50");
			preu = preu - (quantitatBitllet50 * bitllet50);
			//System.out.println("Resten per pagar " + preu + " euros");
		}
		if (preu >= bitllet20) {
			quantitatBitllet20 = preu / bitllet20;
			//System.out.println("Hem d'utilitzar " + quantitatBitllet20 + " bitllets de 20");
			preu = preu - (quantitatBitllet20 * bitllet20);
			//System.out.println("Resten per pagar " + preu + " euros");
		}
		if (preu >= bitllet10) {
			quantitatBitllet10 = preu / bitllet10;
			//System.out.println("Hem d'utilitzar " + quantitatBitllet10 + " bitllets de 10");
			preu = preu - (quantitatBitllet10 * bitllet10);
			//System.out.println("Resten per pagar " + preu + " euros");
		}
		if (preu >= bitllet5) {
			quantitatBitllet5 = preu / bitllet5;
			//System.out.println("Hem d'utilitzar " + quantitatBitllet5 + " bitllets de 5");
			preu = preu - (quantitatBitllet5 * bitllet5);
			//System.out.println("Resten per pagar " + preu + " euros");
		}
		if (preu > 0) {
			quantitatBitllet5++;
			canvi = 5 - preu;
		}
		System.out.println("Hem d'utilitzar " + quantitatBitllet500 + " bitllets de 500");
		System.out.println("Hem d'utilitzar " + quantitatBitllet200 + " bitllets de 200");
		System.out.println("Hem d'utilitzar " + quantitatBitllet100 + " bitllets de 100");
		System.out.println("Hem d'utilitzar " + quantitatBitllet50 + " bitllets de 50");
		System.out.println("Hem d'utilitzar " + quantitatBitllet20 + " bitllets de 20");
		System.out.println("Hem d'utilitzar " + quantitatBitllet10 + " bitllets de 10");
		System.out.println("Hem d'utilitzar " + quantitatBitllet5 + " bitllets de 5");
		System.out.println("El canvi que ens retornen és " + canvi + " euros");
		
		System.out.println("FI DEL PROGRAMA");
		sc.close();
	}


}
