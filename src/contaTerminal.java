import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        int numero = 1121;
        String agencia = "067-2";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta da Agência !");
        int numeroDigitado = sc.nextInt();

        if(numeroDigitado == numero){
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }else{
            System.out.println("conta nao encontrada");
        }


    }
}
