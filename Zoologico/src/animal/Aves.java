package animal;

import zoologico.Animal;

public class Aves extends Animal implements Vuelo{

	public Aves(String nombreAnimal, float pesoAnimal, float alturaAnimal, String colorAnimal) {
		super(nombreAnimal, pesoAnimal, alturaAnimal, colorAnimal);
	}
	
	public void Patos() {
		System.out.println("Patos");
	}
	
	public void Cotorras() {
		System.out.println("Cotorras");
	}
	
	public void Gansos() {
		System.out.println("Gansos");
	}
	
	public void Tucanes () {
		System.out.println("Tucanes");
	}
	
	public void Albatros() {
		System.out.println("Albatros");
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
	
	@Override
	public void volar() {
		System.out.println("El Ave puede volar");
		
	}


}
