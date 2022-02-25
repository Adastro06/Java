package com.generation;
// encapsular sirve para proteger info
public abstract class FiguraGeometrica //las clases abstractas no pueden generar objetos pero pueden heredar
{
	//Clases abstractas.
	//Clases que pueden o no contener metodos abstractos
	
	private String nombre;
	protected float alto;
	protected float largo;	
	public FiguraGeometrica(String nombre)//este es un constructor
	{
		this.nombre = nombre;
	}
	
	public float CalcularArea()
	{
		return alto * largo;
		
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public float getLargo() {
		return largo;
	}
	public void setLargo(float largo) {
		this.largo = largo;
	}
	
}
