package atividade2;

import java.util.Scanner;

public class ContandoA {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String palavra = sc.nextLine();

        int quantidade = contarLetraA(palavra);

        if (quantidade > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) existe na string.");
            System.out.println("Ela aparece " + quantidade + " vezes.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não existe na string.");
        }

        sc.close();
    }

    public static int contarLetraA(String palavra) {
        int x = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'A') {
                x++;
            }
        }

        return x;
    }
}
