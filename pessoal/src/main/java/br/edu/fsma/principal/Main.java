package br.edu.fsma.principal;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

import br.edu.fsma.model.model.Pessoa;
import br.edu.fsma.service.Leitor;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Main main = new Main();
		main.init();
		Leitor leitor = new Leitor("src/main/resources/FiscalizacaoX.csv");
		leitor.lerArquivo();
		System.exit(0);		
	}

	private void init() {
		Pessoa.getTeste();
		Pessoa.getTeste();
		Pessoa.getTeste();
		Pessoa pessoa = new Pessoa("Ana Maria",LocalDate.of(2000, Month.SEPTEMBER, 30),false);
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getDataNascimento());
	}

}
