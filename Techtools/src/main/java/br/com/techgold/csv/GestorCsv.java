package br.com.techgold.csv;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import br.com.techgold.model.Conta;

public class GestorCsv {
	
	public static void main(String[] args) throws IOException {
		//lerCsv("/home/aas/AmbienteDev/CSV/365.csv");
	}
	
	public List<Conta> lerCsv(String caminho) throws IOException {
	
		Reader reader = Files.newBufferedReader(Paths.get(caminho.replace("\"", "").trim()));
		CsvToBean<Conta> csvToBean = new CsvToBeanBuilder(reader)
				.withType(Conta.class)
				.build();
		
		List<Conta> contas = csvToBean.parse();
		/*for (Conta conta : contas) {
			if(conta.getAliases() != null) {
				System.out.println();
				System.out.println(conta.getNomeExibicao());
				System.out.println(conta.getEmail());
				System.out.println(conta.getStatusCaixa());
				System.out.println(conta.getTipoDeCaixa());
				System.out.println(conta.getStatusMFA());
				System.out.println(conta.getVolumeCaixa());
				System.out.println();
			}
		}*/
		System.out.println("Total de contas: " + contas.size());
		return contas;
	}
	
}
