package basicos;

import java.util.ArrayList;

import java.util.Scanner;

/**
 * TODO HACED UNA APLICACIÓN QUE PERMITA INTRODUCIR AL USUARIO SU ESTATURA EN
 * METROS Y SU PESO EN KG Y LE INFORME SU INFORME DE SU ÍNDICE DE MASA CORPORAL
 * (IMC) SEGÚN LA SIGUIENTE FÓRMULA
 * 
 * LA FÓRMULA DEL IMC = PESO KG / ESTATURA AL CUADRADO METROS * SI IMC < 16 ->>
 * su imc es DESNUTRIDO SI IMC >= 16 Y < 18 ->> su imc es DELGADO SI IMC >= 18 Y
 * < 25 ->> su imc es IDEAL SI IMC >= 25 Y < 31 ->> su imc es SOBREPESO SI IMC
 * >= 31 ->> su imc es OBESO ADEMÁS, DE DECIRLE SU IMC NUMÉRICO Y NOMINAL,
 * pista: PARA LEER DE TECLADO USAD LA CLASE SCANNER
 */

public class Imc {

	public static void main(String[] args) {
		float peso;
		float altura;
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		System.out.println("Introduzca peso: ");
		peso = scanner.nextFloat();
		System.out.println("Introduzca altura: ");
		altura = scanner.nextFloat();
		float resultado = imcCalculo(peso, altura);
		System.out.println(resultado);
		String resultado2 = descripcionImc();
		System.out.println(resultado2);

		scanner.close();

	}

// función cálculo de imc
	private static float imcCalculo(Float peso, Float altura) {

		float calculoImc = (peso / (altura * altura));

		return calculoImc;
	}

	/*
	 * SI IMC < 16 ->> * su imc es DESNUTRIDO SI IMC >= 16 Y < 18 ->> su imc es
	 * DELGADO SI IMC >= 18 Y < 25 ->> su imc es IDEAL SI IMC >= 25 Y < 31 ->> su
	 * imc es SOBREPESO SI IMC >= 31 ->> su imc es OBESO ADEMÁS, DE DECIRLE SU IMC
	 * NUMÉRICO Y NOMINAL,
	 */
	public static String descripcionImc(int ) {
		String notaAlfabetica = null;
		
		notaAlfabetica = switch (notaNumerica) {
		case 1 -> "DELGADO";
		case 2 -> "IDEAL";
		case 3 -> "SOBREPESO";
		case 4 -> "OBESO";
		default -> "ERROR";
		};

		return notaAlfabetica;
	}
}
