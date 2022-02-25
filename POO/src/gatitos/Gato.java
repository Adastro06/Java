package gatitos;

public class Gato {
	
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	
	//getter y setter (Todos deben ser publicos)
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int patas) {
		
		if (patas >=0 && patas <=4) {
			this.patas=patas;
		} else {
			throw new IllegalArgumentException("El numero de paras no es valido");
		}
		
		//this.patas = patas;
	}
	
	public boolean isAdoptado() {  //is porque hace una pregunta
		return this.adoptado;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}


	
	//hacer privado los atributos se hacen con private pero antes de "String e int" como se ve en la parte de arriba
	
}
