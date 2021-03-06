package zoologico;
import java.util.Scanner;

import animal.Anfibios;
import animal.Aves;
import animal.Mamifero;
import animal.Reptiles;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("l-Bienvenido al Menu del Zoologico-l");
		System.out.println("l----------------------------------l");
		System.out.println("l------Selecciona una Opcion:------l");
		System.out.println("l----------------------------------l");
		System.out.println("l------------1.Anfibios------------l");
		System.out.println("l------------2.Reptiles------------l");
		System.out.println("l------------3.Aves----------------l");
		System.out.println("l------------4.Mamiferos-----------l");
		System.out.println("l----------------------------------l");
		System.out.println("l------------5.Agregar Animales----l");
		System.out.println("l------------6.Mostrar Animales----l");
		System.out.println("l----------------------------------l");
		System.out.println("l------------7.Salir---------------l");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
	
		Anfibios Anf= new Anfibios(null, menu, menu, null);
		Reptiles Rep = new Reptiles(null, menu, menu, null);
		Aves Av = new Aves(null, menu, menu, null);
		Mamifero Maf = new Mamifero(null, menu, menu, null);
		
		switch(menu) {
			case 1: 
				System.out.println("Se selecciono la Opcion Anfibios: ");
				System.out.println("Los Anfibios dentro del Zoologico son: ");
				Anf.Rana();
				Anf.Sapo();
				Anf.getNombreAnimal();
				break;
			case 2:
				System.out.println("Se selecciono la Opcion Reptiles: ");
				System.out.println("Los Reptiles dentro del Zoologico son: ");
				Rep.Cocodrilo();
				Rep.Caiman();
				Rep.Aligator();
				Rep.Iguana();
				Rep.Tortuga();
				Rep.getNombreAnimal();
				break;
			case 3: 
				System.out.println("Se selecciono la Opcion Aves: ");
				System.out.println("Los Aves dentro del Zoologico son: ");
				Av.Albatros();
				Av.Cotorras();
				Av.Gansos();
				Av.Patos();
				Av.Tucanes();
				Av.getNombreAnimal();
				break;
			case 4:
				System.out.println("Se selecciono la Opcion Mamiferos: ");
				System.out.println("Los Mamiferos dentro del Zoologico son: ");
				Maf.Chimpance();
				Maf.Elefantes();
				Maf.Focas();
				Maf.Jaguar();
				Maf.Jirafa();
				Maf.Osos();
				Maf.getNombreAnimal();
				break;
			case 5: 
				System.out.println("Se selecciono la Opcion Agregar Animales: ");
				System.out.println(" ");
				System.out.println("l------Selecciones que tipo de Animal desea agregar: ------------l");
				System.out.println("l----------------------0.Anfibios--------------------------------l");
				System.out.println("l----------------------1.Reptiles--------------------------------l");
				System.out.println("l----------------------2.Aves------------------------------------l");
				System.out.println("l----------------------3.Mamiferos-------------------------------l");
				Scanner ss = new Scanner(System.in);
				int opcion = ss.nextInt();
				Scanner s1= new Scanner(System.in);
				
				if(opcion == 0) {
					System.out.println("Agrege el Nombre del Anfibio: ");
					System.out.println(" ");
					Anf.nombreAnimal = s1.nextLine();
					Anf.setNombreAnimal(Anf.nombreAnimal);
					System.out.println("Se Agrego El Anfibio  a la lista: " + Anf.nombreAnimal);
					System.out.println(Anf.nombreAnimal);
					Anf.Rana();
					Anf.Sapo();
				}else if(opcion == 1) {
					System.out.println("Agrege el Nombre del Reptil: ");
					System.out.println(" ");
					Rep.nombreAnimal = s1.nextLine();
					Rep.setNombreAnimal(Rep.nombreAnimal);
					System.out.println("Se Agrego El Reptil  a la lista: " + Rep.nombreAnimal);
					System.out.println(Rep.nombreAnimal);
					Rep.Cocodrilo();
					Rep.Caiman();
					Rep.Aligator();
					Rep.Iguana();
					Rep.Tortuga();
				}else if(opcion == 2) {
					System.out.println("Agrege el Nombre del Ave: ");
					System.out.println(" ");
					Av.nombreAnimal = s1.nextLine();
					Av.setNombreAnimal(Av.nombreAnimal);
					System.out.println("Se Agrego El Ave  a la lista: " + Av.nombreAnimal);
					System.out.println(Av.nombreAnimal);
					Av.Albatros();
					Av.Cotorras();
					Av.Gansos();
					Av.Patos();
					Av.Tucanes();
				}else if (opcion == 3) {
					System.out.println("Agrege el Nombre del Mamifero: ");
					System.out.println(" ");
					Maf.nombreAnimal = s1.nextLine();
					Maf.setNombreAnimal(Maf.nombreAnimal);
					System.out.println("Se Agrego El Mamifero  a la lista: " + Maf.nombreAnimal);
					System.out.println(Maf.nombreAnimal);
					Maf.Chimpance();
					Maf.Elefantes();
					Maf.Focas();
					Maf.Jaguar();
					Maf.Jirafa();
					Maf.Osos();
				}else {
					System.out.println("Opcion No valida");
				}
				break;
			case 6:
				System.out.println("Se selecciono la Opcion Mostrar Animales: ");
				System.out.println("Los Animales dentro del Zoologico son: ");
				Anf.Rana();
				Anf.Sapo();
				Anf.setNombreAnimal(Anf.nombreAnimal);
				Rep.Cocodrilo();
				Rep.Caiman();
				Rep.Aligator();
				Rep.Iguana();
				Rep.Tortuga();
				Rep.setNombreAnimal(Rep.nombreAnimal);
				Av.Albatros();
				Av.Cotorras();
				Av.Gansos();
				Av.Patos();
				Av.Tucanes();
				Av.setNombreAnimal(Av.nombreAnimal);				
				Maf.Chimpance();
				Maf.Elefantes();
				Maf.Focas();
				Maf.Jaguar();
				Maf.Jirafa();
				Maf.Osos();
				Av.setNombreAnimal(Av.nombreAnimal);
				break;
			case 7:
				System.out.println("Se selecciono la Opcion Salir ");
				break;
			default:
				System.out.println("Opcion Invalida");
				break;	
		}
		
	}

}
