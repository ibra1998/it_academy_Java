package ejercicio4;

import java.util.ArrayList;
//import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> platosPedidos = Fase2.ejecutar();//Fase1 only contains variables used in Fase2 and Fase3
		Fase3.ejecutar(platosPedidos);
		
		
	}

}
