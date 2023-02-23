package br.com.programacao.jeronimo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor

public class AnimalDTO {
	private String raca;
	private String alimentacao;
	private String peso;
	private String nome;
}
