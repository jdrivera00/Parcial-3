//Clase DesarrolladorFrontend:

public class DesarrolladorFrontend extends Empleado {

	//Atributos privados:
	
	private int añosExperienciaBootstrap;
	private boolean experienciaCloud;
	
	//Constante de visibilidad privada:
	
	final private double AUMENTO_VARIABLE = 5;
	
	//Metodos contructores:
	
	public DesarrolladorFrontend(int añosExperienciaBootstrap, boolean experienciaCloud) {
		this.añosExperienciaBootstrap = añosExperienciaBootstrap;
		this.experienciaCloud = experienciaCloud;
	}

	//Metodos getters and setters:
	
	public int getAñosExperienciaBootstrap() {
		return añosExperienciaBootstrap;
	}
	public void setAñosExperienciaBootstrap(int añosExperienciaBootstrap) {
		this.añosExperienciaBootstrap = añosExperienciaBootstrap;
	}

	public boolean isExperienciaCloud() {
		return experienciaCloud;
	}
	public void setExperienciaCloud(boolean experienciaCloud) {
		this.experienciaCloud = experienciaCloud;
	}
	
	//Herencia de atributos de empleado:
	
	public DesarrolladorFrontend (String nombre , String apellido , String direccion , int dni , float salario , char sexo ) {
		super (nombre, apellido, direccion, dni, salario, sexo);
		this.añosExperienciaBootstrap = añosExperienciaBootstrap;
		this.experienciaCloud = experienciaCloud;
	}
}
