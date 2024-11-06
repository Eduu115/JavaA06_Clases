package javavean;
//NO ES EJECUTABLE, NO ES MAIN, ES UNA CLASE NORMAL QUE SIMPLEMENTE ESTA AHI
public class Empleado {

	private int codigo;
	private String nombre;
	private String apellidos;
	private double salarioMensual;
	private double complementos;
	private int numeroHijos;
	
	public Empleado(int codigo, String apellidos, double salarioMensual, int numeroHijos) {
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.salarioMensual = salarioMensual;
		this.numeroHijos = numeroHijos;
		
		
	}
	
	public void setCodigoEmpleado(int pCodigoEmpleado) {
		codigo = pCodigoEmpleado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	public double getComplementos() {
		return complementos;
	}

	public void setComplementos(double complementos) {
		this.complementos = complementos;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	
	//Heredamos el metodo toString de la clase padre Object. Lo sobreescribimos y ahora el metodo toString (Heredado) nos devuelve lo siguiente:
	// El override es una anotacion, sobreescribir, que garantiza que la cabecera de el metodo cualsea es la del metodo de su padre.
	// el atributo super invoca el metodo superior, el que esta por encima de un metodo , es decir, del que se ha heredado, invoca el de su padre
	
	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salarioMensual="
				+ salarioMensual + ", complementos=" + complementos + ", numeroHijos=" + numeroHijos + "]" + super.toString();
	}
	
	
}
