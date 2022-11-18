//Clase Empleado

public class Empleado {
	
//Atributos privados:
	
	private String Nombre;
	private String Apellido;
	private String Direccion;
	private int Dni;
	private float salario;
	private char sexo;
	
	//Constantes de visibilidad protected:
	
	final protected double SALARIO_MINIMO = 980000;
	final protected double DESCUENTO_EPS = 4;
	final protected double DESCUENTO_FP = 4;
	
	//Metodos constructores:
	
	public Empleado(String nombre, String apellido, String direccion, int dni, float salario, char sexo) {
		Nombre = nombre;
		Apellido = apellido;
		Direccion = direccion;
		Dni = dni;
		this.salario = salario;
		this.sexo = sexo;
	}

	public Empleado(String nombre, String apellido, String direccion, int dni, float salario) {
		Nombre = nombre;
		Apellido = apellido;
		Direccion = direccion;
		Dni = dni;
		this.salario = salario;
	}

	public Empleado(String direccion, int dni, char sexo) {
		Direccion = direccion;
		Dni = dni;
		this.sexo = sexo;
	}

	public Empleado(String nombre, String apellido, int dni, float salario, char sexo) {
		Nombre = nombre;
		Apellido = apellido;
		Dni = dni;
		this.salario = salario;
		this.sexo = sexo;
	}

	public Empleado() {
	}

	//Metodos getter and setter:
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
}

	
