//Clase DesarrolladorBackend:

public class DesarrolladorBackend extends Empleado {
	
	//Atributos privados:
	
	private String skill;
	private String listaLenguajes;
	
	//constante de visibilidad privada:
	final private double AUMENTO_VARIABLE = 5;
	
	//Metodos constructor:
	public DesarrolladorBackend(String skill, String listaLenguajes) {
		this.skill = skill;
		this.listaLenguajes = listaLenguajes;
	}

	public DesarrolladorBackend() {
		super();
	}

	//Metodos getters and setters:
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getListaLenguajes() {
		return listaLenguajes;
	}
	public void setListaLenguajes(String listaLenguajes) {
		this.listaLenguajes = listaLenguajes;
	}
	
	//Herencia de atributos de empleado:
	
	public DesarrolladorBackend (String nombre , String apellido , String direccion , int dni , float salario , char sexo ) {
		super (nombre, apellido, direccion, dni, salario, sexo);
		this.skill = skill;
		this.listaLenguajes = listaLenguajes;
	}

}
