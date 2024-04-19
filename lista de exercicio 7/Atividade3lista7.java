import java.util.Scanner;

public class Atividade3lista7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int quantidadeValores = 0;
        double somaValores = 0;
        int valoresAcimaMedia = 0;
        int valoresAbaixoSete = 0;


        System.out.println("Digite as notas (digite -1 para encerrar):");
        double nota = scanner.nextDouble();

        while (nota != -1) {
            quantidadeValores++;
            somaValores += nota;

            if (nota > 7) {
                valoresAcimaMedia++;
            }

            if (nota < 7) {
                valoresAbaixoSete++;
            }

            nota = scanner.nextDouble();
        }


        double media = somaValores / quantidadeValores;


        System.out.println("\nQuantidade de valores lidos: " + quantidadeValores);
        System.out.println("Valores informados (na ordem): " + somaValores);
        System.out.println("Valores informados (na ordem inversa):");
        System.out.println("Soma dos valores: " + somaValores);
        System.out.println("Média dos valores: " + media);
        System.out.println("Quantidade de valores acima da média: " + valoresAcimaMedia);
        System.out.println("Quantidade de valores abaixo de sete: " + valoresAbaixoSete);
        System.out.println("\nPrograma encerrado. Obrigado!");

        scanner.close();
    }
}