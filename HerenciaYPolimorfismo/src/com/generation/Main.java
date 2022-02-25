package com.generation;

public class Main 
{
	public static void main(String[] args)
	{
		/*Herencia: cuando una clase hereda de otra,
		esta tiene acceso a sus atributos y metodos
		*/
		/*Polimorfismo: nos sirve para cambiar los metodos y se comporte de forma distinta
		 */
		
		Cuadrado cuadrado1 = new Cuadrado();
		//cuadrado1.setNombre = ("Cuadrado"); //no se puede acceder a la variable nombre a si que se accede al metodo setNombre por que nombre se puso como privado
		System.out.println(cuadrado1.getNombre());// se coloca el metodo getNombre para obtener la variable nombre que se hizo privada en figvuras geometricas
		cuadrado1.setAlto(10);
		cuadrado1.setLargo(10);
		System.out.println("El area del " + cuadrado1.getNombre()+ "es:  " + cuadrado1.CalcularArea());
		
	
		
		
	
	}
}
