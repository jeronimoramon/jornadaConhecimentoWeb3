package br.com.programacao.jeronimo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.programacao.jeronimo.dto.AnimalDTO;

public class Main {

	public static void main(String[] args) {
		List<AnimalDTO> animalRepository = new ArrayList<>();
		animalRepository.add(new AnimalDTO("cachorro", "carnivoro", "5", "luna"));
		animalRepository.add(new AnimalDTO("cachorro", "carnivoro", "20", "zeus"));
		animalRepository.add(new AnimalDTO("gato", "carnivoro", "2", "caramelo"));
		animalRepository.add(new AnimalDTO("cavalo", "herbivoro", "500", "faisca"));
		animalRepository.add(new AnimalDTO("vaca", "herbivoro", "500", "mimoza"));
		System.out.println("filtrando os cachorros:");
		List<AnimalDTO> cachorros = animalRepository.stream().filter(animal -> animal.getRaca().equals("cachorro"))
				.collect(Collectors.toList());
		cachorros.forEach(cachorro -> System.out.println(cachorro.getNome()));
		var herbivoros = animalRepository.stream().filter(animal -> animal.getAlimentacao().equals("herbivoro"))
				.collect(Collectors.toList());
		System.out.println("animais herbivoros:");
		herbivoros.forEach(
				herbivoro -> System.out.println("raça: " + herbivoro.getRaca() + ", nome: " + herbivoro.getNome()));
		double mediaPesoCarnivoro = animalRepository.stream()
				.filter(animal -> animal.getAlimentacao().equals("carnivoro")).mapToDouble(animal -> Double.valueOf(animal.getPeso()))
				.average().getAsDouble();
		System.out.println("a média de peso dos animais carnívoros é: " + mediaPesoCarnivoro);
	}
}
