package ejercicio4;
import java.util.*;
public class Fase2 {
	//public static ArrayList<String> platosPedidos;
	static ArrayList<String> ejecutar() {
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i< Fase1.platos.length; i++) {
			//Introducimos con un bucle for por teclado los valores de las variables en el array
			System.out.println("Introduce el plato");
			Fase1.platos[i] = entrada.nextLine();
			System.out.println("Introduce su precio");
			Fase1.precios[i] = entrada.nextInt();
			entrada.nextLine();
		}
		boolean seguirPidiendo = true;//mientras quiera seguir pidiendo
		//Creamos una lista de los productos que haya pedido
		ArrayList<String> platosPedidos = new ArrayList<String>();
		//Variable auxiliar para saber si quiere seguir pidiendo
		int pedir;
		while(seguirPidiendo) {
			System.out.println("Qu� quieres pedir ahora");
			for (int i = 0; i < Fase1.platos.length; i++) {
				System.out.println(Fase1.platos[i] + " : " + Fase1.precios[i]);
				//System.out.println(" : " + Fase1.precios[i]);
			}
			platosPedidos.add(entrada.nextLine());
			System.out.println("Quiere seguir pidiendo \n1: Si\n 2: No");
			pedir = entrada.nextInt();
			entrada.nextLine();//La introduzco para poder pedir la siguiente l�nea
			if (pedir  == 1) {
				seguirPidiendo = true;
			}else if (pedir == 2) {
				seguirPidiendo = false;
			}
		}
		entrada.close();
		return platosPedidos;
	}
}
