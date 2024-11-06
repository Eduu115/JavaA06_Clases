package tests;

import javavean.Empleado;

//esta si tiene main, si se ejecuta
public class TestEmpleado {
	
	public static void main(String[] args) {
		
		
	/*	
	 * Empleado empleado2 = new Empleado();
	 * System.out.println(empleado.apellidos);
	 * System.out.println(empleado.salarioMensual);
	 */
	
		Empleado empleado = new Empleado(115,"Raphaelly", 11000, 2);
		
		empleado.setCodigo(120);
		empleado.setNombre("Esteban");	
		empleado.setApellidos("Garcia Guti");
		empleado.setSalarioMensual(2500);
		empleado.setComplementos(500);
		empleado.setNumeroHijos(2);
		
		// Se puede omitir el toString porque el metodo println siempre va a invocar 
		// (SI IMPRIMIMOS UNA VARIABLE DE TIPO CLASE) el metodo por defecto que tienen todos, es decir, toString 
		System.out.println(empleado.toString());
		System.out.println(empleado);
	
	}
}