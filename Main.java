package arreglo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int arregloA [] = new int [6];
		int arregloB [] = new int [6];
		int arregloC [] = new int [12];

		
		for(int i=0; i<6; i++) {
			System.out.println("Ingresa el numero para la A " + (i+1));
			arregloA[i] = entrada.nextInt();
		}
		
		for(int i=0; i<6; i++) {
			System.out.println("Ingresa el numero para la B " + (i+1));
			arregloB[i] = entrada.nextInt();
		}
		
		int j=0;
		
		while (j<12) {
				for (int k =0; k<3; k++) {
					arregloC[j] = arregloA[k];
					j++;
				}
				for (int k=0; k<3; k++ ) {
					arregloC[j] = arregloB[k];
					j++;
				}
			}
			


		System.out.println("Mostrando");
		for(int i = 0; i<12; i++) {
			System.out.println(arregloC[i] + " ");
		}
	}

}
