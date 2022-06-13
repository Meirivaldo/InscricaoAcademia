package Academia;

import java.util.Random;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String nome;
            int id;
            int idade;

            System.out.println("Digite seu nome: ");
            nome = scan.next();

            System.out.println("Seja bem-vindo " + nome + "!");

            System.out.println("A inscrição é só para maiores de idade!" + "\n" + "Agora digite sua idade: " );

            idade = scan.nextInt();

            if (idade <17) {
                System.out.println("Infelizmente a matricula é só para maiores de idade!" + "\n" + "Até Breve!");
                System.exit(2);
             }else{
                System.out.println("Obrigado pela informação!");

            }

            System.out.println("Olá " + nome + ", seja muito bem vindo(a) ao nosso ambiente de inscrição!");
            System.out.println("Antes de começarmos precisamos que você aceite as nossas politicas de privacidade e acesso as informações.");
            System.out.println("Para isto, acesse nosso link (link de acesso).");
            System.out.println("Digite 1 se você leio e aceita as nossas politicas ou 2 caso não aceite:");
            int aceite;

            aceite = scan.nextInt();
            if (aceite == 1){
                System.out.println("Perfeito, agora que você já aceitou as nossas politicas, estaremos gerando seu numero de matricula, aguarde por favor!");

            }else{
                System.out.println("E uma pena, nos veremos em breve");
                 System.exit(2);
            }

            Random random = new Random();

            int matr = random.nextInt(99999);
            System.out.println("Sua matriucla é:  ");
            System.out.println("22." + matr);

            System.out.println("É importante anotar essa matricula, pois ela é o seu cadastro junto ao nosso sistema,");
            System.out.println("E será solicitada toda vez que acessar o nosso ambiente interno.");

            System.out.println("Agora aguarde o seu comprovante de inscrição junto com o boleto para pagamento.");

            System.out.println("----------------------------------------");
            System.out.println("Nome: " + nome);
            System.out.println("----------------------------------------");
            System.out.println("Idade: " + idade);
            System.out.println("----------------------------------------");
            System.out.println("Número de inscrição: 22." + matr);
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("Taxa de inscrição");
            System.out.println("----------------------------------------");
            System.out.println("Cód de barras");
            System.out.println("36013.1083.1230.1239.1209.8.890000005990");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");

        }
            }



