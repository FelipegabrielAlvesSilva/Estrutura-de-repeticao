import java.util.Scanner;

public class introdowhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float saldo = 0;
        int opção = 0;

        do {
            System.out.println("Escolha uma opção: \n1: Consultar saldo " +
                    "\n2: Depositar \n3: Sacar \n4: Sair");

            opção = entrada.nextInt();

            switch (opção) {

                case 1:
                    System.out.println("Saldo atual da conta: " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o vaor do depósito");
                    float valor = entrada.nextFloat();
                    saldo += valor;
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 3:
                    System.out.println("Informe o valor do saque");
                    valor = entrada.nextFloat();
                    if (valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Saque de " + valor + "realizado com sucesso!");
                    } else System.out.println("Saldo insuficiente");
                    break;
                case 4:
                    System.out.println("Saindo do programa");
                    break;
            }
        }while (opção != 4) ;

    }
}