package br.com.trilha.java.cursoIII.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaIO {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Scanner entrada = new Scanner(is);

		OutputStream os = new FileOutputStream("saida.txt");
		PrintStream saida = new PrintStream(os);

		while (entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			System.out.println(linha);

			saida.println(linha);
		}

		saida.close();
		entrada.close();
	}

}
