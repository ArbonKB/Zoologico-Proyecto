package zoologico;

public abstract class Animal {
	
	//Atributos
	public String nombreAnimal;
	public float pesoAnimal;
	public float alturaAnimal;
	public String colorAnimal;
	
	public Animal (String nombreAnimal, float pesoAnimal,float alturaAnimal, String colorAnimal) {
		this.nombreAnimal = nombreAnimal;
		this.pesoAnimal = pesoAnimal;
		this.alturaAnimal = alturaAnimal;
		this.colorAnimal = colorAnimal;
	}
	
	//Getters and Setters
	public String getNombreAnimal() {
		return nombreAnimal;
	}

	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

	public float getPesoAnimal() {
		return pesoAnimal;
	}

	public void setPesoAnimal(float pesoAnimal) {
		this.pesoAnimal = pesoAnimal;
	}

	public float getAlturaAnimal() {
		return alturaAnimal;
	}

	public void setAlturaAnimal(float alturaAnimal) {
		this.alturaAnimal = alturaAnimal;
	}

	public String getColorAnimal() {
		return colorAnimal;
	}

	public void setColorAnimal(String colorAnimal) {
		this.colorAnimal = colorAnimal;
	}
	
	//Metodos o Acciones
	public void Comer() {
		System.out.println("El Animal esta comiendo...");
	}
	
	public void Dormir() {
		System.out.println("El Animal esta durmiendo...");
	}
	
	public void Moverse() {
		System.out.println("El Animal se esta moviendo...");
	}
	
	
	
}
