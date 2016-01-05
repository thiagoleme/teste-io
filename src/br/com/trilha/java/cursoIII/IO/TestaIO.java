package br.com.trilha.java.cursoIII.IO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TestaIO {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Scanner entrada = new Scanner(is);

		while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }

		entrada.close();
	}

}
