package animal;

import zoologico.Animal;

public class Mamifero extends Animal {

	public Mamifero(String nombreAnimal, float pesoAnimal, float alturaAnimal, String colorAnimal) {
		super(nombreAnimal, pesoAnimal, alturaAnimal, colorAnimal);
	}
	public void Elefantes() {
		System.out.println("Elefante");
	}
	
	public void Osos () {
		System.out.println("Oso");
	}
	
	public void Focas () {
		System.out.println("Foca");
	}
	
	public void  Jaguar() {
		System.out.println("Jaguar");
	}
	
	public void Jirafa() {
		System.out.println("Jirafa");
	}
	
	public void Chimpance () {
		System.out.println("Chimpance");
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
