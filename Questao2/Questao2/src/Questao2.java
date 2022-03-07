
import java.util.Arrays;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aux[], vet[];
        int x , tam, cont = 0, result;

        System.out.println("Entre com o valor de x: ");
        x = sc.nextInt();

        System.out.println("Entre com o tamanho do vetor: ");
        tam = sc.nextInt();
        vet = new int[tam];
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um valor para o vetor: ");
            vet[i] = sc.nextInt();

        }                   //visualizar o vetor
        System.out.println("vetor " + Arrays.toString(vet));

                            // calculo para diferença de x
        for (int j = 0; j < vet.length; j++) {
            try {
                if (vet[j] < vet[j + 1]) {
                    result = vet[j + 1] - vet[j];

                } else {
                    result = vet[j] - vet[j + 1];
                }
                if (x == result) {
                    cont = cont + 1;

                }

                sc.close();
            } catch (Exception e) {
                System.out.println("erro: Não deu tempo de descobrir essa exceção " + e);
            }
            // Apesar do erro o programa está com a saída esperada
        }
        System.out.println("Saída " + cont);
    }
}
