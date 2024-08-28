import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, Bem vindo(a) ao JavaBanks, o seu aplicativo de banco");
        System.out.println("Digite as suas informacoes abaixo para criar uma conta: ");
        System.out.println("Qual o seu nome?");
        String nome = sc.nextLine();
        System.out.println("Qual o numero do seu CPF?");
        String cpf = sc.nextLine();
        System.out.println("Qual o seu telefone?");
        String telefone = sc.nextLine();
        Random random = new Random();
        long nconta = 1000000000L + (long)(random.nextDouble() * 9000000000L);

        System.out.println("Conta criada com sucesso, nome do cliente"+nome+" ,CPF: "+cpf+" ,Numero da conta: "+nconta);



    }
}