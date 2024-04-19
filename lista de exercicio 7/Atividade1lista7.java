import java.util.Scanner;
 public class Atividade1lista7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Double[] temperaturas = new Double[12];
    String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    
    for ( int i = 0; i < meses.length; i++){

    System.out.println("Digite a temperatura do mês " + (i + 1) + ":");
    temperaturas[i] = scanner.nextDouble();  
    }

    Double soma = 0.0;
    for( Double temperatura : temperaturas){
    soma += temperatura;
    }

    Double media = soma / temperaturas.length;

    for( int i = 0; i < temperaturas.length; i++){
        if( temperaturas[i] > media){
        System.out.println(meses[i] + " (" + (i + 1) + ") - " + temperaturas[i] + "°C");
    }
    }
     


    scanner.close();
 }
 }