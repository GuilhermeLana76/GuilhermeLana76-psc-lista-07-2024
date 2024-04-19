import java.util.Scanner;
public class Atividade2lista7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Favor Responda as perguntas a baixo");
        System.out.println("Telefonou para a vítima?");
        System.out.println("1 - sim   2 - não");
        int resposta = scanner.nextInt();

        int suspeito = 0;

        while( resposta != 1 && resposta != 2){

            System.out.println("Favor ensira uma resposta Válida.");
            resposta = scanner.nextInt();

        }

        if( resposta == 1 ){

            suspeito++;

        }

        System.out.println("Esteve no local do crime?");
        System.out.println("1 - sim   2 - não");
        int resposta2 = scanner.nextInt();

        while( resposta2 != 1 && resposta2 != 2){

            System.out.println("Favor ensira uma resposta Válida.");
            resposta2 = scanner.nextInt();

        }

        if( resposta2 == 1 ){

            suspeito++;

        }

        System.out.println("Mora perto da vítima?");
        System.out.println("1 - sim   2 - não");
        int resposta3 = scanner.nextInt();

        while( resposta3 != 1 && resposta3 != 2){

            System.out.println("Favor ensira uma resposta Válida.");
            resposta3 = scanner.nextInt();

        }

        if( resposta3 == 1 ){

            suspeito++;

        }

        System.out.println("Devia para a vítima?");
        System.out.println("1 - sim   2 - não");
        int resposta4 = scanner.nextInt();

        while( resposta4 != 1 && resposta4 != 2){

            System.out.println("Favor ensira uma resposta Válida.");
            resposta4 = scanner.nextInt();

        }

        if( resposta4 == 1 ){

            suspeito++;

        }

        System.out.println("Já trabalhou com a vítima?");
        System.out.println("1 - sim   2 - não");
        int resposta5 = scanner.nextInt();

        while( resposta5 != 1 && resposta5 != 2){

            System.out.println("Favor ensira uma resposta Válida.");
            resposta4 = scanner.nextInt();

        }

        if( resposta5 == 1 ){

            suspeito++;

        }


        if( suspeito >= 0 && suspeito <= 1){
            System.out.println("Suspeito inocentado");
        }

        if( suspeito == 2 ){
            System.out.println("Individuo Suspeito");
        }

        if( suspeito == 3 && suspeito == 4){
            System.out.println("Individuo Cumplice");
        }

        if( suspeito == 5 ){
            System.out.println("Assassino!!");
        }
        
        scanner.close();
    }
    
}
