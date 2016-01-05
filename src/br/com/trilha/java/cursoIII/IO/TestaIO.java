package br.com.trilha.java.cursoIII.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaIO {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(
									new FileInputStream("arquivo.txt")));
		String s = br.readLine();

		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}

		br.close();
	}

}
