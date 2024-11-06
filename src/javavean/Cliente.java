package javavean;

public class Cliente {

	private String cif ;
	private String nombre;
	private double facturacionAnual;
	private int numeroEmpleados;
	
	
	public Cliente(String cif, String nombre, double facturacionAnual, int numeroEmpleados) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.facturacionAnual = facturacionAnual;
		this.numeroEmpleados = numeroEmpleados;
	}
	
	public Cliente() {
		super();
	}
	


}
