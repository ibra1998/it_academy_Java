package ejercicio4;
import java.util.ArrayList;

public class Fase3 {
	static void ejecutar(ArrayList<String> comidaPedida/*, String[] comida, int[] precios*/) {
		
		boolean platoExiste;
		int i;
		int cuenta = Fase1.precioTotal;//We get the variable int on Fase1
		for (String plato: comidaPedida) {//I want to loop over every dish on mn the food listed
			platoExiste = false;//If I don't find the dish, it will be false
			i = 0;
			while( i < Fase1.platos.length && !platoExiste) {//I loop over all my menu
			    //This will check if in this position , my dish on the menu and the ordered are the same
				if (Fase1.platos[i].equalsIgnoreCase(plato)) {
					cuenta += Fase1.precios[i];
					platoExiste = true;
					System.out.println(plato + " : " + Fase1.precios[i]);
				}
				i++;
			}
			if (!platoExiste) {
				System.out.println("Disculpe, no tenemos " + plato + " en el menu");//If I don't find the dish, I will print this
			}
		}
		//This is my "ticket", where I show the total amount to pay, and the banknotes you should use
		System.out.println("Total.........." + cuenta + " �");
		System.out.println("Billletes de 500: " + cuenta/Fase1.billete500 );
		//I must pay only the rest with lower valued banknotes
		System.out.println("Billletes de 200: " + (cuenta%Fase1.billete500)/Fase1.billete200);
		System.out.println("Billletes de 100: " + ((cuenta % Fase1.billete500)%Fase1.billete200)/Fase1.billete100);
		//To simplify, the rest it's the same if I can get the same amount with only one banknote
		System.out.println("Billletes de 50: " + (cuenta%Fase1.billete100)/Fase1.billete50);
		System.out.println("Billletes de 20: " + (cuenta%Fase1.billete50)/Fase1.billete20);
		System.out.println("Billletes de 10: " + ((cuenta%Fase1.billete50)%Fase1.billete20)/Fase1.billete10);
		System.out.println("Billletes de 5: " + (cuenta%10)/Fase1.billete5);
		
	}

}
