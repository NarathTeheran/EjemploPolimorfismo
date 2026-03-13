package co.edu.poli.semana6.modelo;

public class C extends A{
	private int peso;

	public C(String id, String nombre, int peso) {
		super(id, nombre);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int ope(int i ) {
		return 3*i;
	}

	@Override
	public String toString() {
		return "C [peso=" + peso + "]";
	}
	

}
