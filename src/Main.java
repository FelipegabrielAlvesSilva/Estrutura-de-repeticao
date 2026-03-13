import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("informe a quantidade de vezes que o dado sera lançado");
        float qtde = entrada.nextInt();

        System.out.println("informe o numero que deve acertar");
        int numero = entrada.nextInt();
        int cont=0;


        //para o numero estar de acordo com o que precisa usamos o while
        while(numero <1 || numero>6)
            System.out.println("O numero deve ser entre 1 e 6");

        for(int i=1; i <=qtde; i++){
            int ale = (int) (Math.random() *6 +1);
            System.out.println("numero lançado " +ale);
            if( ale == numero){
                cont++;
            }
        }
        System.out.println("Numero de dados sorteados " +cont);
        //para aparecer o % corretamente é necessario transformar alguma variavel em float
        System.out.println("Percentual de acertos = " + ( (float) cont / qtde) *100);

    }
}