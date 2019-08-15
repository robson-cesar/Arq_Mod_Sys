package br.edu.fsma.model.model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private static int contador=0;
	
	private String nome;
	private LocalDate dataNascimento;
	private Boolean casado;
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", casado=" + casado + "]";
	}
	
	public Pessoa (String nome, LocalDate dataNascimento, boolean casado) {
		this.nome=nome;
		this.dataNascimento=dataNascimento;
		this.casado=casado;
	}
	
	public int getIdade() {
		Period periodo = Period.between(this.dataNascimento, LocalDate.now());
		return periodo.getYears();
		//System.out.printf("%s anos, %s mes e %s dias",periodo.getYears(), periodo.getMonths(), periodo.getDays());
	}
	
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}
	
	public static void getTeste() {
		System.out.println("Teste!");
		Pessoa.contador++;
		System.out.println("Contador" + Pessoa.contador);
	}
}
