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
		int bitllet1 = 5;
		int bitllet2 = 10;
		int bitllet3 = 20;
		int bitllet4 = 50;
		int bitllet5 = 100;
		int bitllet6 = 200;
		int bitllet7 = 500;

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
			
			System.out.println("Introdueix preu plat " + (i+1) +" (enter):");
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
		
		
		
		System.out.println("FI DEL PROGRAMA");
		sc.close();
	}


}
