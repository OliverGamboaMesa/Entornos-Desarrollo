package Calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		double numero1, numero2, resultado;
		do {
			System.out.println("----- Menú Calculadora -----");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			System.out.print("Elija una opción: ");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Ingrese el primer número: ");
				numero1 = scanner.nextDouble();
				System.out.print("Ingrese el segundo número: ");
				numero2 = scanner.nextDouble();
				resultado = numero1 + numero2;
				System.out.println("El resultado de la suma es: " + resultado);
				break;
			case 2:
				System.out.print("Ingrese el primer número: ");
				numero1 = scanner.nextDouble();
				System.out.print("Ingrese el segundo número: ");
				numero2 = scanner.nextDouble();
				resultado = numero1 - numero2;
				System.out.println("El resultado de la resta es: " + resultado);
				break;
			case 3:
				System.out.print("Ingrese el primer número: ");
				numero1 = scanner.nextDouble();
				System.out.print("Ingrese el segundo número: ");
				numero2 = scanner.nextDouble();
				resultado = numero1 * numero2;
				System.out.println("El resultado de la multiplicación es: " + resultado);
				break;
			case 4:
				System.out.print("Ingrese el primer número: ");
				numero1 = scanner.nextDouble();
				System.out.print("Ingrese el segundo número: ");
				numero2 = scanner.nextDouble();
				if (numero2 == 0) {
					System.out.println("Error: No se puede dividir entre cero.");
				} else {
					resultado = numero1 / numero2;
					System.out.println("El resultado de la división es: " + resultado);
				}
				break;
			case 0:
				System.out.println("Saliendo de la calculadora...");
				break;
			default:
				System.out.println("Opción no válida. Por favor, elige una opción del menú.");
			}
		} while (opcion != 0);
		scanner.close();
	}
}