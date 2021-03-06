package animal;

import zoologico.Animal;

public class Reptiles extends Animal {

	public Reptiles(String nombreAnimal, float pesoAnimal, float alturaAnimal, String colorAnimal) {
		super(nombreAnimal, pesoAnimal, alturaAnimal, colorAnimal);
	}
	
	public void Cocodrilo () {
		System.out.println("Cocodrilo");
	}
	
	public void Aligator() {
		System.out.println("Aligator");
	}
	
	public void Caiman() {
		System.out.println("Caiman");
	}
	
	public void Iguana() {
		System.out.println("Iguana");
	}
	
	public void Tortuga() {
		System.out.println("Tortuga");
	} 
	
	@Override
	public void Comer() {

		super.Comer();
	}

	@Override
	public void Dormir() {
	
		super.Dormir();
	}

	@Override
	public void Moverse() {

		super.Moverse();
	}


}
