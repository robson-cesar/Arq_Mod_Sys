package br.edu.fsma.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitor {
	
	private String caminho;
	
	public Leitor (String caminho) {
		this.caminho=caminho;
	}
	public void lerArquivo() throws IOException {
		FileInputStream stream = new FileInputStream(this.caminho);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
	}

}
