package ObjetosSimples.FIUBA.Solucion;

public class Carrera {
	private final String nombre;
	private final Materia[] materiasObligatorias;
	private final Materia[] materiasOptativas;
	private final String codigo;
	private final int creditosNecesarios;

	public Carrera(String nombre, String codigo, Materia[] materiasObligatorias, Materia[] materiasOptativas,
			int creditosNecesarios) {
		this.nombre = nombre;
		this.materiasObligatorias = materiasObligatorias;
		this.materiasOptativas = materiasOptativas;
		this.codigo = codigo;
		this.creditosNecesarios = creditosNecesarios;
	}

	public void printCarrera() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Codigo: " + codigo);
		System.out.println("Materias Obligatorias: ");
		for (int i = 0; i < materiasObligatorias.length; i++) {
			materiasObligatorias[i].printMaterial();
		}
		System.out.println("Materias Optativas: ");
		for (int i = 0; i < materiasOptativas.length; i++) {
			materiasOptativas[i].printMaterial();
		}
		System.out.println("Creditos necesarios: " + creditosNecesarios);
	}

	public String getCodigo() {
		return codigo;
	}
}
