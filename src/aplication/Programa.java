package aplication;

import entities.Produto;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Produto A = new Produto();

        System.out.print("Nome do Produto: ");
        A.nome = scan.nextLine();
        System.out.print("Preço do Produto: ");
        A.preco = scan.nextDouble();
        System.out.print("Quantidade: ");
        A.quantidade = scan.nextInt();

        System.out.println(A);

        int opcao = 1;

        while (opcao != 0) {
            System.out.println("Digite 1 - Realizar venda\nDigite 2 - Realizar compra\nDigite 0 - Sair");
            opcao = scan.nextInt();

                if (opcao == 1) {
                    System.out.print("Quantidade a vender: ");
                    int venda = scan.nextInt();
                    A.removeProduto(venda);
                } else if (opcao == 2) {
                    System.out.print("Quantidade a comprar: ");
                    int compra = scan.nextInt();
                    A.addProduto(compra);
                }
            if (opcao == 0) {
                System.out.println("Programa finalizado");
            } else {
                System.out.println(A);
            }
        }
            scan.close();
    }
}
