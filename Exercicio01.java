package Strings;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Contagem de Vogais: Escreva um programa que conte o número de vogais em uma
		 * string fornecida pelo usuário.
		 */

		char caractere = 0;
		int contagemVogais = 0;
		String palavraFornecida;

		palavraFornecida = JOptionPane.showInputDialog(null,
				"Digite uma palavra, o programa irá contar a quantidade das vogais presentes");

		for (int i = 0; i < palavraFornecida.length(); i++) {

			caractere = palavraFornecida.charAt(i);

			palavraFornecida = palavraFornecida.toLowerCase();

			if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
				contagemVogais++;
			}
		}

		JOptionPane.showMessageDialog(null,
				"A palavra fornecida " + " " + palavraFornecida + " contém " + contagemVogais + " vogais");

	}

}
