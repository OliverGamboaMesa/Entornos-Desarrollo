package clase_empleado;

class Empleado {
	// creo atributos privados
	private String nif;
	private String nombre;
	private double sueldoBase;
	private int horasExtra;
	private double tipoIRPF;
	private boolean casado;
	private int Hijos;

	// creo el atributo estatico que me pide el ejercicio
	private static double importeHoraExtra;

	// creo constructor por defecto
	public Empleado() {
	}

	// creo constructor con todos los parámetros menos el importe de la hora extra
	public Empleado(String nif, String nombre, double sueldoBase, int horasExtra, double tipoIRPF, boolean casado,
			int Hijos) {
		this.nif = nif;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horasExtra = horasExtra;
		this.tipoIRPF = tipoIRPF;
		this.casado = casado;
		this.Hijos = Hijos;
	}

	// creo metodos getters y setters de los atributos
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public double getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getHijos() {
		return Hijos;
	}

	public void setHijos(int Hijos) {
		this.Hijos = Hijos;
	}

	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}

	// creo método para calcular el complemento correspondiente de las horas extra
	public double calcularComplementoHorasExtra() {
		return horasExtra * importeHoraExtra;
	}

	// creo método para calcular el sueldo bruto del empleado
	public double calcularSueldoBruto() {
		return sueldoBase + calcularComplementoHorasExtra();
	}

	// creo método para calcular la retención por IRPF
	public double calcularRetencionIRPF() {
		double porcentajeIRPF = tipoIRPF;
		if (casado) {
			porcentajeIRPF -= 2;
		}
		porcentajeIRPF -= Hijos;
		return calcularSueldoBruto() * porcentajeIRPF / 100;
	}

	// creo método para calcular el sueldo neto
	public double calcularSueldoNeto() {
		return calcularSueldoBruto() - calcularRetencionIRPF();
	}

	// creo un método toString para mostrar la información del empleado como yo
	// describa
	@Override
	public String toString() {
		return nif + " " + nombre + " \nSueldo Base: " + sueldoBase + "\nHoras Extras: " + horasExtra + "\ntipo IRPF: "
				+ tipoIRPF + "\nCasado: " + (casado ? "S" : "N") + "\nNúmero de Hijos: " + Hijos + "\nSueldo Neto: "
				+ calcularSueldoNeto();
	}
}
