import java.util.ArrayList;
import java.util.Scanner;

    public class Atividade4lista7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList<Double>();

        System.out.println("Porfavor ensira a quantidade de vendedores");  
        int funcionarios = scanner.nextInt();
        System.out.println("Agora ensira as vendas brutas desses vendedores e quantas semanas foram trabalhadas.");

        for(int i = 0; i < funcionarios; i++){
        System.out.println("vendas vendedor " + (i+1) + " :");
        Double valor = scanner.nextDouble();
        System.out.println("Semanas trabalhadas vendedor " + (i+1) + ": ");
        int semanas = scanner.nextInt();

        Double pagamento = ( semanas * 200 ) + (valor * 0.09);
        salarios.add(pagamento);
        }

        ArrayList<Integer> contadores = new ArrayList<>(9);
        for (int i = 0; i < 9; i++) {
            contadores.add(0);
        }

        for (Double valor : salarios) {
        if( valor >= 200 && valor <= 299 ){
            contadores.set(0, contadores.get(0) + 1);
        }
        if( valor >= 300 && valor <= 399 ){
            contadores.set(1, contadores.get(1) + 1);

        }
        if( valor >= 400 && valor <= 499 ){
            contadores.set(2, contadores.get(2) + 1);

        }
        if( valor >= 500 && valor <= 599 ){
            contadores.set(3, contadores.get(3) + 1);

        }
        if( valor >= 600 && valor <= 699 ){
            contadores.set(4, contadores.get(4) + 1);

        }
        if( valor >= 700 && valor <= 799 ){
            contadores.set(5, contadores.get(5) + 1);

        }
        if( valor >= 800 && valor <= 899 ){
            contadores.set(6, contadores.get(6) + 1);

        }
        if( valor >= 900 && valor <= 999 ){
            contadores.set(7, contadores.get(7) + 1);

        }
        if( valor >= 1000){
            contadores.set(8, contadores.get(8) + 1);

        }}

        System.out.println("Número de vendedores em cada faixa salarial:");
        System.out.println("$200 - $299: " + contadores.get(0));
        System.out.println("$300 - $399: " + contadores.get(1));
        System.out.println("$400 - $499: " + contadores.get(2));
        System.out.println("$500 - $599: " + contadores.get(3));
        System.out.println("$600 - $699: " + contadores.get(4));
        System.out.println("$700 - $799: " + contadores.get(5));
        System.out.println("$800 - $899: " + contadores.get(6));
        System.out.println("$900 - $999: " + contadores.get(7));
        System.out.println("$1000 e acima: " + contadores.get(8));

        scanner.close();
    }
}
        



    

