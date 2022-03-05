
import java.util.Arrays;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam, vet[], aux[];
        System.out.println("Entre com um tamanho ímpar para lista: ");
        tam = sc.nextInt();
        vet = new int[tam];
        aux = new int[tam];
        int mediana = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Entre com valores para prencher a lista: ");
            vet[i] = sc.nextInt();

            aux[i] = vet[i];
        }
        // ordenando
        Arrays.sort(aux);
        System.out.println("lista ordenada " + Arrays.toString(aux));

        // achando a mediana
        for (int i = 0; i < aux.length / 2; i++) {
            mediana = aux[i + 1];

        }
        System.out.println("mediana " + mediana);

    }
}
