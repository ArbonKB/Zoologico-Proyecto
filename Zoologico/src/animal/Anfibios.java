package animal;

import zoologico.Animal;

public class Anfibios extends Animal {

	public Anfibios(String nombreAnimal, float pesoAnimal, float alturaAnimal, String colorAnimal) {
		super(nombreAnimal, pesoAnimal, alturaAnimal, colorAnimal);
	}
	
	public void Rana (){
		System.out.println("Rana");
	}
	
	public void Sapo() {
		System.out.println("Sapo");
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
