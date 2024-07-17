import java.util.Scanner;

public class intersecao {
    public static void main(String[] args) {// psvm (tab) ou enter
        int qtdA, qtdB;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do primeiro vetor: ");
        qtdA = scanner.nextInt();

        int[] vetA = new int[qtdA];

        System.out.print("Digite o tamanho do segundo vetor: ");
         qtdB = scanner.nextInt();

        int[] vetB = new int[qtdB];

        for (int i = 0; i < qtdA; i++) {
            System.out.println("Digite o vetorA: ");
            vetA[i] = scanner.nextInt();
        }

        for (int j = 0; j < qtdB; j++) {
            System.out.println("Digite o vetorB: ");
            vetB[j] = scanner.nextInt();
        }

        for (int i = 0; i < vetA.length; i++) {
            for (int j = 0; j < vetB.length; j++) {
                if (vetA[i] == vetB[j]) {
                    System.out.println("Interseção dos vetores");
                    System.out.println(vetA[i]+ " ");
                    break;
                }
            }
        }
    }
}











