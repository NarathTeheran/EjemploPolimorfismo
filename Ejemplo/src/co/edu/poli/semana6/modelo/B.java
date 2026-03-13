package co.edu.poli.semana6.modelo;

public class B extends A{
	private String composicion;
	
	public B(String id, String nombre, String composicion) {
		super(id, nombre);
		this.composicion = composicion;
	}

	public String getComposicion() {
		return composicion;
	}

	public void setComposicion(String composicion) {
		this.composicion = composicion;
	}
	
	public int ope(int i ) {
		return 5*i;
	}

	@Override
	public String toString() {
		return "B [composicion=" + composicion + "]";
	}
	

}
