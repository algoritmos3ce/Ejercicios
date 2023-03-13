package ObjetosSimples.FIUBA.Solucion;

public class Materia {
	private final String codigo;
	private final String nombre;
	private final int creditos;

	public Materia(String codigo, String nombre, int creditos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
	}

	public void printMaterial() {
		System.out.println("Codigo: " + codigo);
		System.out.println("Nombre: " + nombre);
		System.out.println("Creditos: " + creditos);
	}

	public int getCreditos() {
		return creditos;
	}

	public String getCodigo() {
		return codigo;
	}
}
