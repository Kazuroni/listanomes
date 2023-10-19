package listanomes;

import java.util.Scanner;

public class listanomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " nome: ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite um nome para verificar se esta na lista: ");
        String nomeVerificar = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (nomes[i].equalsIgnoreCase(nomeVerificar)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(nomeVerificar + " esta na lista de nomes.");
        } else {
            System.out.println(nomeVerificar + " nao esta na lista de nomes.");
        }

        scanner.close();
    }
}
