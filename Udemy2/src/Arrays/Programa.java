package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       Produtos[] vect = new Produtos[n];

       for(int i = 0; i < n; i++){
           sc.nextLine();
           String name = sc.nextLine();
           double price = sc.nextDouble();
           vect[i] = new Produtos(name, price);
       }

       double soma = 0;
       for(int i = 0; i < n; i++){
           soma += vect[i].getPrice();
       }
       double media = soma / n;
        System.out.println("Média: " + media);

        sc.close();
    }
}
