package clase_empleado;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// solicito el numero de empleados al usuario
		System.out.print("Ingrese el número total de empleados (máximo 20): ");
		int numEmpleados = scanner.nextInt();
		if (numEmpleados > 20)
			numEmpleados = 20;

		// creo un array para almacenar todos los empleados que me pida el usuario
		Empleado[] empleados = new Empleado[numEmpleados];

		// cojo los datos de cada empleado que me mete el usuario
		for (int i = 0; i < numEmpleados; i++) {
			System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");
			System.out.print("NIF: ");
			String nif = scanner.next();
			System.out.print("Nombre: ");
			String nombre = scanner.next();
			System.out.print("Sueldo Base: ");
			double sueldoBase = scanner.nextDouble();
			System.out.print("Horas Extra Realizadas: ");
			int horasExtra = scanner.nextInt();
			System.out.print("Tipo IRPF (%): ");
			double tipoIRPF = scanner.nextDouble();
			System.out.print("Casado (true/false): ");
			boolean casado = scanner.nextBoolean();
			System.out.print("Número de Hijos: ");
			int numHijos = scanner.nextInt();

			// creo el objeto empleado y lo pongo en la array
			empleados[i] = new Empleado(nif, nombre, sueldoBase, horasExtra, tipoIRPF, casado, numHijos);
		}

		// solicito el dato de la hora extra
		System.out.print("Ingrese el importe por hora extra: ");
		double importeHoraExtra = scanner.nextDouble();
		Empleado.setImporteHoraExtra(importeHoraExtra);

		// muestro el sueldo neto de cada empleado
		System.out.println("\nDatos de los empleados:");
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
		}
		// cierroscanner
		scanner.close();
	}
}