package Estoque;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Preço: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.println("Entre com o numero de produtos que será adicionado no estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Dados atualizados: " + product);

        System.out.println();
        System.out.println("Entre com a quantidade que será removida do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Dados atualizados: " + product);

        sc.close();
    }

}
